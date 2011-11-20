package com.xenopsconsulting.gamedayapi

import java.util.Date

case class HitChart(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchHitChart(date, team)
  }

  def hips() = (hitChartNode \ "hip").map(Hip(_))

  private def hitChartNode() = (xml \\ "hitchart")

}
