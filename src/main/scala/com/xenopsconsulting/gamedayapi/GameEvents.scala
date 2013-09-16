package com.xenopsconsulting.gamedayapi

import xml.Node

case class GameEvents(game: Game) extends GamedayRepresentation {

  def fetch {
    _xml = game.fetchStrategy.fetchGameEvents()
  }

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node, game))
      case _ => None
    }
  }

}
