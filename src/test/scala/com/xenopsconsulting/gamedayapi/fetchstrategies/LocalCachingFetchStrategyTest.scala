package com.xenopsconsulting.gamedayapi.fetchstrategies

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class LocalCachingFetchStrategyTest extends AssertionsForJUnit {
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-05-06")
    team = "sea"
  }

  /* No assertions yet on the following. Just getting the basics wired up
     before diving into mocking/stubbing with Scala tests.
   */

//  @Test def testEpgCaching {
//    LocalCachingFetchStrategy.fetchEpg(date)
//  }
//
//  @Test def testGameCaching {
//    LocalCachingFetchStrategy.fetchGame(date, team)
//  }
//
//  @Test def testBoxScoreCaching {
//    LocalCachingFetchStrategy.fetchBoxScore(date, team)
//  }
//
//  @Test def testLineScoreCaching {
//    LocalCachingFetchStrategy.fetchLineScore(date, team)
//  }
//
//  @Test def testHitChartCaching {
//    LocalCachingFetchStrategy.fetchHitChart(date, team)
//  }
//
//  @Test def testInningScoresCaching {
//    LocalCachingFetchStrategy.fetchInningScores(date, team)
//  }
//
//  @Test def testGameEventsCaching {
//    LocalCachingFetchStrategy.fetchGameEvents(date, team)
//  }
}