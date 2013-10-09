package com.xenopsconsulting.gamedayapi

import fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import java.util.Date

trait TestEmptyXmlFetchStrategyProvider extends TestFetchStrategyProvider {

   override def newFetchStrategy(date: Date, team: String, nightcap: Boolean = false): FetchStrategy = {
     new TestEmptyXmlFetchStrategy(date, team, false)
   }

 }
