package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class BoxScore(date: Date, team: String) extends XmlRepresentation {
  private var _lineScore:LineScore = _

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetchStrategy.fetchBoxScore(date, team)
  }

  def lineScore() = {
    if (_lineScore == null) _lineScore = new LineScore(date, team)
    _lineScore
  }

  def homePitchers() = pitcherList("home")
  def awayPitchers() = pitcherList("away")
  def homeBatters() = batterList("home")
  def awayBatters() = batterList("away")

  def gameId():String = bsna("@game_id")
  def gamePk():String = bsna("@game_pk")
  def venueId():String = bsna("@venue_id")
  def venueName():String = bsna("@venue_name")
  def homeSportCode():String = bsna("@home_sport_code")
  def homeTeamCode():String = bsna("@home_team_code")
  def awayTeamCode():String = bsna("@away_team_code")
  def homeId():String = bsna("@home_id")
  def awayId():String = bsna("@away_id")
  def homeFname():String = bsna("@home_fname")
  def awayFname():String = bsna("@away_fname")
  def homeSname():String = bsna("@home_sname")
  def homeWins():String = bsna("@home_wins")
  def homeLoss():String = bsna("@home_loss")
  def awayWins():String = bsna("@away_wins")
  def awayLoss():String = bsna("@away_loss")
  def statusInd():String = bsna("@status_ind")

  private def boxScoreNode():NodeSeq = (xml \\ "boxscore")

  private def pitchingNode(home_or_away: String):NodeSeq = {
    boxScoreNode \ "pitching" \\ "_" filter attributeValueEquals(home_or_away)
  }

  private def battingNode(home_or_away: String):NodeSeq = {
    boxScoreNode \ "batting" \\ "_" filter attributeValueEquals(home_or_away)
  }

  private def pitcherList(home_or_away: String): List[Pitcher] = {
    (pitchingNode(home_or_away) \ "pitcher").foldLeft(List[Pitcher]())((list, pitcherNode) => list :+ new Pitcher(pitcherNode))
  }

  private def batterList(home_or_away: String): List[Batter] = {
    (battingNode(home_or_away) \ "batter").foldLeft(List[Batter]())((list, batterNode) => list :+ new Batter(batterNode))
  }

  private def bsna(attribute: String):String = (boxScoreNode \ attribute).text
}
