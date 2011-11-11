package com.xenopsconsulting.gamedayapi

import java.util.Date

class HitChart(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchHitChart(date, team)
  }

}