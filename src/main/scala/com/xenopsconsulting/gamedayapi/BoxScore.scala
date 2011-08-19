package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class BoxScore(date: Date, team: String) {
  private var _xml:Elem = null
  var fetch_strategy: FetchStrategy = MlbFetchStrategy

  def tm = team
  def dt = date

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def gameId():String = {
    (boxScoreNode \ "@game_id").text
  }

  private def fetch() = {
    _xml = fetch_strategy.fetchBoxScore(date, team)
  }

  private def boxScoreNode():NodeSeq = (xml \\ "boxscore")
  
}