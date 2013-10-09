package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait LocalCachingFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String, nightcap: Boolean = false): FetchStrategy = {
    new LocalCachingFetchStrategy(date, team, nightcap)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new LocalCachingFetchStrategy(date, null)
  }

}
