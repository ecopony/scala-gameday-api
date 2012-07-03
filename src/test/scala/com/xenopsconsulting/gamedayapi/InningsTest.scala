package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningsTest extends AssertionsForJUnit {
  var innings: Innings = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = new Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
  }

  @Test def testAtBat {
    assertEquals("123660", innings.atBat)
  }

  @Test def testDeck {
    assertEquals("340192", innings.deck)
  }

  @Test def testHole {
    assertEquals("453056", innings.hole)
  }

  @Test def testInningInBoundsReturnsInning {
    assertNotNull(innings.inning(1).get)
  }

  @Test def testInningOutOfBoundsReturnsNone {
    assertEquals(None.getClass, innings.inning(14).getClass)
  }

  @Test def testAll {
    assertEquals(1, innings.all.size) // Only one inning in the test XML for innings
    assertEquals(Inning(<inning_node/>).getClass, innings.all.head.getClass)
  }

  @Test def testPitches {
    assertEquals(46, innings.pitches.size)
    assertEquals("3", innings.pitches.head.id)
  }

  @Test def testHomeTeamPitches {
    assertEquals(12, innings.homeTeamPitches.size)
    assertEquals("3", innings.homeTeamPitches.head.id)
  }

  @Test def testAwayTeamPitches {
    assertEquals(34, innings.awayTeamPitches.size)
    assertEquals("25", innings.awayTeamPitches.head.id)
  }

  @Test def testAtBats {
    assertEquals(11, innings.atBats.size)
    assertEquals("1", innings.atBats.head.num)
  }

  @Test def testHomeTeamAtBats {
    assertEquals(8, innings.homeTeamAtBats.size)
    assertEquals("4", innings.homeTeamAtBats.head.num)
  }

  @Test def testAwayTeamAtBats {
    assertEquals(3, innings.awayTeamAtBats.size)
    assertEquals("1", innings.awayTeamAtBats.head.num)
  }

}
