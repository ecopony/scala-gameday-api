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
    innings = new Innings(date, team)
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
    assertEquals(AtBat(<atbat_node/>).getClass, inning.atBats.head.getClass)
  }

  @Test def testPitches {
    assertEquals(46, inning.pitches.size)
    assertEquals(Pitch(<pitch_node/>).getClass, inning.pitches.head.getClass)
  }

}
