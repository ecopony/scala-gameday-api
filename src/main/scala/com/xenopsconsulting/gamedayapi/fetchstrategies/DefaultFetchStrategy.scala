package com.xenopsconsulting.gamedayapi.fetchstrategies

import scala.xml._
import dispatch._
import java.util.Date

class DefaultFetchStrategy(date: Date, team: String, nightcap: Boolean = false) extends FetchStrategy {
  val http = new Http
  val _date = date
  val _team = team
  val _nightcap = nightcap

  def fetchEpg() = fetchXmlAsString(epgUrl())
  def fetchGame() = fetchXmlAsString(gameUrl())
  def fetchBoxScore() = fetchXmlAsString(boxScoreUrl())
  def fetchLineScore() = fetchXmlAsString(lineScoreUrl())
  def fetchHitChart() = fetchXmlAsString(hitChartUrl())
  def fetchInnings() = fetchXmlAsString(inningsUrl())
  def fetchInningScores() = fetchXmlAsString(inningScoresUrl())
  def fetchGameEvents() = fetchXmlAsString(gameEventsUrl())

  private def fetchXmlAsString(urlToFetch: String) = XML.loadString(http(url(urlToFetch) as_str))

}
