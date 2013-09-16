package com.xenopsconsulting.gamedayapi

import fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestEmptyXmlFetchStrategyProvider extends TestFetchStrategyProvider {

   override def newFetchStrategy(date: Date, team: String): FetchStrategy = {
     new TestEmptyXmlFetchStrategy(date, team)
   }

 }
