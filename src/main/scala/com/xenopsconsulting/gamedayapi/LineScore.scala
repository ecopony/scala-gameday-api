package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

class LineScore(date: Date, team: String) extends XmlRepresentation {

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetchStrategy.fetchLineScore(date, team)
  }

  def innings() = {
    (gameNode \ "linescore").foldLeft(List[LineScoreInning]())((list, inningNode) => list :+ new LineScoreInning(inningNode))
  }

  def winningPitcher() = new LineScorePitcher((gameNode \ "winning_pitcher").head)
  def losingPitcher() = new LineScorePitcher((gameNode \ "losing_pitcher").head)
  def savePitcher() = new LineScorePitcher((gameNode \ "save_pitcher").head)

  def gameId():String = gna("@id")
  def venue():String = gna("@venue")
  def gamePk():String = gna("@game_pk")
  def time():String = gna("@time")
  def timeZone():String = gna("@time_zone")
  def amPm():String = gna("@ampm")
  def awayTime():String = gna("@away_time")
  def awayTimeZone():String = gna("@away_time_zone")
  def awayAmPm():String = gna("@away_ampm")
  def homeTime():String = gna("@home_time")
  def homeTimeZone():String = gna("@home_time_zone")
  def homeAmPm():String = gna("@home_ampm")
  def gameType():String = gna("@game_type")
  def timeAwLg():String = gna("@time_aw_lg")
  def awLgAmPm():String = gna("@aw_lg_ampm")
  def tzAwLgGen():String = gna("@tz_aw_lg_gen")
  def timeHmLg():String = gna("@time_hm_lg")
  def hmLgAmPm():String = gna("@hm_lg_ampm")
  def tzHmLgGen():String = gna("@tz_hm_lg_gen")
  def venueId():String = gna("@venue_id")
  def scheduledInnings():String = gna("@scheduled_innings")
  def awayNameAbbrev():String = gna("@away_name_abbrev")
  def homeNameAbbrev():String = gna("@home_name_abbrev")
  def awayCode():String = gna("@away_code")
  def awayFileCode():String = gna("@away_file_code")
  def awayTeamId():String = gna("@away_team_id")
  def awayTeamCity():String = gna("@away_team_city")
  def awayTeamName():String = gna("@away_team_name")
  def awayDivision():String = gna("@away_division")
  def awayLeagueId():String = gna("@away_league_id")
  def awaySportCode():String = gna("@away_sport_code")
  def homeCode():String = gna("@home_code")
  def homeFileCode():String = gna("@home_file_code")
  def homeTeamId():String = gna("@home_team_id")
  def homeTeamCity():String = gna("@home_team_city")
  def homeTeamName():String = gna("@home_team_name")
  def homeDivision():String = gna("@home_division")
  def homeLeagueId():String = gna("@home_league_id")
  def homeSportCode():String = gna("@home_sport_code")
  def day():String = gna("@day")
  def gamedaySw():String = gna("@gameday_sw")
  def awayGamesBack():String = gna("@away_games_back")
  def homeGamesBack():String = gna("@home_games_back")
  def homeGamesBackWildcard():String = gna("@home_games_back_wildcard")
  def venueWithChanLoc():String = gna("@venue_w_chan_loc")
  def gamedayLink():String = gna("@gameday_link")
  def awayWin():String = gna("@away_win")
  def awayLoss():String = gna("@away_loss")
  def homeWin():String = gna("@home_win")
  def homeLoss():String = gna("@home_loss")
  def league():String = gna("@league")
  def topInning():String = gna("@top_inning")
  def inningState():String = gna("@inning_state")
  def status():String = gna("@status")
  def ind():String = gna("@ind")
  def inning():String = gna("@inning")
  def outs():String = gna("@outs")
  def awayTeamRuns():String = gna("@away_team_runs")
  def homeTeamRuns():String = gna("@home_team_runs")
  def awayTeamHits():String = gna("@away_team_hits")
  def homeTeamHits():String = gna("@home_team_hits")
  def awayTeamErrors():String = gna("@away_team_errors")
  def homeTeamErrors():String = gna("@home_team_errors")
  def wrapupLink():String = gna("@wrapup_link")
  def homePreviewLink():String = gna("@home_preview_link")
  def awayPreviewLink():String = gna("@away_preview_link")
  def preview():String = gna("@preview")
  def tvStation():String = gna("@tv_station")
  def awayRecapLink():String = gna("@away_recap_link")
  def homeRecapLink():String = gna("@home_recap_link")
  def photosLink():String = gna("@photos_link")

  private def gameNode():NodeSeq = (xml \\ "game")
  private def gna(attribute: String):String = (gameNode \ attribute).text
  
}
