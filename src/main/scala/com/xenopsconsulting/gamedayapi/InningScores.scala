package com.xenopsconsulting.gamedayapi

import java.util.Date

case class InningScores(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchInningScores(date, team)
  }

  def scores() = (scoresNode \ "score").map(Score(_))

  def homeTeam() = (scoresNode \ "@home_team").text
  def awayTeam() = (scoresNode \ "@away_team").text

  private def scoresNode() = (xml \\ "scores")

}
