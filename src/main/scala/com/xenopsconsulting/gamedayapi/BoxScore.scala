package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class BoxScore(date: Date, team: String) extends XmlRepresentation {
  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetch_strategy.fetchBoxScore(date, team)
  }

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
}