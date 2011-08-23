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

  def epgUrl(date: Date): String = {
    val urlBuffer: StringBuffer = new StringBuffer(base_mlb_url)
    urlBuffer.append(datePath(date))
    urlBuffer.append("/epg.xml")
    urlBuffer.toString
  }
  
  def gameUrl(date: Date, team: String): String = {
    buildUrl(date, team, "game.xml")
  }
  
  def boxScoreUrl(date: Date, team: String): String = {
    buildUrl(date, team, "boxscore.xml")
  }

  def lineScoreUrl(date: Date, team: String): String = {
    buildUrl(date, team, "linescore.xml")
  }

  private def buildUrl(date: Date, team: String, fileName: String): String = {
    val urlBuffer: StringBuffer = new StringBuffer(base_mlb_url)
    urlBuffer.append(datePath(date))
    val epgXml: Elem = fetchEpg(date)
    val gid: String = extractGidFromEpg(epgXml, team)
    urlBuffer.append(gid)
    urlBuffer.append("/")
    urlBuffer.append(fileName)
    urlBuffer.toString
  }

  private def datePath(date: Date): String = {
    val urlBuffer: StringBuffer = new StringBuffer("/year_")
    urlBuffer.append(new SimpleDateFormat("yyyy").format(date))
    urlBuffer.append("/month_")
    urlBuffer.append(new SimpleDateFormat("MM").format(date))
    urlBuffer.append("/day_")
    urlBuffer.append(new SimpleDateFormat("dd").format(date))
    urlBuffer.toString
  }

  private def extractGidFromEpg(epgXml: Elem, team: String): String = {
    val gameday = (epgXml \ "game" \\ "@gameday") find { _.text contains "_" + team + "mlb_" }
    val gid: String = "/gid_" + gameday.getOrElse("")
    gid
  }
}