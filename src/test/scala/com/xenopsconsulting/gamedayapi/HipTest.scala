package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class HipTest extends AssertionsForJUnit {
  var game: Game = _
  var hip: Hip = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    hip = game.hitChart.hips.head
  }

  @Test def testDes {
    assertEquals("Pop Out", hip.des)
  }

  @Test def testX {
    assertEquals("108.43", hip.x)
  }

  @Test def testY {
    assertEquals("146.59", hip.y)
  }

  @Test def testBatter {
    assertEquals("453056", hip.batter)
  }

  @Test def testPitcher {
    assertEquals("433587", hip.pitcher)
  }

  @Test def testHipType {
    assertEquals("O", hip.hipType)
  }

  @Test def testTeam {
    assertEquals("A", hip.team)
  }

  @Test def testInning {
    assertEquals("1", hip.inning)
  }

}
