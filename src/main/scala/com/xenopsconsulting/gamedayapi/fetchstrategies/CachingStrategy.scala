package com.xenopsconsulting.gamedayapi.fetchstrategies

import xml.{XML, Elem}
import org.joda.time.DateTime
import dispatch.{Http, url}

abstract class CachingStrategy extends FetchStrategy {
  val _http = new Http

  def fetchCachedFile(path: String, fileName: String): Option[Elem]
  def cacheContent(path: String, fileName: String, content: Elem)

  def fetchEpg(): Elem = {
    val cachedEpg = fetchCachedFile(datePath(), "epg.xml")
    cachedEpg match {
      case Some(n) => cachedEpg.get
      case None => {
        val epg = XML.loadString(_http(url(epgUrl()) as_str))
        cacheContent(datePath(), "epg.xml", epg)
        epg
      }
    }
  }

  def fetchGame(): Elem = {
    val cachedGame = fetchCachedFile(gameDirectoryPath(), "game.xml")
    cachedGame match {
      case Some(n) => cachedGame.get
      case None => {
        val game = XML.loadString(_http(url(gameUrl()) as_str))
        cacheContent(gameDirectoryPath(), "game.xml", game)
        game
      }
    }
  }

  def fetchBoxScore(): Elem = {
    val cachedBoxScore = fetchCachedFile(gameDirectoryPath(), "boxscore.xml")
    cachedBoxScore match {
      case Some(n) => cachedBoxScore.get
      case None => {
        val boxScore = XML.loadString(_http(url(boxScoreUrl()) as_str))
        cacheContent(gameDirectoryPath(), "boxscore.xml", boxScore)
        boxScore
      }
    }
  }

  def fetchLineScore(): Elem = {
    val cachedLineScore = fetchCachedFile(gameDirectoryPath(), "linescore.xml")
    cachedLineScore match {
      case Some(n) => cachedLineScore.get
      case None => {
        val lineScore = XML.loadString(_http(url(lineScoreUrl()) as_str))
        cacheContent(gameDirectoryPath(), "linescore.xml", lineScore)
        lineScore
      }
    }
  }

  def fetchHitChart() = {
    val cachedHitChart = fetchCachedFile(gameDirectoryPath(), "inning/inning_hit.xml")

    cachedHitChart match {
      case Some(n) => cachedHitChart.get
      case None => {
        val hitChart = XML.loadString(_http(url(hitChartUrl()) as_str))
        cacheContent(gameDirectoryPath(), "inning/inning_hit.xml", hitChart)
        hitChart
      }
    }
  }

  def fetchInnings() = {
    val cachedInnings = fetchCachedFile(gameDirectoryPath(), "inning/inning_all.xml")
    cachedInnings match {
      case Some(n) => cachedInnings.get
      case None => {
        val innings = XML.loadString(_http(url(inningsUrl()) as_str))
        cacheContent(gameDirectoryPath(), "inning/inning_all.xml", innings)
        innings
      }
    }
  }

  def fetchInningScores() = {
    val cachedInningScores = fetchCachedFile(gameDirectoryPath(), "inning/inning_Scores.xml")
    cachedInningScores match {
      case Some(n) => cachedInningScores.get
      case None => {
        val inningScores = XML.loadString(_http(url(inningScoresUrl()) as_str))
        cacheContent(gameDirectoryPath(), "inning/inning_Scores.xml", inningScores)
        inningScores
      }
    }
  }

  def fetchGameEvents() = {
    val cachedGameEvents = fetchCachedFile(gameDirectoryPath(), "game_events.xml")
    cachedGameEvents match {
      case Some(n) => cachedGameEvents.get
      case None => {
        val gameEvents = XML.loadString(_http(url(gameEventsUrl()) as_str))
        cacheContent(gameDirectoryPath(), "game_events.xml", gameEvents)
        gameEvents
      }
    }
  }

  protected def canCache:Boolean = {
    val now = new DateTime()
    val convertedDate = new DateTime(date())
    val okToCacheAfter = convertedDate.plusDays(1).toMutableDateTime
    okToCacheAfter.addHours(3)

    if (now.isAfter(okToCacheAfter)) {
      return true
    }

    return false
  }

}
