package com.xenopsconsulting.gamedayapi

import java.util.Date

case class HitChart(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    _xml = fetchStrategy.fetchHitChart(date, team, gid)
  }

  def hips() = (hitChartNode \ "hip").map(Hip(_))

  private def hitChartNode() = (xml \\ "hitchart")

}
