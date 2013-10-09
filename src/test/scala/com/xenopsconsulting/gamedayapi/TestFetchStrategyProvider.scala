package com.xenopsconsulting.gamedayapi

import com.xenopsconsulting.gamedayapi.fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestFetchStrategyProvider extends FetchStrategyProvider {

  override def newFetchStrategy(date: Date, team: String, nightcap: Boolean = false): FetchStrategy = {
    new TestFetchStrategy(date, team, false)
  }

  override def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new TestFetchStrategy(date, null)
  }

}
