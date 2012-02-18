package com.xenopsconsulting.gamedayapi

import java.util.Date

case class Innings(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {

  def fetch() = {
    _xml = fetchStrategy.fetchInnings(date, team, gid)
  }

  def atBat() = (gameNode \ "@atBat").text
  def deck() = (gameNode \ "@deck").text
  def hole() = (gameNode \ "@hole").text

  /**
   * A convenience method for accessing all individual innings in an
   * innings file, in the order in which they are played.
   *
   * @return A list of Inning objects
   */
  def all() = (gameNode \ "inning").map(Inning(_))

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
