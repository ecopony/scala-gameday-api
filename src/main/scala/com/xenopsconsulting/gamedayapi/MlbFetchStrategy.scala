package com.xenopsconsulting.gamedayapi

import scala.xml._
import dispatch._
import java.util.Date

object MlbFetchStrategy extends FetchStrategy {

  def fetch: Elem = {
    val http = new Http
    XML.loadString(http(url("http://gd2.mlb.com/components/game/mlb/year_2011/month_08/day_07/gid_2011_08_07_phimlb_sfnmlb_1/boxscore.xml") as_str))
  }

  def fetch_epg(date: Date): Elem = {
    val http = new Http
    XML.loadString(http(url(epg_url(date)) as_str))
  }

  def fetch_game(date: Date, team: String): Elem = {
    <game></game>
  }

}