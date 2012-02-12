package com.xenopsconsulting.gamedayapi

import java.util.Date

case class GameEvents(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    _xml = fetchStrategy.fetchGameEvents(date, team, gid)
  }

}
