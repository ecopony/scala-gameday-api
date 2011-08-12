package com.xenopsconsulting.gamedayapi

import scala.xml._

class Game(team: String, date: String) {
  private var _xml:Elem = null
  var fetch_strategy: FetchStrategy = MlbFetchStrategy

  def tm = team
  def dt = date

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def homeFname():String = {
    (xml \\ "boxscore" \\ "@home_fname").text
  }

  def fetch() = {
    _xml = fetch_strategy.fetch
  }

}