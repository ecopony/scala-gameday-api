package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningsTest extends AssertionsForJUnit {
  var innings: Innings = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = new Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
  }

  @Test def testAtBat {
    assertEquals("123660", innings.atBat)
  }

  @Test def testDeck {
    assertEquals("340192", innings.deck)
  }

  @Test def testHole {
    assertEquals("453056", innings.hole)
  }

}