package com.xenopsconsulting.gamedayapi

import batch.Fetcher
import fetchstrategies.LocalCachingFetchStrategy
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test

class FetcherTest extends AssertionsForJUnit {

  @Test
  def testFetcher() {
    val fetcher: Fetcher = new Fetcher(LocalCachingFetchStrategy)
    // fetcher.fetchByYearAndTeam(2012, "sea") // Don't do this unless you want to download all the files for a team for the year
  }

}
