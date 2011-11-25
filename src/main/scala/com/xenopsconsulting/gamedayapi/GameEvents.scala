package com.xenopsconsulting.gamedayapi

import java.util.Date
import xml.Node

case class GameEvents(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchGameEvents(date, team)
  }

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node))
      case _ => None
    }
  }

  private def gameNode() = (xml \\ "game")

}
