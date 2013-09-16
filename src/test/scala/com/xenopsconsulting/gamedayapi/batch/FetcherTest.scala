package com.xenopsconsulting.gamedayapi.batch

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import com.xenopsconsulting.gamedayapi.fetchstrategies.LocalCachingFetchStrategy
import com.xenopsconsulting.gamedayapi.Game
import org.slf4j.LoggerFactory

class FetcherTest extends AssertionsForJUnit {
  private val _log = LoggerFactory.getLogger(getClass)

  def callback(game: Game) {
    _log.info("---------------------")
  }

  @Test
  def testFetcher() {
    val fetcher: Fetcher = new Fetcher()
//    fetcher.fetchByYearAndTeam(2012, "sea", callback) // Don't do this unless you want to download all the files for a team for the year
  }

}
