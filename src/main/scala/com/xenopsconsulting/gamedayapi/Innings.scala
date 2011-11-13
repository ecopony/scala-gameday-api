package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class Innings(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team)
  }

  def atBat():String = (gameNode \ "@atBat").text
  def deck():String = (gameNode \ "@deck").text
  def hole():String = (gameNode \ "@hole").text

  private def gameNode():NodeSeq = (xml \\ "game")

}
