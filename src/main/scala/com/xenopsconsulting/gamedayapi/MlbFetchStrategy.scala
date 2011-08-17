package com.xenopsconsulting.gamedayapi

import scala.xml._
import dispatch._
import java.util.Date

object MlbFetchStrategy extends FetchStrategy {

  def fetch_epg(date: Date): Elem = {
    val http = new Http
    XML.loadString(http(url(epg_url(date)) as_str))
  }

  def fetch_game(date: Date, team: String): Elem = {
    val http = new Http
    XML.loadString(http(url(game_url(date, team)) as_str))
  }

}