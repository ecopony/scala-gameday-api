package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningScoresTest extends AssertionsForJUnit {
  var inningScores: InningScores = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    inningScores = InningScores(date, team)
    inningScores.fetchStrategy = TestFetchStrategy
  }

  @Test def testScoresExist {
    assertFalse(inningScores.scores.isEmpty)
  }

}
