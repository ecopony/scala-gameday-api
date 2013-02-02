package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date
import dispatch._

import java.text.SimpleDateFormat
import java.io.{File, PrintWriter}

/**
 * Caches gameday files on the local filesystem. Makes no attempt to see if files have already been downloaded. Will
 * simply fetch and save.
 */
object LocalCachingFetchStrategy extends FetchStrategy {
  val _http = new Http
  var _path = "./scala-gameday-api-cache/"

  def fetchEpg(date: Date): Elem = {
    val epg = XML.loadString(_http(url(epgUrl(date)) as_str))
    cacheContent(date, datePath(date), "epg.xml", epg)
    epg
  }

  def fetchGame(date: Date, team: String, gid: String = null): Elem = {
    val game = XML.loadString(_http(url(gameUrl(date, team, gid)) as_str))
    cacheContent(date, gameDirectoryPath(date, team), "game.xml", game)
    game
  }

  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem = {
    val boxScore = XML.loadString(_http(url(boxScoreUrl(date, team, gid)) as_str))
    cacheContent(date, gameDirectoryPath(date, team), "boxscore.xml", boxScore)
    boxScore
  }

  def fetchLineScore(date: Date, team: String, gid: String = null): Elem = {
    val lineScore = XML.loadString(_http(url(lineScoreUrl(date, team, gid)) as_str))
    cacheContent(date, gameDirectoryPath(date, team), "linescore.xml", lineScore)
    lineScore
  }

  def fetchHitChart(date: Date, team: String, gid: String = null) = {
    val hitChart = XML.loadString(_http(url(hitChartUrl(date, team, gid)) as_str))
    cacheContent(date, gameDirectoryPath(date, team), "inning/inning_hit.xml", hitChart)
    hitChart
  }

  def fetchInnings(date: Date, team: String, gid: String = null) = {
    val innings = XML.loadString(_http(url(inningsUrl(date, team, gid)) as_str))
    cacheContent(date, gameDirectoryPath(date, team), "inning/inning_all.xml", innings)
    innings
  }

  def fetchInningScores(date: Date, team: String, gid: String = null) = {
      <xml/>
  }

  def fetchGameEvents(date: Date, team: String, gid: String = null) = {
      <xml/>
  }

  private def cacheContent(date: Date, path: String, fileName: String, content: Elem) {
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