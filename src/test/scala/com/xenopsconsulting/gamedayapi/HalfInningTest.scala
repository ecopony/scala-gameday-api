package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class HalfInningTest extends AssertionsForJUnit {
  var game: Game = _
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    innings = game.innings()
    inning = innings.inning(1).get
  }

  @Test def testTopHasAtBats {
    assertFalse(inning.top.atBats.isEmpty)
  }

  @Test def testBottomHasAtBats {
    assertFalse(inning.bottom.atBats.isEmpty)
  }

}
