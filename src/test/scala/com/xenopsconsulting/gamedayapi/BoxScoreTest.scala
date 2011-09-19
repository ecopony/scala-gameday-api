package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class BoxScoreTest extends AssertionsForJUnit {
  var boxScore: BoxScore = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    boxScore = new BoxScore(date, team)
    boxScore.fetchStrategy = TestFetchStrategy
  }

  @Test def testInitialization {
    assertEquals(team, boxScore.tm)
    assertEquals(date, boxScore.dt)
  }

  @Test def testLineScoreExists {
    assertNotNull(boxScore.lineScore)
  }

  @Test def testHomePitchersExists {
    assertNotNull(boxScore.homePitchers)
    assertEquals(3, boxScore.homePitchers.size)
  }

  @Test def testAwayPitchersExists {
    assertNotNull(boxScore.awayPitchers)
    assertEquals(4, boxScore.awayPitchers.size)
  }

  @Test def testPitchersInOrder {
    val pitchers = boxScore.homePitchers
    assertEquals("Hernandez, F", pitchers.head.name)
    assertEquals("League", pitchers.last.name)
  }

  @Test def testHomeBattersExists {
    assertNotNull(boxScore.homeBatters)
    assertEquals(12, boxScore.homeBatters.size)
  }

  @Test def testAwayBattersExists {
    assertNotNull(boxScore.awayBatters)
    assertEquals(15, boxScore.awayBatters.size)
  }

  @Test def tesBattersInOrder {
    val batters = boxScore.homeBatters
    assertEquals("Suzuki, I", batters.head.name)
    assertEquals("League", batters.last.name)
  }

  @Test def testGameId {
    assertEquals("2011/08/13/bosmlb-seamlb-1", boxScore.gameId)
  }

  @Test def testGamePk {
    assertEquals("288682", boxScore.gamePk)
  }

  @Test def testVenueId {
    assertEquals("680", boxScore.venueId)
  }

  @Test def testVenueName {
    assertEquals("Safeco Field", boxScore.venueName)
  }

  @Test def testHomeSportCode {
    assertEquals("mlb", boxScore.homeSportCode)
  }

  @Test def testAwayTeamCode {
    assertEquals("bos", boxScore.awayTeamCode)
  }

  @Test def testHomeTeamCode {
    assertEquals("sea", boxScore.homeTeamCode)
  }

  @Test def testAwayId {
    assertEquals("111", boxScore.awayId)
  }

  @Test def testHomeId {
    assertEquals("136", boxScore.homeId)
  }

  @Test def testAwayFname {
    assertEquals("Boston Red Sox", boxScore.awayFname)
  }

  @Test def testHomeFname {
    assertEquals("Seattle Mariners", boxScore.homeFname)
  }

  @Test def testHomeSname {
    assertEquals("Seattle", boxScore.homeSname)
  }

  @Test def testAwayWins {
    assertEquals("73", boxScore.awayWins)
  }

  @Test def testAwayLoss {
    assertEquals("45", boxScore.awayLoss)
  }

  @Test def testHomeWins {
    assertEquals("51", boxScore.homeWins)
  }

  @Test def testHomeLoss {
    assertEquals("67", boxScore.homeLoss)
  }

  @Test def testStatusInd {
    assertEquals("F", boxScore.statusInd)
  }

}
