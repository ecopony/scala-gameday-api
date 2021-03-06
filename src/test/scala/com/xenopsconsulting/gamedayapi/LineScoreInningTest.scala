package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class LineScoreInningTest extends AssertionsForJUnit {
  var game: Game = _
  var lineScoreInning: LineScoreInning = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    val lineScore = game.boxScore().lineScore()
    lineScoreInning = lineScore.innings.head
  }

  @Test def testInning {
    assertEquals("1", lineScoreInning.inning)
  }

  @Test def testHomeInningRuns {
    assertEquals("5", lineScoreInning.homeInningRuns)
  }

  @Test def testAwayInningRuns {
    assertEquals("0", lineScoreInning.awayInningRuns)
  }

}
