package com.xenopsconsulting.gamedayapi

import xml.Elem
import java.util.Date
import java.text.SimpleDateFormat

trait FetchStrategy {
  private val base_mlb_url: String = "http://gd2.mlb.com/components/game/mlb"

  def fetch: Elem
  def fetch_epg(date: Date): Elem
  def fetch_game(date: Date, team: String): Elem

  def epg_url(date: Date): String = {
    val url_buffer: StringBuffer = new StringBuffer(base_mlb_url)
    url_buffer.append("/year_")
    url_buffer.append(new SimpleDateFormat("yyyy").format(date))
    url_buffer.append("/month_")
    url_buffer.append(new SimpleDateFormat("MM").format(date))
    url_buffer.append("/day_")
    url_buffer.append(new SimpleDateFormat("dd").format(date))
    url_buffer.append("/epg.xml")
    url_buffer.toString
  }
  
  def game_url(date: Date, team: String): String = {
    /*
    TODO:
      - Get the epg xml for the date
      - Spin through the game elements, get the gid for the first game for the team provided
      - Build the url based on the gameday attribute
     */
    val url_buffer: StringBuffer = new StringBuffer(base_mlb_url)
    url_buffer.toString
  }
}