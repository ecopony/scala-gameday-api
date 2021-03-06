package com.xenopsconsulting.gamedayapi

import scala.xml._

case class AtBat(atBatNode: Node, half: String, inning: Inning = null) extends GamedayNode {

  def pitches() = (atBatNode \ "pitch").map (Pitch(_, this))
  def runners() = (atBatNode \ "runner").map (Runner(_, this))
  def pickoffs() = (atBatNode \ "po").map (Pickoff(_, this))

  def num() = ( atBatNode \ "@num" ).text
  def b() = ( atBatNode \ "@b" ).text
  def s() = ( atBatNode \ "@s" ).text
  def o() = ( atBatNode \ "@o" ).text
  def startTfs():Option[Int] = parseInt(( atBatNode \ "@start_tfs" ).text)
  def startTfsZulu() = ( atBatNode \ "@start_tfs_zulu" ).text
  def batter() = ( atBatNode \ "@batter" ).text
  def stand() = ( atBatNode \ "@stand" ).text
  def bHeight() = ( atBatNode \ "@b_height" ).text
  def pThrows() = ( atBatNode \ "@p_throws" ).text
  def des() = ( atBatNode \ "@des" ).text
  def event() = ( atBatNode \ "@event" ).text
  def score() = ( atBatNode \ "@score" ).text
  def homeTeamRuns() = ( atBatNode \ "@home_team_runs" ).text
  def awayTeamRuns() = ( atBatNode \ "@away_team_runs" ).text
  def b1() = ( atBatNode \ "@b1" ).text
  def b2() = ( atBatNode \ "@b2" ).text
  def b3() = ( atBatNode \ "@b3" ).text

  /**
   * This pitcher method does not return the id of the pitcher that is in
   * the Gameday XML, but instead returns a reference to a pitcher object.
   * To obtain the id in the XML, you may call Pitcher#id
   *
   * @return Pitcher
   */
  def pitcher() = {
    val game = inning.game
    game.pitchers().find(_.id == (atBatNode \ "@pitcher").text).get
  }

  /**
   * Convenience method that returns the three-letter code for the batting team of the at-bat.
   */
  def battingTeam() = {
    if (half == "top") {
      inning.awayTeam
    } else {
      inning.homeTeam
    }
  }

  /**
   * Convenience method that returns the three-letter code for the pitching team of the at-bat.
   */
  def pitchingTeam() = {
    if (half == "top") {
      inning.homeTeam
    } else {
      inning.awayTeam
    }
  }

}