package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class LineScore(date: Date, team: String) extends XmlRepresentation {

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetch_strategy.fetchLineScore(date, team)
  }

  def gameId():String = (gameNode \ "@id").text

  private def gameNode():NodeSeq = (xml \\ "game")

}