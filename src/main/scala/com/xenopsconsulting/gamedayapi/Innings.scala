package com.xenopsconsulting.gamedayapi

import java.util.Date
import xml.Node

case class Innings(date: Date, team: String, game: Game = null) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    try {
      _xml = fetchStrategy.fetchInnings(date, team, gid)
    } catch {
      case e => {
        _xml = <game/>
      }
    }
  }

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined &&
      node.attribute("num").get.text == number.toString)

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
   * A convenience method for accessing all of the at-bats from all
   * of the innings, in the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def atBats() = {
    all.flatMap(_.atBats)
  }

  /**
   * A convenience method for accessing all of the home team's at-bats from all
   * of the innings, in the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def homeTeamAtBats() = {
    all.flatMap(_.homeTeamAtBats)
  }

  /**
   * A convenience method for accessing all of the away team's at-bats from all
   * of the innings, in the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def awayTeamAtBats() = {
    all.flatMap(_.awayTeamAtBats)
  }

  /**
   * A convenience method for accessing all of the pitches from all
   * of the innings, in the order in which they were thrown.
   *
   * @return A list of Pitches objects
   */
  def pitches() = {
    all.flatMap(_.pitches)
  }

  /**
   * A convenience method for accessing all pitches thrown in all innings by the home team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def homeTeamPitches() = {
    all.flatMap(_.homeTeamPitches)
  }

  /**
   * A convenience method for accessing all pitches thrown in all innings by the away team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def awayTeamPitches() = {
    all.flatMap(_.awayTeamPitches)
  }

}
