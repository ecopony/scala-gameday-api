package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class Game(date: Date, team: String) extends XmlRepresentation {
  private var _boxScore:BoxScore = _
  private var _hitChart:HitChart = _
  private var _innings:Innings = _

  def fetch() = {
    _xml = fetchStrategy.fetchGame(date, team)
  }

  def boxScore() = {
    if (_boxScore == null) _boxScore = new BoxScore(date, team)
    _boxScore.fetchStrategy = fetchStrategy
    _boxScore
  }
  
  def hitChart() = {
    if (_hitChart == null) _hitChart = new HitChart(date, team)
    _hitChart.fetchStrategy = fetchStrategy
    _hitChart
  }

  def innings() = {
    if (_innings == null) _innings = new Innings(date, team)
    _innings.fetchStrategy = fetchStrategy
    _innings
  }

  def gameTimeEt():String = (gameNode \ "@game_time_et").text
  def gameType():String = (gameNode \ "@type").text
  def localGameTime():String = (gameNode \ "@local_game_time").text
  def gamedaySw():String = (gameNode \ "@gameday_sw").text
  def homeTeamCode():String = (homeTeamNode \ "@code").text
  def awayTeamCode():String = (awayTeamNode \ "@code").text
  def homeTeamAbbrev():String = (homeTeamNode \ "@abbrev").text
  def awayTeamAbbrev():String = (awayTeamNode \ "@abbrev").text
  def homeTeamId():String = (homeTeamNode \ "@id").text
  def awayTeamId():String = (awayTeamNode \ "@id").text
  def homeTeamName():String = (homeTeamNode \ "@name").text
  def awayTeamName():String = (awayTeamNode \ "@name").text
  def homeTeamNameFull():String = (homeTeamNode \ "@name_full").text
  def awayTeamNameFull():String = (awayTeamNode \ "@name_full").text
  def homeTeamNameBrief():String = (homeTeamNode \ "@name_brief").text
  def awayTeamNameBrief():String = (awayTeamNode \ "@name_brief").text
  def homeTeamWins():String = (homeTeamNode \ "@w").text
  def awayTeamWins():String = (awayTeamNode \ "@w").text
  def homeTeamLosses():String = (homeTeamNode \ "@l").text
  def awayTeamLosses():String = (awayTeamNode \ "@l").text
  def homeTeamDivisionId():String = (homeTeamNode \ "@division_id").text
  def awayTeamDivisionId():String = (awayTeamNode \ "@division_id").text
  def homeTeamLeagueId():String = (homeTeamNode \ "@league_id").text
  def awayTeamLeagueId():String = (awayTeamNode \ "@league_id").text
  def homeTeamLeague():String = (homeTeamNode \ "@league").text
  def awayTeamLeague():String = (awayTeamNode \ "@league").text
  def stadiumId():String = (stadiumNode \ "@id").text
  def stadiumName():String = (stadiumNode \ "@name").text
  def location():String = (stadiumNode \ "@location").text

  private def gameNode():NodeSeq = (xml \\ "game")
  private def homeTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "home" }).get
  private def awayTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "away" }).get
  private def stadiumNode = (gameNode \ "stadium")
}