package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class BoxScoreTest extends AssertionsForJUnit {
  var boxScore: BoxScore = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    boxScore = new BoxScore(date, team)
    boxScore.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization {
    assertEquals("2011/08/13/bosmlb-seamlb-1", boxScore.gameId)
  }

}
