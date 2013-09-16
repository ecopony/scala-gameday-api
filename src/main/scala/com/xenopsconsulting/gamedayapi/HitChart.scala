package com.xenopsconsulting.gamedayapi


case class HitChart(game: Game) extends GamedayRepresentation {

  def fetch {
    _xml = game.fetchStrategy.fetchHitChart()
  }

  def hips() = (hitChartNode \ "hip").map(Hip(_))

  private def hitChartNode() = (xml \\ "hitchart")

}
