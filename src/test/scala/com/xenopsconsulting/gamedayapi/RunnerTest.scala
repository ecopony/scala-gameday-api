package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class RunnerTest extends AssertionsForJUnit {
  var inningScores: InningScores = _
  var runner: Runner = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    inningScores = InningScores(date, team)
    inningScores.fetchStrategy = TestFetchStrategy
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

}
