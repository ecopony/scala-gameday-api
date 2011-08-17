package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class FetchStrategyTest extends AssertionsForJUnit {
  var date: Date = _
  var team: String = _

  @Before def initialize() {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
  }

  @Test def testEpgUrlGeneration() {
    val epg_url = TestFetchStrategy.epg_url(date)
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/epg.xml", epg_url)
  }

  @Test def testGameUrlGeneration() {
    val game_url = TestFetchStrategy.game_url(date, team)
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/gid_2011_08_13_bosmlb_seamlb_1/game.xml", game_url)
  }
}



