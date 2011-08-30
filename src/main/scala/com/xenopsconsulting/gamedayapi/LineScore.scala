package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class LineScore(date: Date, team: String) extends XmlRepresentation {

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetch_strategy.fetchLineScore(date, team)
  }

  def innings() = {
    (gameNode \ "linescore").foldLeft(List[LineScoreInning]())((list, inningNode) => list :+ new LineScoreInning(inningNode))
  }

  def winningPitcher() = new LineScorePitcher((gameNode \ "winning_pitcher").head)
  def losingPitcher() = new LineScorePitcher((gameNode \ "losing_pitcher").head)
  def savePitcher() = new LineScorePitcher((gameNode \ "save_pitcher").head)

  def gameId():String = (gameNode \ "@id").text
  def venue():String = (gameNode \ "@venue").text
  def gamePk():String = (gameNode \ "@game_pk").text
  def time():String = (gameNode \ "@time").text
  def timeZone():String = (gameNode \ "@time_zone").text
  def amPm():String = (gameNode \ "@ampm").text
  def awayTime():String = (gameNode \ "@away_time").text
  def awayTimeZone():String = (gameNode \ "@away_time_zone").text
  def awayAmPm():String = (gameNode \ "@away_ampm").text
  def homeTime():String = (gameNode \ "@home_time").text
  def homeTimeZone():String = (gameNode \ "@home_time_zone").text
  def homeAmPm():String = (gameNode \ "@home_ampm").text
  def gameType():String = (gameNode \ "@game_type").text
  def timeAwLg():String = (gameNode \ "@time_aw_lg").text
  def awLgAmPm():String = (gameNode \ "@aw_lg_ampm").text
  def tzAwLgGen():String = (gameNode \ "@tz_aw_lg_gen").text
  def timeHmLg():String = (gameNode \ "@time_hm_lg").text
  def hmLgAmPm():String = (gameNode \ "@hm_lg_ampm").text
  def tzHmLgGen():String = (gameNode \ "@tz_hm_lg_gen").text
  def venueId():String = (gameNode \ "@venue_id").text
  def scheduledInnings():String = (gameNode \ "@scheduled_innings").text
  def awayNameAbbrev():String = (gameNode \ "@away_name_abbrev").text
  def homeNameAbbrev():String = (gameNode \ "@home_name_abbrev").text
  def awayCode():String = (gameNode \ "@away_code").text
  def awayFileCode():String = (gameNode \ "@away_file_code").text
  def awayTeamId():String = (gameNode \ "@away_team_id").text
  def awayTeamCity():String = (gameNode \ "@away_team_city").text
  def awayTeamName():String = (gameNode \ "@away_team_name").text
  def awayDivision():String = (gameNode \ "@away_division").text
  def awayLeagueId():String = (gameNode \ "@away_league_id").text
  def awaySportCode():String = (gameNode \ "@away_sport_code").text
  def homeCode():String = (gameNode \ "@home_code").text
  def homeFileCode():String = (gameNode \ "@home_file_code").text
  def homeTeamId():String = (gameNode \ "@home_team_id").text
  def homeTeamCity():String = (gameNode \ "@home_team_city").text
  def homeTeamName():String = (gameNode \ "@home_team_name").text
  def homeDivision():String = (gameNode \ "@home_division").text
  def homeLeagueId():String = (gameNode \ "@home_league_id").text
  def homeSportCode():String = (gameNode \ "@home_sport_code").text
  def day():String = (gameNode \ "@day").text
  def gamedaySw():String = (gameNode \ "@gameday_sw").text
  def awayGamesBack():String = (gameNode \ "@away_games_back").text
  def homeGamesBack():String = (gameNode \ "@home_games_back").text
  def homeGamesBackWildcard():String = (gameNode \ "@home_games_back_wildcard").text

  private def gameNode():NodeSeq = (xml \\ "game")

}
