package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class RunnerTest extends AssertionsForJUnit {
  var game: Game = _
  var inningScores: InningScores = _
  var runner: Runner = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    inningScores = game.inningScores()
    runner = inningScores.scores.head.atBat.runners.head
  }

  @Test def testId {
    assertEquals("400085", runner.id)
  }

  @Test def testStart {
    assertEquals("", runner.start)
  }

  @Test def testEnd {
    assertEquals("", runner.end)
  }

  @Test def testEvent {
    assertEquals("Home Run", runner.event)
  }

  @Test def testScore {
    assertEquals("T", runner.score)
  }

  @Test def testRbi {
    assertEquals("T", runner.rbi)
  }

  @Test def testEarned {
    assertEquals("T", runner.earned)
  }
  
  @Test def testAtBat {
    assertEquals(inningScores.scores.head.atBat, runner.atBat)
  }

}
