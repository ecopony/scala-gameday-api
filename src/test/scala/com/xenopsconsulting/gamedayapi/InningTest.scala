package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class InningTest extends AssertionsForJUnit {
  var innings: Innings = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = new Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
  }

  @Test def testAtBatsExist {
    assertNotNull(innings.inning(1).get.top.atBats)
  }

  
}
