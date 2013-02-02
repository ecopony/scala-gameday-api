package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date
import java.text.SimpleDateFormat
import xml.Elem

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"

  def fetchEpg(date: Date): Elem
  def fetchGame(date: Date, team: String, gid: String = null): Elem
  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem
  def fetchLineScore(date: Date, team: String, gid: String = null): Elem
  def fetchHitChart(date: Date, team: String, gid: String = null): Elem
  def fetchInnings(date: Date, team: String, gid: String = null): Elem
  def fetchInningScores(date: Date, team: String, gid: String = null): Elem
  def fetchGameEvents(date: Date, team: String, gid: String = null): Elem

  def fetchGid(date: Date, team: String) = {
    "gid_" + ((fetchEpg(date) \ "game" \\ "@gameday") find { _.text contains "_" + team + "mlb_" }).getOrElse("")
  }

  def epgUrl(date: Date) = {
    val urlBuffer: StringBuffer = new StringBuffer(base_mlb_url)
    urlBuffer.append(datePath(date))
    urlBuffer.append("/epg.xml")
    urlBuffer.toString
  }
  
  def gameUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "game.xml", gid)
  }
  
  def boxScoreUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "boxscore.xml", gid)
  }

  def lineScoreUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "linescore.xml", gid)
  }

  def hitChartUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "inning/inning_hit.xml", gid)
  }

  def inningsUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "inning/inning_all.xml", gid)
  }

  def inningScoresUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "inning/inning_Scores.xml", gid)
  }

  def gameEventsUrl(date: Date, team: String, gid: String = null) = {
    buildUrl(date, team, "game_events.xml", gid)
  }

  protected def buildUrl(date: Date, team: String, fileName: String, gid: String = null) = {
    base_mlb_url + gameDirectoryPath(date, team, gid) + "/" + fileName
  }

  protected def gameDirectoryPath(date: Date, team: String, gid: String = null) = {
    val pathBuffer: StringBuilder = new StringBuilder(datePath(date))
    pathBuffer.append("/")
    if(gid == null) {
      pathBuffer.append(fetchGid(date, team))
    } else {
      pathBuffer.append(gid)
    }
    pathBuffer.toString()
  }

  protected def datePath(date: Date) = {
    val urlBuffer: StringBuilder = new StringBuilder("/year_")
    urlBuffer.append(new SimpleDateFormat("yyyy").format(date))
    urlBuffer.append("/month_")
    urlBuffer.append(new SimpleDateFormat("MM").format(date))
    urlBuffer.append("/day_")
    urlBuffer.append(new SimpleDateFormat("dd").format(date))
    urlBuffer.toString()
  }

}
