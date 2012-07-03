package com.xenopsconsulting.gamedayapi

import xml.Node

case class Inning(inningNode: Node, game: Game = null) {

  def top() = {
    try {
      HalfInning((inningNode \ "top").head, this)
    } catch {
      case e => {
        HalfInning(<top/>, this)
      }
    }
  }

  def bottom() = {
    try {
      HalfInning((inningNode \ "bottom").head, this)
    } catch {
      case e => {
        HalfInning(<bottom/>, this)
      }
    }
  }

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
   * A convenience method for accessing all at-bats in the inning by the home team, in
   * the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def homeTeamAtBats() = {
    bottom.atBats
  }

  /**
   * A convenience method for accessing all at-bats in the inning by the away team, in
   * the order in which they occurred.
   *
   * @return A list of AtBat objects
   */
  def awayTeamAtBats() = {
    top.atBats
  }

  /**
   * A convenience method for accessing all pitches thrown in the inning by both teams, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def pitches() = {
    atBats.flatMap(_.pitches)
  }

  /**
   * A convenience method for accessing all pitches thrown in the inning by the home team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def homeTeamPitches() = {
    top.atBats.flatMap(_.pitches)
  }

  /**
   * A convenience method for accessing all pitches thrown in the inning by the away team, in
   * the order in which they were thrown.
   *
   * @return A list of Pitch objects
   */
  def awayTeamPitches() = {
    bottom.atBats.flatMap(_.pitches)
  }

}
