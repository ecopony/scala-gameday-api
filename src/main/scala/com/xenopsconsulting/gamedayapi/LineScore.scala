package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class LineScore(date: Date, team: String) extends XmlRepresentation {

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetch_strategy.fetchLineScore(date, team)
  }

  def innings() = {
    (gameNode \ "linescore").foldLeft(List[LineScoreInning]())((list, inningNode) => list :+ new LineScoreInning(inningNode))
  }

  def winningPitcher() = new LineScorePitcher((gameNode \ "winning_pitcher").head)
  def losingPitcher() = new LineScorePitcher((gameNode \ "losing_pitcher").head)
  def savePitcher() = new LineScorePitcher((gameNode \ "save_pitcher").head)

  def gameId():String = (gameNode \ "@id").text

  private def gameNode():NodeSeq = (xml \\ "game")

}
