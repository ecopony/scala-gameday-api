package com.xenopsconsulting.gamedayapi

import java.util.Date

case class InningScores(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchInningScores(date, team)
  }

  def scores() = ( scoresNode \ "score" ).map(Score(_))

  //     <scores away_team="bos" home_team="sea">

  private def scoresNode() = (xml \\ "scores")

}
