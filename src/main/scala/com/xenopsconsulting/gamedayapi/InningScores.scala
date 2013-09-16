package com.xenopsconsulting.gamedayapi


case class InningScores(game: Game) extends GamedayRepresentation {

  def fetch {
    _xml = game.fetchStrategy.fetchInningScores()
  }

  def scores() = (scoresNode \ "score").map(Score(_))

  def homeTeam() = (scoresNode \ "@home_team").text
  def awayTeam() = (scoresNode \ "@away_team").text

  private def scoresNode() = (xml \\ "scores")

}
