package com.xenopsconsulting.gamedayapi

import java.util.Date
import com.xenopsconsulting.gamedayapi.fetchstrategies.{FetchStrategy, FetchStrategyProvider}

object Game {
  def apply(date: Date, team: String) = {
    new Game(date, team) with FetchStrategyProvider
  }
}

class Game(date: Date, team: String) extends GamedayRepresentation {
  this: FetchStrategyProvider =>

  val fetchStrategy: FetchStrategy = newFetchStrategy(date, team)

  private var _boxScore: BoxScore = _
  private var _hitChart: HitChart = _
  private var _innings: Innings = _
  private var _inningScores: InningScores = _
  private var _gameEvents: GameEvents = _

  /**
   * Fetches the game file from gameday servers. Does not need to be invoked directly, as it will be invoked lazily
   * by methods in need of game data. Invoking will replace any previously loaded XML for this game.
   */
  def fetch():Unit = {
    _xml = fetchStrategy.fetchGame()
  }

  def boxScore():BoxScore = {
    if (_boxScore == null) _boxScore = new BoxScore(this)
    _boxScore
  }

  def hitChart() = {
    if (_hitChart == null) _hitChart = new HitChart(this)
    _hitChart
  }

  def innings() = {
    if (_innings == null) _innings = new Innings(this)
    _innings
  }

  def inningScores() = {
    if (_inningScores == null) _inningScores = new InningScores(this)
    _inningScores
  }

  def gameEvents() = {
    if (_gameEvents == null) _gameEvents = new GameEvents(this)
    _gameEvents
  }

  /**
   * Eagerly load all files associated with this game. Invoking this method is not necessary to interact with all game
   * files, as they will be lazily loaded as needed by the API. You can call this method if latency during later
   * interactions with the API is a concern, or if you are crawling and saving data files and want all data to be
   * retrieved without having to touch all child objects through the API.
   */
  def fetchAll() {
    fetch()
    boxScore().fetch()
    boxScore().lineScore().fetch()
    gameEvents().fetch()
    hitChart().fetch()
    inningScores().fetch()
    innings().fetch()
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
      homeTeamName()
    } else {
      nameFull
    }
  }

  def awayTeamNameFull():String = {
    val nameFull = (awayTeamNode \ "@name_full").text
    if (nameFull == "") {
      awayTeamName()
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

  def isOfficial():Boolean = {
    if ((gameType() == "R" || gameType() == "L") && boxScore().statusInd() != "P") {
      true
    } else {
      false
    }
  }

  /**
   * A convenience method for accessing all pitches thrown in the game by both teams, in
   * the order in which they were thrown.
   *
   * @return A collection of Pitch objects
   */
  def pitches() = {
    innings().pitches()
  }

  /**
   * A convenience method for accessing all pitches thrown in the game by the home team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def homeTeamPitches() = {
    innings().homeTeamPitches()
  }

  /**
   * A convenience method for accessing all pitches thrown in the game by the away team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def awayTeamPitches() = {
    innings().awayTeamPitches()
  }

  /**
   * A convenience method for accessing all of the home team's at-bats from all
   * of the innings, in the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def homeTeamAtBats() = {
    innings().homeTeamAtBats()
  }

  /**
   * A convenience method for accessing all of the away team's at-bats from all
   * of the innings, in the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def awayTeamAtBats() = {
    innings().awayTeamAtBats()
  }

  /**
   * A convenience method that returns the number of pitches seen by the home team
   * batters per at bat.
   */
  def homeTeamPitchesSeenPerAtBat() = {
    awayTeamPitches().size.toFloat / homeTeamAtBats().size.toFloat
  }

  /**
   * A convenience method that returns the number of pitches seen by the away team
   * batters per at bat.
   */
  def awayTeamPitchesSeenPerAtBat() = {
    homeTeamPitches().size.toFloat / awayTeamAtBats().size.toFloat
  }

  /**
   * A convenience method for accessing all of the pitchers that appeared in the game, starting
   * with the away team.
   *
   * @return A collection of Pitcher objects
   */
  def pitchers() = {
    boxScore().awayPitchers ++ boxScore().homePitchers
  }

  /**
   * A convenience method for accessing all of the batters that appeared in the game, starting
   * with the away team.
   *
   * @return A collection of Batter objects
   */
  def batters() = {
    boxScore().awayBatters ++ boxScore().homeBatters
  }

  /**
   * A convenience method for getting at the year of the game.
   *
   * @return The four digit year.
   */
  def year():Int = {
    fetchStrategy.gid().split("_").tail.head.toInt
  }

  private def homeTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "home" }).get
  private def awayTeamNode = ((gameNode \ "team") find { _.attribute("type").get.text == "away" }).get
  private def stadiumNode = gameNode \ "stadium"

}