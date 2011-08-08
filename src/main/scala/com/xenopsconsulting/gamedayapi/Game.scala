package com.xenopsconsulting.gamedayapi

import dispatch._
import scala.xml._

class Game(team: String, date: String) {

  def tm() = team
  def dt() = date

  // Just feeling my way through dispatch and XML processing in Scala... hardcoded to pull
  // down a game and spit out some XML from the doc.
  def fetch() = {
    val http = new Http
    val response = XML.loadString(http(url("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_07/gid_2011_08_07_phimlb_sfnmlb_1/boxscore.xml") as_str))
    (response \\ "boxscore" \\ "batting" ).toList.foreach(x => println(x.text))
  }

}