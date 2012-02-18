package com.xenopsconsulting.gamedayapi

import xml.Node

case class Inning(inningNode: Node) {

  def top() = HalfInning((inningNode \ "top").head)
  def bottom() = HalfInning((inningNode \ "bottom").head)

  def num = (inningNode \ "@num").text
  def homeTeam = (inningNode \ "@home_team").text
  def awayTeam = (inningNode \ "@away_team").text
  def next = (inningNode \ "@next").text

  /**
   * A convenience method for accessing all at-bats in the inning by both teams, in
   * the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def atBats() = {
    top.atBats ++ bottom.atBats
  }

  /**
   * A convenience method for accessing all pitches thrown in the inning by both teams, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def pitches() = {
    atBats.flatMap(atBat => atBat.pitches)
  }

}
