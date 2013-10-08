package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date
import java.text.SimpleDateFormat
import xml.Elem

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"
  val _date: Date
  val _team: String

  protected var _gid: String = _

  def date() = _date
  def team() = _team

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
    "gid_" + ((fetchEpg() \ "game" \\ "@gameday") find { _.text contains "_" + team + "mlb_" }).getOrElse("")
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
    val pathBuffer: StringBuilder = new StringBuilder(datePath())
    pathBuffer.append("/")
    if(gid == null) {
      pathBuffer.append(fetchGid())
    } else {
      pathBuffer.append(gid)
    }
    pathBuffer.toString()
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
