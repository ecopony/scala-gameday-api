package com.xenopsconsulting.gamedayapi

import java.util.Date
import java.text.SimpleDateFormat
import xml.Elem

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"

  def fetch_epg(date: Date): Elem
  def fetch_game(date: Date, team: String): Elem

  def epg_url(date: Date): String = {
    val url_buffer: StringBuffer = new StringBuffer(base_mlb_url)
    url_buffer.append(date_path(date))
    url_buffer.append("/epg.xml")
    url_buffer.toString
  }
  
  def game_url(date: Date, team: String): String = {
    val url_buffer: StringBuffer = new StringBuffer(base_mlb_url)
    url_buffer.append(date_path(date))
    val epg_xml: Elem = fetch_epg(date)
    val gameday = (epg_xml \ "game" \\ "@gameday") find { _.text contains "_" + team + "mlb_" }
    val gid:String = "/gid_" + gameday.getOrElse("")
    url_buffer.append(gid)
    url_buffer.append("/game.xml")
    url_buffer.toString
  }

  private def date_path(date: Date): String = {
    val url_buffer: StringBuffer = new StringBuffer("/year_")
    url_buffer.append(new SimpleDateFormat("yyyy").format(date))
    url_buffer.append("/month_")
    url_buffer.append(new SimpleDateFormat("MM").format(date))
    url_buffer.append("/day_")
    url_buffer.append(new SimpleDateFormat("dd").format(date))
    url_buffer.toString
  }
}