package com.xenopsconsulting.gamedayapi

import scala.xml._
import dispatch._
import java.util.Date

object MlbFetchStrategy extends FetchStrategy {
  val http = new Http

  def fetchEpg(date: Date) = fetchXmlAsString(epgUrl(date))
  def fetchGame(date: Date, team: String) = fetchXmlAsString(gameUrl(date, team))
  def fetchBoxScore(date: Date, team: String) = fetchXmlAsString(boxScoreUrl(date, team))
  def fetchLineScore(date: Date, team: String) = fetchXmlAsString(lineScoreUrl(date, team))
  def fetchHitChart(date: Date, team: String) = fetchXmlAsString(hitChartUrl(date, team))
  def fetchInnings(date: Date, team: String) = fetchXmlAsString(inningsUrl(date, team))

  private def fetchXmlAsString(urlToFetch: String) = XML.loadString(http(url(urlToFetch) as_str))

}
