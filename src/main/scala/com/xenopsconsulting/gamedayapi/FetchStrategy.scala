package com.xenopsconsulting.gamedayapi

import java.util.Date
import java.text.SimpleDateFormat
import xml.Elem

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"

  def fetchEpg(date: Date): Elem
  def fetchGame(date: Date, team: String): Elem
  def fetchBoxScore(date: Date, team: String): Elem
  def fetchLineScore(date: Date, team: String): Elem
  def fetchHitChart(date: Date, team: String): Elem
  def fetchInnings(date: Date, team: String): Elem
  def fetchInningScores(date: Date, team: String): Elem

  def epgUrl(date: Date) = {
    val urlBuffer: StringBuffer = new StringBuffer(base_mlb_url)
    urlBuffer.append(datePath(date))
    urlBuffer.append("/epg.xml")
    urlBuffer.toString
  }
  
  def gameUrl(date: Date, team: String) = {
    buildUrl(date, team, "game.xml")
  }
  
  def boxScoreUrl(date: Date, team: String) = {
    buildUrl(date, team, "boxscore.xml")
  }

  def lineScoreUrl(date: Date, team: String) = {
    buildUrl(date, team, "linescore.xml")
  }

  def hitChartUrl(date: Date, team: String) = {
    buildUrl(date, team, "inning/inning_hit.xml")
  }

  def inningsUrl(date: Date, team: String) = {
    buildUrl(date, team, "inning/inning_all.xml")
  }

  def inningScoresUrl(date: Date, team: String) = {
    buildUrl(date, team, "inning/inning_Scores.xml")
  }

  protected def buildUrl(date: Date, team: String, fileName: String) = {
    base_mlb_url + gameDirectoryPath(date, team) + "/" + fileName
  }

  protected def gameDirectoryPath(date: Date, team: String) = {
    datePath(date) + "/" + gid(date, team)
  }

  protected def datePath(date: Date) = {
    val urlBuffer: StringBuilder = new StringBuilder("/year_")
    urlBuffer.append(new SimpleDateFormat("yyyy").format(date))
    urlBuffer.append("/month_")
    urlBuffer.append(new SimpleDateFormat("MM").format(date))
    urlBuffer.append("/day_")
    urlBuffer.append(new SimpleDateFormat("dd").format(date))
    urlBuffer.toString
  }

  protected def gid(date: Date, team: String) = {
    "gid_" + ((fetchEpg(date) \ "game" \\ "@gameday") find { _.text contains "_" + team + "mlb_" }).getOrElse("")
  }
}
