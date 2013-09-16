package com.xenopsconsulting.gamedayapi.fetchstrategies

import java.util.Date

trait FetchStrategyProvider {

  def newFetchStrategy(date: Date, team: String): FetchStrategy = {
    new DefaultFetchStrategy(date, team)
  }

  def newEpgFetchStrategy(date: Date): FetchStrategy = {
    new DefaultFetchStrategy(date, null)
  }

}
