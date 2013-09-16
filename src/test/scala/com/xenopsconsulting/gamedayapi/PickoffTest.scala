package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class PickoffTest extends AssertionsForJUnit {
  var game: Game = _
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _
  var top_first_at_bats: Seq[AtBat] = _
  var bottom_first_at_bats: Seq[AtBat] = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    innings = game.innings()
    bottom_first_at_bats = innings.inning(1).get.bottom.atBats
  }

  @Test def testDes {
    assertEquals("Pickoff Attempt 1B", bottom_first_at_bats.takeRight(6).head.pickoffs.head.des)
  }
  
  @Test def testAtBat {
    assertEquals(bottom_first_at_bats.takeRight(6).head, bottom_first_at_bats.takeRight(6).head.pickoffs.head.atBat)
  }

}
