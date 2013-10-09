package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait S3CachingFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String, nightcap: Boolean = false): FetchStrategy = {
    new S3CachingFetchStrategy(date, team, nightcap)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new S3CachingFetchStrategy(date, null)
  }

}
