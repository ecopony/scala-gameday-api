package com.xenopsconsulting.gamedayapi

import java.util.Date
import xml.Node

case class Innings(date: Date, team: String, game: Game = null) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team, gid)
  }

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node, game))
      case _ => None
    }
  }

  /**
   * A convenience method for accessing all individual innings in an
   * innings file, in the order in which they are played.
   *
   * @return A list of Inning objects
   */
  def all() = (gameNode \ "inning").map(Inning(_, game))

  /**
   * A convenience method for accessing all of the pitches from all
   * of the innings, in the order in which they were thrown.
   *
   * @return A list of Pitches objects
   */
  def pitches() = {
    all.flatMap(_.pitches)
  }

}
