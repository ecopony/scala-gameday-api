package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class BoxScore(date: Date, team: String) extends XmlRepresentation {
  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetch_strategy.fetchBoxScore(date, team)
  }

  def gameId():String = (boxScoreNode \ "@game_id").text

  private def boxScoreNode():NodeSeq = (xml \\ "boxscore")
}