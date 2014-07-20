package com.xenopsconsulting.gamedayapi.fetchstrategies

import xml.{XML, Elem}
import org.joda.time.DateTime
import dispatch._, Defaults._
import scala.Some

abstract class CachingStrategy extends FetchStrategy {

  def fetchCachedFile(path: String, fileName: String): Option[Elem]
  def cacheContent(path: String, fileName: String, content: Elem)

  def fetchEpg(): Elem = {
    val cachedEpg = fetchCachedFile(datePath(), "epg.xml")
    cachedEpg match {
      case Some(n) => cachedEpg.get
      case None => {
        val response = Http(url(epgUrl()) OK as.xml.Elem)
        val epg = response()
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
        val response = Http(url(gameUrl()) OK as.xml.Elem)
        val game = response()
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
        val response = Http(url(boxScoreUrl()) OK as.xml.Elem)
        val boxScore = response()
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
        val response = Http(url(lineScoreUrl()) OK as.xml.Elem)
        val lineScore = response()
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
        val response = Http(url(hitChartUrl()) OK as.xml.Elem)
        val hitChart = response()
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
        val response = Http(url(inningsUrl()) OK as.xml.Elem)
        val innings = response()
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
        val response = Http(url(inningScoresUrl()) OK as.xml.Elem)
        val inningScores = response()
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
        val response = Http(url(gameEventsUrl()) OK as.xml.Elem)
        val gameEvents = response()
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
