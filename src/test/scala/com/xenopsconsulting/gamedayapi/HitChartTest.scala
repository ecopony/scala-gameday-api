package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class HitChartTest extends AssertionsForJUnit {
  var game: Game = _
  var hitChart: HitChart = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    hitChart = game.hitChart
  }

  @Test def testFetchStrategyPropagation {
//    assertEquals(TestFetchStrategy.getClass, hitChart.fetchStrategy.getClass)
  }

  @Test def testHipsExist {
    assertNotNull(hitChart.hips)
    assertEquals(48, hitChart.hips.size)
  }

}
