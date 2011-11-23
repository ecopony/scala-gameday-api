package com.xenopsconsulting.gamedayapi

import scala.xml._

case class AtBat(atBatNode: Node) {

  def pitches() = (atBatNode \ "pitch").map (Pitch(_))
  def runners() = (atBatNode \ "runner").map (Runner(_))
  def pickoffs() = (atBatNode \ "po").map (Pickoff(_))

  def num() = ( atBatNode \ "@num" ).text
  def b() = ( atBatNode \ "@b" ).text
  def s() = ( atBatNode \ "@s" ).text
  def o() = ( atBatNode \ "@o" ).text
  def startTfs() = ( atBatNode \ "@start_tfs" ).text
  def startTfsZulu() = ( atBatNode \ "@start_tfs_zulu" ).text
  def batter() = ( atBatNode \ "@batter" ).text
  def stand() = ( atBatNode \ "@stand" ).text
  def bHeight() = ( atBatNode \ "@b_height" ).text
  def pitcher() = ( atBatNode \ "@pitcher" ).text
  def pThrows() = ( atBatNode \ "@p_throws" ).text
  def des() = ( atBatNode \ "@des" ).text
  def event() = ( atBatNode \ "@event" ).text
  def score() = ( atBatNode \ "@score" ).text
  def homeTeamRuns() = ( atBatNode \ "@home_team_runs" ).text
  def awayTeamRuns() = ( atBatNode \ "@away_team_runs" ).text

}