package com.xenopsconsulting.gamedayapi.fetchstrategies

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date
import com.xenopsconsulting.gamedayapi.{TestFetchStrategyProvider, Game, TestFetchStrategy}

class FetchStrategyTest extends AssertionsForJUnit {
  var game: Game = _
  var date: Date = _
  var team: String = _
  var fetchStrategy: FetchStrategy = _

  @Before def initialize() {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    fetchStrategy = game.fetchStrategy
  }

  @Test def testEpgUrlGeneration() {
    val epgUrl = fetchStrategy.epgUrl()
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/epg.xml", epgUrl)
  }

  @Test def testGameUrlGeneration() {
    val gameUrl = fetchStrategy.gameUrl()
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/gid_2011_08_13_bosmlb_seamlb_1/game.xml", gameUrl)
  }

  @Test def testBoxScoreUrlGeneration() {
    val boxScoreUrl = fetchStrategy.boxScoreUrl()
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/gid_2011_08_13_bosmlb_seamlb_1/boxscore.xml", boxScoreUrl)
  }
  
  @Test def testLineScoreUrlGeneration() {
    val lineScoreUrl = fetchStrategy.lineScoreUrl()
    assertEquals("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_13/gid_2011_08_13_bosmlb_seamlb_1/linescore.xml", lineScoreUrl)
  }
}



