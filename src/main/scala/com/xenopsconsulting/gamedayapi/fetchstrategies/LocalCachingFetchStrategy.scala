package com.xenopsconsulting.gamedayapi.fetchstrategies

import scala.xml._
import java.util.Date
import dispatch._

import java.text.SimpleDateFormat
import java.io.{File, PrintWriter}
import com.amazonaws.services.s3.model.GetObjectRequest
import org.slf4j.LoggerFactory

/**
 * Caches gameday files on the local filesystem.
 */
class LocalCachingFetchStrategy(date: Date, team: String) extends CachingStrategy {
  private val _log = LoggerFactory.getLogger(getClass)

  var _path = "./scala-gameday-api-cache/"
  val _date = date
  val _team = team

  def fetchCachedFile(date: Date, path: String, fileName: String) = {
    try {
      val cachedXml = XML.loadFile(_path + localDirectory(date) + "/" + key(path, fileName))
      Some(cachedXml)
    } catch {
      case e : Throwable => {
        None
      }
    }
  }

  def cacheContent(date: Date, path: String, fileName: String, content: Elem) {
    val writer = new PrintWriter(new File(_path + localDirectory(date) + "/" + key(path, fileName)))
    writer.write(content.toString())
    writer.close()
  }

  private def localDirectory(date: Date) = {
    new SimpleDateFormat("yyyy").format(date)
  }

  private def key(path: String, fileName: String) = {
    (path + "-" + fileName).replaceAll("/", "-").replaceFirst("-", "")
  }

}
