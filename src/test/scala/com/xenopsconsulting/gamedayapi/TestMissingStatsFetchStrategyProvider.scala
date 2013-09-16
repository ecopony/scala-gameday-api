package com.xenopsconsulting.gamedayapi

import fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestMissingStatsFetchStrategyProvider extends TestFetchStrategyProvider {

   override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
     new TestMissingStatsFetchStrategy(date, team)
   }

 }
