package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningTest extends AssertionsForJUnit {
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
    inning = innings.inning(1).get
  }

  @Test def testNum {
    assertEquals("1", inning.num)
  }

  @Test def testAwayTeam {
    assertEquals("bos", inning.awayTeam)
  }

  @Test def testHomeTeam {
    assertEquals("sea", inning.homeTeam)
  }

  @Test def testNext {
    assertEquals("Y", inning.next)
  }

  @Test def testTopExists {
    assertNotNull(inning.top)
  }

  @Test def testBottomExists {
    assertNotNull(inning.bottom)
  }

  @Test def testAtBats {
    assertEquals(11, inning.atBats.size)
    assertEquals("1", inning.atBats.head.num)
    assertEquals("11", inning.atBats.last.num)
    assertEquals(AtBat(<atbat_node/>, "top").getClass, inning.atBats.head.getClass)
  }

  @Test def testHomeTeamAtBats {
    assertEquals(8, inning.homeTeamAtBats.size)
    assertEquals("4", inning.homeTeamAtBats.head.num)
  }

  @Test def testAwayTeamAtBats {
    assertEquals(3, inning.awayTeamAtBats.size)
    assertEquals("1", inning.awayTeamAtBats.head.num)
  }

  @Test def testAtBatsNoBottom {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = Innings(date, team)
    innings.fetchStrategy = TestNoBottomInningFetchStrategy
    inning = innings.inning(1).get
    assertEquals(3, inning.atBats.size)
  }

  @Test def testPitches {
    assertEquals(46, inning.pitches.size)
    assertEquals("3", inning.pitches.head.id)
  }

  @Test def testHomeTeamPitches {
    assertEquals(12, inning.homeTeamPitches.size)
    assertEquals("3", inning.homeTeamPitches.head.id)
  }

  @Test def testAwayTeamPitches {
    assertEquals(34, inning.awayTeamPitches.size)
    assertEquals("25", inning.awayTeamPitches.head.id)
  }

}
