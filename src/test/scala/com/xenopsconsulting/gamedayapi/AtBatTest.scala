package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class AtBatTest extends AssertionsForJUnit {
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _
  var top_first_at_bats: Seq[AtBat] = _
  var bottom_first_at_bats: Seq[AtBat] = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = new Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
    top_first_at_bats = innings.inning(1).get.top.atBats
    bottom_first_at_bats = innings.inning(1).get.bottom.atBats
  }
  
  @Test def testNum {
    assertEquals("1", top_first_at_bats.head.num)
  }

  @Test def testB {
    assertEquals("1", top_first_at_bats.head.b)
  }

  @Test def testS {
    assertEquals("2", top_first_at_bats.head.s)
  }

  @Test def testO {
    assertEquals("1", top_first_at_bats.head.o)
  }

  @Test def testStartTfs {
    assertEquals("220954", top_first_at_bats.head.startTfs)
  }

  @Test def testStartTfsZulu {
    assertEquals("2011-08-14T02:09:54Z", top_first_at_bats.head.startTfsZulu)
  }

  @Test def testBatter {
    assertEquals("453056", top_first_at_bats.head.batter)
  }

  @Test def testStand {
    assertEquals("L", top_first_at_bats.head.stand)
  }
  
  @Test def testBHeight {
    assertEquals("6-1", top_first_at_bats.head.bHeight)
  }

  @Test def testPitcher {
    assertEquals("433587", top_first_at_bats.head.pitcher)
  }

  @Test def testPThrows {
    assertEquals("R", top_first_at_bats.head.pThrows)
  }

  @Test def testDes {
    assertEquals("Jacoby Ellsbury pops out to shortstop Jack Wilson. ", top_first_at_bats.head.des)
  }

  @Test def testEvent {
    assertEquals("Pop Out", top_first_at_bats.head.event)
  }

  @Test def testScore {
    assertEquals("", top_first_at_bats.head.score)
  }

  @Test def testHomeTeamRuns {
    assertEquals("", top_first_at_bats.head.homeTeamRuns)
  }

  @Test def testAwayTeamRuns {
    assertEquals("", top_first_at_bats.head.awayTeamRuns)
  }

  @Test def testPitchesExist {
    assertEquals(4, top_first_at_bats.head.pitches.size)
    assertEquals(1, bottom_first_at_bats.head.pitches.size)
  }

  @Test def testRunnersExist {
    assertEquals(0, top_first_at_bats.head.runners.size)
    assertEquals(1, bottom_first_at_bats.head.runners.size)
  }

  @Test def testPickoffsExist {
    assertEquals(1, bottom_first_at_bats.takeRight(6).head.pickoffs.size)
  }

}
