package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait S3CachingFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
    new S3CachingFetchStrategy(date, team)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new S3CachingFetchStrategy(date, null)
  }

}
