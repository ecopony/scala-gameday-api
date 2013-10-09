package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date
import java.text.SimpleDateFormat
import xml.Elem

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"
  val _date: Date
  val _team: String
  val _nightcap: Boolean

  protected var _gid: String = _

  def date() = _date
  def team() = _team
  def nightcap() = _nightcap

  def gid():String = {
    if (_gid == null) _gid = fetchGid()
    _gid
  }

  def fetchEpg(): Elem
  def fetchGame(): Elem
  def fetchBoxScore(): Elem
  def fetchLineScore(): Elem
  def fetchHitChart(): Elem
  def fetchInnings(): Elem
  def fetchInningScores(): Elem
  def fetchGameEvents(): Elem

  def fetchGid() = {
    val gidsForTeam = (fetchEpg() \ "game" \\ "@gameday") filter { _.text contains "_" + team + "mlb_" }

    if (gidsForTeam.size == 2 && nightcap()) {
      "gid_" + gidsForTeam(1)
    } else {
      "gid_" + gidsForTeam(0)
    }
  }

  def epgUrl() = {
    val urlBuffer: StringBuffer = new StringBuffer(base_mlb_url)
    urlBuffer.append(datePath())
    urlBuffer.append("/epg.xml")
    urlBuffer.toString
  }

  def gameUrl() = {
    buildUrl("game.xml")
  }

  def boxScoreUrl() = {
    buildUrl("boxscore.xml")
  }

  def lineScoreUrl() = {
    buildUrl("linescore.xml")
  }

  def hitChartUrl() = {
    buildUrl("inning/inning_hit.xml")
  }

  def inningsUrl() = {
    buildUrl("inning/inning_all.xml")
  }

  def inningScoresUrl() = {
    buildUrl("inning/inning_Scores.xml")
  }

  def gameEventsUrl() = {
    buildUrl("game_events.xml")
  }

  protected def buildUrl(fileName: String) = {
    base_mlb_url + gameDirectoryPath() + "/" + fileName
  }

  protected def gameDirectoryPath() = {
    val pathBuffer: StringBuilder = new StringBuilder(datePathFromGid())
    pathBuffer.append("/")
    pathBuffer.append(gid())
    pathBuffer.toString()
  }

  protected def datePathFromGid() = {
    val gidParts = gid().split("_")
    val dateBuffer: StringBuilder = new StringBuilder("/year_")
    dateBuffer.append(gidParts(1))
    dateBuffer.append("/month_")
    dateBuffer.append(gidParts(2))
    dateBuffer.append("/day_")
    dateBuffer.append(gidParts(3))
    dateBuffer.toString()
  }

  protected def datePath() = {
    val urlBuffer: StringBuilder = new StringBuilder("/year_")
    urlBuffer.append(new SimpleDateFormat("yyyy").format(date()))
    urlBuffer.append("/month_")
    urlBuffer.append(new SimpleDateFormat("MM").format(date()))
    urlBuffer.append("/day_")
    urlBuffer.append(new SimpleDateFormat("dd").format(date()))
    urlBuffer.toString()
  }

}
