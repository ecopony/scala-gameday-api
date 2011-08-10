package com.xenopsconsulting.gamedayapi

import dispatch._
import scala.xml._

class Game(team: String, date: String) {
  private var _xml:Elem = null

  def tm = team
  def dt = date

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def home_fname():String = {
    (xml \\ "boxscore" \\ "@home_fname").text
  }

  // Hardcoded to pull down a game for the time being
  def fetch() = {
    val http = new Http
    _xml = XML.loadString(http(url("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_07/gid_2011_08_07_phimlb_sfnmlb_1/boxscore.xml") as_str))
  }

}