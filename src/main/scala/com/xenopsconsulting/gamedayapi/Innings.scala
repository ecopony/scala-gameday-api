package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

case class Innings(date: Date, team: String) extends XmlRepresentation {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team)
  }

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node))
      case _ => None
    }
  }

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

  private def gameNode() = (xml \\ "game")

}
