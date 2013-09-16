package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningScoresTest extends AssertionsForJUnit {
  var game: Game = _
  var inningScores: InningScores = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    inningScores = game.inningScores()
  }

  @Test def testHomeTeam {
    assertEquals("sea", inningScores.homeTeam)
  }

  @Test def testHomeAway {
    assertEquals("bos", inningScores.awayTeam)
  }

  @Test def testScoresExist {
    assertFalse(inningScores.scores.isEmpty)
  }

}
