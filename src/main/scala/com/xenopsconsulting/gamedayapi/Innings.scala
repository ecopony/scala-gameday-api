package com.xenopsconsulting.gamedayapi

import java.util.Date

case class Innings(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team)
  }

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

}
