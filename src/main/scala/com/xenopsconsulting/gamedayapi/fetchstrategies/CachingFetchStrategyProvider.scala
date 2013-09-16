package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait CachingFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
    new LocalCachingFetchStrategy(date, team)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new LocalCachingFetchStrategy(date, null)
  }

}
