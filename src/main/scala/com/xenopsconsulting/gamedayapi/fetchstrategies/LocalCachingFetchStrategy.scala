package com.xenopsconsulting.gamedayapi.fetchstrategies

import scala.xml._
import java.util.Date

import java.text.SimpleDateFormat
import java.io.{File, PrintWriter}

/**
 * Caches gameday files on the local filesystem.
 */
class LocalCachingFetchStrategy(date: Date, team: String) extends CachingStrategy {

  var _path = "./scala-gameday-api-cache/"
  val _date = date
  val _team = team

  def fetchCachedFile(path: String, fileName: String) = {
    try {
      val cachedXml = XML.loadFile(_path + localDirectory() + "/" + key(path, fileName))
      Some(cachedXml)
    } catch {
      case e : Throwable => {
        None
      }
    }
  }

  def cacheContent(path: String, fileName: String, content: Elem) {
    val directoryName =  _path + localDirectory()
    val directory = new File(directoryName)
    if (!directory.exists()) directory.mkdir()

    val writer = new PrintWriter(new File(directoryName + "/" + key(path, fileName)))
    writer.write(content.toString())
    writer.close()
  }

  private def localDirectory() = {
    new SimpleDateFormat("yyyy").format(date)
  }

  private def key(path: String, fileName: String) = {
    (path + "-" + fileName).replaceAll("/", "-").replaceFirst("-", "")
  }

}
