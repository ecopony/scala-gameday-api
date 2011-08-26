package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class LineScoreTest extends AssertionsForJUnit {
  var lineScore: LineScore = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    lineScore = new LineScore(date, team)
    lineScore.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization {
    assertEquals(team, lineScore.tm)
    assertEquals(date, lineScore.dt)
  }

  @Test def testGameId {
    assertEquals("2011/08/13/bosmlb-seamlb-1", lineScore.gameId)
  }

  @Test def testLineScoreInningsExist {
    assertNotNull(lineScore.innings)
  }

  @Test def testLineScoreInningLength {
    assertEquals(9, lineScore.innings.length)
  }

  @Test def testLineScoreInningInitialization {
    assertEquals("1", lineScore.innings.head.inning)
  }

}
