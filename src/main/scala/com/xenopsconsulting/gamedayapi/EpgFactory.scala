package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import java.util.Date

class EpgFactory(fetchStrategy: FetchStrategy) {

  def this() {
    this(DefaultFetchStrategy)
  }

  def epgFor(date: Date): Epg = {
    val epg: Epg = new Epg(date)
    epg.fetchStrategy = fetchStrategy
    epg
  }

}
