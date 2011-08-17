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

  def gameTimeEt():String = (gameNode \ "@game_time_et").text
  def gameType():String = (gameNode \ "@type").text
  def localGameTime():String = (gameNode \ "@local_game_time").text
  def gamedaySw():String = (gameNode \ "@gameday_sw").text
  def homeTeamCode():String = (teamNode("home") \ "@code").text
  def awayTeamCode():String = (teamNode("away") \ "@code").text
  
  private def fetch() = {
    _xml = fetch_strategy.fetch_game(date, team)
  }

  private def gameNode():NodeSeq = (xml \\ "game")
  private def teamNode(name: String) = ((gameNode \ "team" ) find { _.attribute("type").get.text == name }).get
}