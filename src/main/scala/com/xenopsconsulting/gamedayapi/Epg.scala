package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import xml.Elem
import java.util.Date

class Epg(date: Date) {
  protected var _xml:Elem = null
  var fetchStrategy: FetchStrategy = DefaultFetchStrategy

  def fetch() {
    _xml = fetchStrategy.fetchEpg(date)
  }

  def xml():Elem = {
    if (_xml == null) fetch()
    _xml
  }


}
