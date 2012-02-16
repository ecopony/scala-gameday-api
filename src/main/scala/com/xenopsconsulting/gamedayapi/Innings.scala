package com.xenopsconsulting.gamedayapi

import java.util.Date

case class Innings(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team, gid)
  }

  def all() = (gameNode \ "inning").map(Inning(_))

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

}
