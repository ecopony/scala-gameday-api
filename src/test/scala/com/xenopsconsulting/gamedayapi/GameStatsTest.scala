package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class GameStatsTest extends AssertionsForJUnit {
  var gameStats: GameStats = _
  var game: Game = _
  var date: Date = _
  var team: String = _

  @Before def initialize() {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sfn"
    game = Game(date, team)
    game.fetchStrategy = TestFetchStrategy
    gameStats = GameStats(game)
  }

  @Test def testNastiestPitch() {
    assertEquals("76", gameStats.nastiestPitch().get.nasty())
    assertEquals("277417", gameStats.nastiestPitch().get.pitcher().id)
  }

  @Test def testMissingNasty() {
    game = Game(date, team)
    game.fetchStrategy = TestMissingStatsFetchStrategy
    gameStats = GameStats(game)
    assertEquals(None, gameStats.nastiestPitch())
  }

  @Test def testFastestPitch() {
    assertEquals(95.0, gameStats.fastestPitch().get.startSpeed().get, 1)
    assertEquals("433587", gameStats.fastestPitch().get.pitcher().id)
  }

  @Test def testMissingFastest() {
    game = Game(date, team)
    game.fetchStrategy = TestMissingStatsFetchStrategy
    gameStats = GameStats(game)
    assertEquals(None, gameStats.fastestPitch())
  }

  @Test def testSlowestPitch() {
    assertEquals(77.0, gameStats.slowestPitch().get.startSpeed().get, 1)
    assertEquals("277417", gameStats.slowestPitch().get.pitcher().id)
  }

  @Test def testMissingSlowest() {
    game = Game(date, team)
    game.fetchStrategy = TestMissingStatsFetchStrategy
    gameStats = GameStats(game)
    assertEquals(None, gameStats.slowestPitch())
  }

  @Test def testHighestBreakAngle() {
    assertEquals(32.8, gameStats.highestBreakAngle().get.breakAngle().get, 1)
    assertEquals("277417", gameStats.highestBreakAngle().get.pitcher().id)
  }

  @Test def lowestBreakAngle() {
    assertEquals(-14.1, gameStats.lowestBreakAngle().get.breakAngle().get, 1)
    assertEquals("277417", gameStats.lowestBreakAngle().get.pitcher().id)
  }

  @Test def highestSpinRate() {
    assertEquals(2393.571, gameStats.highestSpinRate().get.spinRate().get, 1)
    assertEquals("277417", gameStats.highestSpinRate().get.pitcher().id)
  }

  @Test def lowestSpinRate() {
    assertEquals(111.785, gameStats.lowestSpinRate().get.spinRate().get, 1)
    assertEquals("277417", gameStats.lowestSpinRate().get.pitcher().id)
  }

}

