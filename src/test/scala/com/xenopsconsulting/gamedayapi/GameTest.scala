package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class GameTest extends AssertionsForJUnit {
  var game: Game = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sfn"
    game = new Game(date, team)
    game.fetchStrategy = TestFetchStrategy
  }

  @Test def testFetchStrategyPropagation {
    assertEquals(TestFetchStrategy.getClass, game.boxScore.fetchStrategy.getClass)
  }

  @Test def testGameExists {
    assertEquals(true, game.exists)
  }

  @Test def testGameTime {
    assertEquals("10:10 PM", game.gameTimeEt)
  }

  @Test def testGameType {
    assertEquals("R", game.gameType)
  }

  @Test def testLocalGameTime {
    assertEquals("19:10", game.localGameTime)
  }

  @Test def testGamedaySw {
    assertEquals("P", game.gamedaySw)
  }

  @Test def testHomeTeamCode {
    assertEquals("sea", game.homeTeamCode)
  }

  @Test def testAwayTeamCode {
    assertEquals("bos", game.awayTeamCode)
  }

  @Test def testHomeTeamAbbrev {
    assertEquals("SEA", game.homeTeamAbbrev)
  }

  @Test def testAwayTeamAbbrev {
    assertEquals("BOS", game.awayTeamAbbrev)
  }

  @Test def testHomeTeamId {
    assertEquals("136", game.homeTeamId)
  }

  @Test def testAwayTeamId {
    assertEquals("111", game.awayTeamId)
  }

  @Test def testHomeTeamName {
    assertEquals("Seattle", game.homeTeamName)
  }

  @Test def testAwayTeamName {
    assertEquals("Boston", game.awayTeamName)
  }
  
  @Test def testHomeTeamNameFull {
    assertEquals("Seattle Mariners", game.homeTeamNameFull)
  }

  @Test def testAwayTeamNameFull {
    assertEquals("Boston Red Sox", game.awayTeamNameFull)
  }

  @Test def testHomeTeamNameBrief {
    assertEquals("Mariners", game.homeTeamNameBrief)
  }

  @Test def testAwayTeamNameBrief {
    assertEquals("Red Sox", game.awayTeamNameBrief)
  }

  @Test def testHomeTeamWins {
    assertEquals("51", game.homeTeamWins)
  }

  @Test def testAwayTeamWins {
    assertEquals("73", game.awayTeamWins)
  }

  @Test def testHomeTeamLosses {
    assertEquals("67", game.homeTeamLosses)
  }

  @Test def testAwayTeamLosses {
    assertEquals("45", game.awayTeamLosses)
  }

  @Test def testHomeTeamDivisionId {
    assertEquals("200", game.homeTeamDivisionId)
  }

  @Test def testAwayTeamDivisionId {
    assertEquals("201", game.awayTeamDivisionId)
  }

  @Test def testHomeTeamLeagueId {
    assertEquals("103", game.homeTeamLeagueId)
  }

  @Test def testAwayTeamLeagueId {
    assertEquals("103", game.awayTeamLeagueId)
  }

  @Test def testHomeTeamLeague {
    assertEquals("AL", game.homeTeamLeague)
  }

  @Test def testAwayTeamLeague {
    assertEquals("AL", game.awayTeamLeague)
  }

  @Test def testStadiumId {
    assertEquals("680", game.stadiumId)
  }

  @Test def testStadiumName {
    assertEquals("Safeco Field", game.stadiumName)
  }

  @Test def testLocation {
    assertEquals("Seattle, WA", game.location)
  }

  @Test def testBoxScoreExists {
    assertNotNull(game.boxScore)
  }

  @Test def testHitChartExists {
    assertNotNull(game.hitChart)
  }

  @Test def testInningsExist {
    assertNotNull(game.innings)
  }

  @Test def testInningScoresExist {
    assertNotNull(game.inningScores)
  }

  @Test def testGameEventsExist {
    assertNotNull(game.gameEvents)
  }

  @Test def testNameFullFallsThroughToName {
    game.fetchStrategy = TestEmptyXmlFetchStrategy
    assertEquals("Kansas City", game.homeTeamNameFull)
  }

  @Test def testHomeTeamAtBats {
    assertEquals(8, game.homeTeamAtBats.size)
    assertEquals("4", game.homeTeamAtBats.head.num)
  }

  @Test def testAwayTeamAtBats {
    assertEquals(3, game.awayTeamAtBats.size)
    assertEquals("1", game.awayTeamAtBats.head.num)
  }

  @Test def testPitches {
    assertEquals(46, game.pitches.size)
    assertEquals("3", game.pitches.head.id)
  }

  @Test def testHomeTeamPitches {
    assertEquals(12, game.homeTeamPitches.size)
    assertEquals("3", game.homeTeamPitches.head.id)
  }

  @Test def testAwayTeamPitches {
    assertEquals(34, game.awayTeamPitches.size)
    assertEquals("25", game.awayTeamPitches.head.id)
  }

  @Test def testPitchers {
    assertEquals(7, game.pitchers.size)
    assertEquals("277417", game.pitchers.head.id)
  }

  @Test def testHomeTeamPitchesPerAtBat {
    assertEquals(4.25, game.homeTeamPitchesPerAtBat, 2)
  }

  @Test def testAwayTeamPitchesPerAtBat {
    assertEquals(4.0, game.awayTeamPitchesPerAtBat, 1)
  }

}
