package com.xenopsconsulting.gamedayapi.fetchstrategies

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class S3CachingFetchStrategyTest extends AssertionsForJUnit {
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
//    S3CachingFetchStrategy.fetchEpg(date)
//  }
//
//  @Test def testGameCaching {
//    S3CachingFetchStrategy.fetchGame(date, team)
//  }
//
//  @Test def testBoxScoreCaching {
//    S3CachingFetchStrategy.fetchBoxScore(date, team)
//  }
//
//  @Test def testLineScoreCaching {
//    S3CachingFetchStrategy.fetchLineScore(date, team)
//  }
//
//  @Test def testHitChartCaching {
//    S3CachingFetchStrategy.fetchHitChart(date, team)
//  }

  @Test def testInningScoresCaching {
    S3CachingFetchStrategy.fetchInningScores(date, team)
  }

  @Test def testGameEventsCaching {
    S3CachingFetchStrategy.fetchGameEvents(date, team)
  }

}