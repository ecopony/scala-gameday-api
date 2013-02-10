package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date
import xml.{XML, Elem}
import org.joda.time.DateTime
import dispatch.{Http, url}

abstract class CachingStrategy extends FetchStrategy {
  val _http = new Http

  def fetchCachedFile(date: Date, path: String, fileName: String): Option[Elem]
  def cacheContent(date: Date, path: String, fileName: String, content: Elem)

  def fetchEpg(date: Date): Elem = {
    val cachedEpg = fetchCachedFile(date, datePath(date), "epg.xml")
    cachedEpg match {
      case Some(n) => cachedEpg.get
      case None => {
        val epg = XML.loadString(_http(url(epgUrl(date)) as_str))
        cacheContent(date, datePath(date), "epg.xml", epg)
        epg
      }
    }
  }

  def fetchGame(date: Date, team: String, gid: String = null): Elem = {
    val cachedGame = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "game.xml")
    cachedGame match {
      case Some(n) => cachedGame.get
      case None => {
        val game = XML.loadString(_http(url(gameUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "game.xml", game)
        game
      }
    }
  }

  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem = {
    val cachedBoxScore = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "boxscore.xml")
    cachedBoxScore match {
      case Some(n) => cachedBoxScore.get
      case None => {
        val boxScore = XML.loadString(_http(url(boxScoreUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "boxscore.xml", boxScore)
        boxScore
      }
    }
  }

  def fetchLineScore(date: Date, team: String, gid: String = null): Elem = {
    val cachedLineScore = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "linescore.xml")
    cachedLineScore match {
      case Some(n) => cachedLineScore.get
      case None => {
        val lineScore = XML.loadString(_http(url(lineScoreUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "linescore.xml", lineScore)
        lineScore
      }
    }
  }

  def fetchHitChart(date: Date, team: String, gid: String = null) = {
    val cachedHitChart = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "inning/inning_hit.xml")

    cachedHitChart match {
      case Some(n) => cachedHitChart.get
      case None => {
        val hitChart = XML.loadString(_http(url(hitChartUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "inning/inning_hit.xml", hitChart)
        hitChart
      }
    }
  }

  def fetchInnings(date: Date, team: String, gid: String = null) = {
    val cachedInnings = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "inning/inning_all.xml")
    cachedInnings match {
      case Some(n) => cachedInnings.get
      case None => {
        val innings = XML.loadString(_http(url(inningsUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "inning/inning_all.xml", innings)
        innings
      }
    }
  }

  def fetchInningScores(date: Date, team: String, gid: String = null) = {
    val cachedInningScores = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "inning/inning_Scores.xml")
    cachedInningScores match {
      case Some(n) => cachedInningScores.get
      case None => {
        val inningScores = XML.loadString(_http(url(inningScoresUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "inning/inning_Scores.xml", inningScores)
        inningScores
      }
    }
  }

  def fetchGameEvents(date: Date, team: String, gid: String = null) = {
    val cachedGameEvents = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "game_events.xml")
    cachedGameEvents match {
      case Some(n) => cachedGameEvents.get
      case None => {
        val gameEvents = XML.loadString(_http(url(gameEventsUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "game_events.xml", gameEvents)
        gameEvents
      }
    }
  }

  protected def canCache(date: Date):Boolean = {
    val now = new DateTime()
    val convertedDate = new DateTime(date)
    val okToCacheAfter = convertedDate.plusDays(1).toMutableDateTime()
    okToCacheAfter.addHours(3)

    if (now.isAfter(okToCacheAfter)) {
      return true
    }

    return false
  }

}
