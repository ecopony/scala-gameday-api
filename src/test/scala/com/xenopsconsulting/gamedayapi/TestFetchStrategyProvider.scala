package com.xenopsconsulting.gamedayapi

import com.xenopsconsulting.gamedayapi.fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
    new TestFetchStrategy(date, team)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new TestFetchStrategy(date, null)
  }

}
