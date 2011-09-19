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

  def gameId():String = (boxScoreNode \ "@game_id").text
  def gamePk():String = (boxScoreNode \ "@game_pk").text
  def venueId():String = (boxScoreNode \ "@venue_id").text
  def venueName():String = (boxScoreNode \ "@venue_name").text
  def homeSportCode():String = (boxScoreNode \ "@home_sport_code").text
  def homeTeamCode():String = (boxScoreNode \ "@home_team_code").text
  def awayTeamCode():String = (boxScoreNode \ "@away_team_code").text
  def homeId():String = (boxScoreNode \ "@home_id").text
  def awayId():String = (boxScoreNode \ "@away_id").text
  def homeFname():String = (boxScoreNode \ "@home_fname").text
  def awayFname():String = (boxScoreNode \ "@away_fname").text
  def homeSname():String = (boxScoreNode \ "@home_sname").text
  def homeWins():String = (boxScoreNode \ "@home_wins").text
  def homeLoss():String = (boxScoreNode \ "@home_loss").text
  def awayWins():String = (boxScoreNode \ "@away_wins").text
  def awayLoss():String = (boxScoreNode \ "@away_loss").text
  def statusInd():String = (boxScoreNode \ "@status_ind").text

  private def boxScoreNode():NodeSeq = (xml \\ "boxscore")

  private def pitcherList(home_or_away: String): List[Pitcher] = {
    val pitchingNode = boxScoreNode \ "pitching" \\ "_" filter attributeValueEquals(home_or_away)
    (pitchingNode \ "pitcher").foldLeft(List[Pitcher]())((list, pitcherNode) => list :+ new Pitcher(pitcherNode))
  }

  private def batterList(home_or_away: String): List[Batter] = {
    val batterNode = boxScoreNode \ "batting" \\ "_" filter attributeValueEquals(home_or_away)
    (batterNode \ "batter").foldLeft(List[Batter]())((list, batterNode) => list :+ new Batter(batterNode))
  }
}
