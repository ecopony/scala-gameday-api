package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class Game(date: Date, team: String) {
  private var _xml:Elem = null
  var boxScore: BoxScore = new BoxScore(date, team)

  var fetch_strategy: FetchStrategy = MlbFetchStrategy

  def tm = team
  def dt = date

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
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

  private def fetch() = {
    _xml = fetch_strategy.fetchGame(date, team)
  }

  private def gameNode():NodeSeq = (xml \\ "game")
  private def homeTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "home" }).get
  private def awayTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "away" }).get
  private def stadiumNode = (gameNode \ "stadium")
}