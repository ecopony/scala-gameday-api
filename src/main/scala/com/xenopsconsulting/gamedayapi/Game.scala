package com.xenopsconsulting.gamedayapi

import java.util.Date

case class Game(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {
  private var _boxScore:BoxScore = _
  private var _hitChart:HitChart = _
  private var _innings:Innings = _
  private var _inningScores:InningScores = _
  private var _gameEvents:GameEvents = _

  def fetch() = {
    _xml = fetchStrategy.fetchGame(date, team, gid)
  }

  def boxScore() = {
    if (_boxScore == null) initializeBoxScore
    _boxScore
  }
  
  def hitChart() = {
    if (_hitChart == null) initializeHitChart
    _hitChart
  }

  def innings() = {
    if (_innings == null) initializeInnings
    _innings
  }

  def inningScores() = {
    if (_inningScores == null) initializeInningScores
    _inningScores
  }
  
  def gameEvents() = {
    if (_gameEvents == null) initializeGameEvents
    _gameEvents
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

  def homeTeamNameFull():String = {
    val nameFull = (homeTeamNode \ "@name_full").text
    if (nameFull == "") {
      homeTeamName
    } else {
      nameFull
    }
  }

  def awayTeamNameFull():String = {
    val nameFull = (awayTeamNode \ "@name_full").text
    if (nameFull == "") {
      awayTeamName
    } else {
      nameFull
    }
  }

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

  /**
   * A convenience method for accessing all pitches thrown in the game by both teams, in
   * the order in which they were thrown.
   *
   * @return A collection of Pitch objects
   */
  def pitches() = {
    innings.pitches
  }

  private def homeTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "home" }).get
  private def awayTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "away" }).get
  private def stadiumNode = (gameNode \ "stadium")

  private def initializeBoxScore() = {
    _boxScore = BoxScore(date, team)
    _boxScore.initializeWith(gid, fetchStrategy)
  }
  private def initializeHitChart() = {
    _hitChart = HitChart(date, team)
    _hitChart.initializeWith(gid, fetchStrategy)
  }
  private def initializeInnings() = {
    _innings = Innings(date, team)
    _innings.initializeWith(gid, fetchStrategy)
  }
  private def initializeInningScores() = {
    _inningScores = InningScores(date, team)
    _inningScores.initializeWith(gid, fetchStrategy)
  }
  private def initializeGameEvents() = {
    _gameEvents = GameEvents(date, team)
    _gameEvents.initializeWith(gid, fetchStrategy)
  }

}