package com.xenopsconsulting.gamedayapi

import java.util.Date

case class LineScore(date: Date, team: String) extends XmlRepresentation {
  private var _winningPitcher:LineScorePitcher = _
  private var _losingPitcher:LineScorePitcher = _
  private var _savePitcher:LineScorePitcher = _

  def fetch() = {
    _xml = fetchStrategy.fetchLineScore(date, team)
  }

  def innings() = {
    (gameNode \ "linescore").map(LineScoreInning(_))
  }

  def winningPitcher() = {
    if (_winningPitcher == null) {
      _winningPitcher = LineScorePitcher((gameNode \ "winning_pitcher").head)
    }
    _winningPitcher
  }

  def losingPitcher() = {
    if (_losingPitcher == null) {
      _losingPitcher = LineScorePitcher((gameNode \ "losing_pitcher").head)
    }
    _losingPitcher
  }

  def savePitcher() = {
    if (_savePitcher == null) {
      _savePitcher = LineScorePitcher((gameNode \ "save_pitcher").head)
    }
    _savePitcher
  }

  def gameId() = gna("@id")
  def venue() = gna("@venue")
  def gamePk() = gna("@game_pk")
  def time() = gna("@time")
  def timeZone() = gna("@time_zone")
  def amPm() = gna("@ampm")
  def awayTime() = gna("@away_time")
  def awayTimeZone() = gna("@away_time_zone")
  def awayAmPm() = gna("@away_ampm")
  def homeTime() = gna("@home_time")
  def homeTimeZone() = gna("@home_time_zone")
  def homeAmPm() = gna("@home_ampm")
  def gameType() = gna("@game_type")
  def timeAwLg() = gna("@time_aw_lg")
  def awLgAmPm() = gna("@aw_lg_ampm")
  def tzAwLgGen() = gna("@tz_aw_lg_gen")
  def timeHmLg() = gna("@time_hm_lg")
  def hmLgAmPm() = gna("@hm_lg_ampm")
  def tzHmLgGen() = gna("@tz_hm_lg_gen")
  def venueId() = gna("@venue_id")
  def scheduledInnings() = gna("@scheduled_innings")
  def awayNameAbbrev() = gna("@away_name_abbrev")
  def homeNameAbbrev() = gna("@home_name_abbrev")
  def awayCode() = gna("@away_code")
  def awayFileCode() = gna("@away_file_code")
  def awayTeamId() = gna("@away_team_id")
  def awayTeamCity() = gna("@away_team_city")
  def awayTeamName() = gna("@away_team_name")
  def awayDivision() = gna("@away_division")
  def awayLeagueId() = gna("@away_league_id")
  def awaySportCode() = gna("@away_sport_code")
  def homeCode() = gna("@home_code")
  def homeFileCode() = gna("@home_file_code")
  def homeTeamId() = gna("@home_team_id")
  def homeTeamCity() = gna("@home_team_city")
  def homeTeamName() = gna("@home_team_name")
  def homeDivision() = gna("@home_division")
  def homeLeagueId() = gna("@home_league_id")
  def homeSportCode() = gna("@home_sport_code")
  def day() = gna("@day")
  def gamedaySw() = gna("@gameday_sw")
  def awayGamesBack() = gna("@away_games_back")
  def homeGamesBack() = gna("@home_games_back")
  def homeGamesBackWildcard() = gna("@home_games_back_wildcard")
  def venueWithChanLoc() = gna("@venue_w_chan_loc")
  def gamedayLink() = gna("@gameday_link")
  def awayWin() = gna("@away_win")
  def awayLoss() = gna("@away_loss")
  def homeWin() = gna("@home_win")
  def homeLoss() = gna("@home_loss")
  def league() = gna("@league")
  def topInning() = gna("@top_inning")
  def inningState() = gna("@inning_state")
  def status() = gna("@status")
  def ind() = gna("@ind")
  def inning() = gna("@inning")
  def outs() = gna("@outs")
  def awayTeamRuns() = gna("@away_team_runs")
  def homeTeamRuns() = gna("@home_team_runs")
  def awayTeamHits() = gna("@away_team_hits")
  def homeTeamHits() = gna("@home_team_hits")
  def awayTeamErrors() = gna("@away_team_errors")
  def homeTeamErrors() = gna("@home_team_errors")
  def wrapupLink() = gna("@wrapup_link")
  def homePreviewLink() = gna("@home_preview_link")
  def awayPreviewLink() = gna("@away_preview_link")
  def preview() = gna("@preview")
  def tvStation() = gna("@tv_station")
  def awayRecapLink() = gna("@away_recap_link")
  def homeRecapLink() = gna("@home_recap_link")
  def photosLink() = gna("@photos_link")

  private def gna(attribute: String) = (gameNode \ attribute).text
  
}
