package com.xenopsconsulting.gamedayapi

import xml.Elem

trait XmlRepresentation {
  protected var _xml:Elem = null
  var fetch_strategy: FetchStrategy = MlbFetchStrategy

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def fetch
}