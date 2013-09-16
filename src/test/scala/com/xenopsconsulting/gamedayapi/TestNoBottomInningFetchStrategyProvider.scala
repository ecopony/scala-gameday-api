package com.xenopsconsulting.gamedayapi

import fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestNoBottomInningFetchStrategyProvider extends TestFetchStrategyProvider {

   override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
     new TestNoBottomInningFetchStrategy(date, team)
   }

 }
