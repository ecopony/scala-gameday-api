package com.xenopsconsulting.gamedayapi.batch

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import com.xenopsconsulting.gamedayapi.fetchstrategies.LocalCachingFetchStrategy
import com.xenopsconsulting.gamedayapi.Game

class FetcherTest extends AssertionsForJUnit {

  def callback(game: Game) {
    println("---------------------")
    println(game)
  }

  @Test
  def testFetcher() {
    val fetcher: Fetcher = new Fetcher(LocalCachingFetchStrategy)
//    fetcher.fetchByYearAndTeam(2012, "sea", callback) // Don't do this unless you want to download all the files for a team for the year
  }

}
