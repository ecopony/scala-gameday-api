package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait FetchStrategyProvider {

  def newFetchStrategy(date: Date, team: String, nightcap: Boolean = false): FetchStrategy = {
    new DefaultFetchStrategy(date, team, nightcap)
  }

  def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new DefaultFetchStrategy(date, null)
  }

}
