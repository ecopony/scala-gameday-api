package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class ScoreTest extends AssertionsForJUnit {
  var game: Game = _
  var inningScores: InningScores = _
  var score: Score = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    inningScores = game.inningScores()
    score = inningScores.scores.head
  }

  @Test def testInn {
    assertEquals("1", score.inn)
  }

  @Test def testAtBatNum {
    assertEquals("4", score.atBatNum)
  }

  @Test def testTopInning {
    assertEquals("N", score.topInning)
  }

  @Test def testHome {
    assertEquals("1", score.home)
  }

  @Test def testAway {
    assertEquals("0", score.away)
  }

  @Test def testPbp {
    assertEquals("Ichiro Suzuki homers (2) on a line drive to right field. ", score.pbp)
  }

  @Test def testAtBatExists {
    assertNotNull(score.atBat)
  }

  @Test def testAtBatScoreAttributes {
    assertEquals("T", score.atBat.score)
    assertEquals("1", score.atBat.homeTeamRuns)
    assertEquals("0", score.atBat.awayTeamRuns)
  }

  @Test def testScoreAtBatHasPitches {
    assertEquals(1, score.atBat.pitches.size)
  }

  @Test def testScoreAtBatHasRunners {
    assertEquals(1, score.atBat.runners.size)
  }

  @Test def testHalf {
    assertEquals("bottom", score.half())
  }

}
