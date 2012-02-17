package com.xenopsconsulting.gamedayapi

import xml.Node
import collection.mutable.ListBuffer

case class Inning(inningNode: Node) {

  def top() = HalfInning((inningNode \ "top").head)
  def bottom() = HalfInning((inningNode \ "bottom").head)

  def num = (inningNode \ "@num").text
  def homeTeam = (inningNode \ "@home_team").text
  def awayTeam = (inningNode \ "@away_team").text
  def next = (inningNode \ "@next").text

  /**
   * A helper method for accessing all pitches thrown in the inning by both teams, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def pitches() = {
    val pitchBuffer:ListBuffer[Pitch] = new ListBuffer()
    top.atBats.foreach(atBat => pitchBuffer.appendAll(atBat.pitches()))
    bottom.atBats.foreach(atBat => pitchBuffer.appendAll(atBat.pitches()))
    pitchBuffer.toList
  }

}
