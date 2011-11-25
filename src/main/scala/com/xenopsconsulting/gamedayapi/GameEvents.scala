package com.xenopsconsulting.gamedayapi

import java.util.Date

case class GameEvents(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchGameEvents(date, team)
  }

}
