package com.xenopsconsulting.gamedayapi

import java.util.Date
import xml.NodeSeq

class HitChart(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchHitChart(date, team)
  }

  def hips() = {
    (hitChartNode \ "hip").foldLeft(List[Hip]())((list, hipNode) => list :+ new Hip(hipNode))
  }

  private def hitChartNode():NodeSeq = (xml \\ "hitchart")

}
