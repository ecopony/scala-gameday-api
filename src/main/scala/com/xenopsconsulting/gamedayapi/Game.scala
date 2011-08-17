package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class Game(date: Date, team: String) {
  private var _xml:Elem = null
  var fetch_strategy: FetchStrategy = MlbFetchStrategy

  def tm = team
  def dt = date

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def gameTimeEt():String = {
    (xml \\ "game" \\ "@game_time_et").text
  }

  def fetch() = {
    _xml = fetch_strategy.fetch_game(date, team)
  }

}