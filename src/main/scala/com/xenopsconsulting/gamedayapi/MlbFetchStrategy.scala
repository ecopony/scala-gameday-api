package com.xenopsconsulting.gamedayapi

import scala.xml._
import dispatch._
import java.util.Date

object MlbFetchStrategy extends FetchStrategy {
  val http = new Http

  def fetchEpg(date: Date) = fetchXmlAsString(epgUrl(date))
  def fetchGame(date: Date, team: String, gid: String = null) = fetchXmlAsString(gameUrl(date, team, gid))
  def fetchBoxScore(date: Date, team: String, gid: String = null) = fetchXmlAsString(boxScoreUrl(date, team, gid))
  def fetchLineScore(date: Date, team: String, gid: String = null) = fetchXmlAsString(lineScoreUrl(date, team, gid))
  def fetchHitChart(date: Date, team: String, gid: String = null) = fetchXmlAsString(hitChartUrl(date, team, gid))
  def fetchInnings(date: Date, team: String, gid: String = null) = fetchXmlAsString(inningsUrl(date, team, gid))
  def fetchInningScores(date: Date, team: String, gid: String = null) = fetchXmlAsString(inningScoresUrl(date, team,
    gid))
  def fetchGameEvents(date: Date, team: String, gid: String = null) = fetchXmlAsString(gameEventsUrl(date, team, gid))

  private def fetchXmlAsString(urlToFetch: String) = XML.loadString(http(url(urlToFetch) as_str))

}
