package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

object BoxScore {
  private val Home = "home"
  private val Away = "away"
}

case class BoxScore(date: Date, team: String) extends XmlRepresentation(date: Date, team: String) {
  private var _lineScore:LineScore = _

  def fetch() = {
    _xml = fetchStrategy.fetchBoxScore(date, team, gid)
  }

  def lineScore() = {
    if (_lineScore == null) _lineScore = new LineScore(date, team)
    _lineScore.fetchStrategy = fetchStrategy
    _lineScore.setGid(gid)
    _lineScore
  }

  def homePitchers() = pitcherList(BoxScore.Home)
  def awayPitchers() = pitcherList(BoxScore.Away)
  def homeBatters() = batterList(BoxScore.Home)
  def awayBatters() = batterList(BoxScore.Away)

  def gameId() = bsna("@game_id")
  def gamePk() = bsna("@game_pk")
  def venueId() = bsna("@venue_id")
  def venueName() = bsna("@venue_name")
  def homeSportCode() = bsna("@home_sport_code")
  def homeTeamCode() = bsna("@home_team_code")
  def awayTeamCode() = bsna("@away_team_code")
  def homeId() = bsna("@home_id")
  def awayId() = bsna("@away_id")
  def homeFname() = bsna("@home_fname")
  def awayFname() = bsna("@away_fname")
  def homeSname() = bsna("@home_sname")
  def homeWins() = bsna("@home_wins")
  def homeLoss() = bsna("@home_loss")
  def awayWins() = bsna("@away_wins")
  def awayLoss() = bsna("@away_loss")
  def statusInd() = bsna("@status_ind")

  def homePitchingOut() = hpna("@out")
  def awayPitchingOut() = apna("@out")
  def homePitchingH() = hpna("@h")
  def awayPitchingH() = apna("@h")
  def homePitchingR() = hpna("@r")
  def awayPitchingR() = apna("@r")
  def homePitchingEr() = hpna("@er")
  def awayPitchingEr() = apna("@er")
  def homePitchingBb() = hpna("@bb")
  def awayPitchingBb() = apna("@bb")
  def homePitchingSo() = hpna("@so")
  def awayPitchingSo() = apna("@so")
  def homePitchingHr() = hpna("@hr")
  def awayPitchingHr() = apna("@hr")
  def homePitchingBf() = hpna("@bf")
  def awayPitchingBf() = apna("@bf")
  def homePitchingEra() = hpna("@era")
  def awayPitchingEra() = apna("@era")

  def homeBattingAb() = hbna("@ab")
  def awayBattingAb() = abna("@ab")
  def homeBattingR() = hbna("@r")
  def awayBattingR() = abna("@r")
  def homeBattingD() = hbna("@d")
  def awayBattingD() = abna("@d")
  def homeBattingT() = hbna("@t")
  def awayBattingT() = abna("@t")
  def homeBattingHr() = hbna("@hr")
  def awayBattingHr() = abna("@hr")
  def homeBattingRbi() = hbna("@rbi")
  def awayBattingRbi() = abna("@rbi")
  def homeBattingBb() = hbna("@bb")
  def awayBattingBb() = abna("@bb")
  def homeBattingPo() = hbna("@po")
  def awayBattingPo() = abna("@po")
  def homeBattingDa() = hbna("@da")
  def awayBattingDa() = abna("@da")
  def homeBattingSo() = hbna("@so")
  def awayBattingSo() = abna("@so")
  def homeBattingLob() = hbna("@lob")
  def awayBattingLob() = abna("@lob")
  def homeBattingAvg() = hbna("@avg")
  def awayBattingAvg() = abna("@avg")

  def homeBattingNote() = (battingNode(BoxScore.Home) \\ "note").text
  def awayBattingNote() = (battingNode(BoxScore.Away) \\ "note").text
  def homeBattingTextData() = (battingNode(BoxScore.Home) \\ "text_data").text
  def awayBattingTextData() = (battingNode(BoxScore.Away) \\ "text_data").text

  def gameInfo() = (boxScoreNode \\ "game_info").text

  private def boxScoreNode():NodeSeq = (xml \\ "boxscore")

  private def pitchingNode(home_or_away: String):NodeSeq = {
    boxScoreNode \ "pitching" \\ "_" filter attributeValueEquals(home_or_away)
  }

  private def battingNode(home_or_away: String):NodeSeq = {
    boxScoreNode \ "batting" \\ "_" filter attributeValueEquals(home_or_away)
  }

  private def pitcherList(home_or_away: String) = {
    (pitchingNode(home_or_away) \ "pitcher").map(Pitcher(_))
  }

  private def batterList(home_or_away: String) = {
    (battingNode(home_or_away) \ "batter" \\ "_" filter boExists() ).map(Batter(_))
  }

  /**
   * A filter for including only batters with a 'bo' attribute, which will exclude
   * pitchers in games played under American League rules.
   */
  private def boExists()(node: Node) = node.attributes.exists(_.key == "bo")

  /**
   * Returns attribute values from the box score node
   */
  private def bsna(attribute: String) = (boxScoreNode \ attribute).text

  /**
   * Returns attribute values from the home pitching node
   */
  private def hpna(attribute: String) = (pitchingNode(BoxScore.Home) \ attribute).text

  /**
   * Returns attribute values from the away pitching node
   */
  private def apna(attribute: String) = (pitchingNode(BoxScore.Away) \ attribute).text

  /**
   * Returns attribute values from the home batting node
   */
  private def hbna(attribute: String) = (battingNode(BoxScore.Home) \ attribute).text

  /**
   * Returns attribute values from the away batting node
   */
  private def abna(attribute: String) = (battingNode(BoxScore.Away) \ attribute).text

}
