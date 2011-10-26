package com.xenopsconsulting.gamedayapi

import scala.xml._
import java.util.Date

object BoxScore {
  private val Home:String = "home"
  private val Away:String = "away"
}

class BoxScore(date: Date, team: String) extends XmlRepresentation {
  private var _lineScore:LineScore = _

  def tm = team
  def dt = date

  def fetch() = {
    _xml = fetchStrategy.fetchBoxScore(date, team)
  }

  def lineScore() = {
    if (_lineScore == null) _lineScore = new LineScore(date, team)
    _lineScore.fetchStrategy = fetchStrategy
    _lineScore
  }

  def homePitchers() = pitcherList(BoxScore.Home)
  def awayPitchers() = pitcherList(BoxScore.Away)
  def homeBatters() = batterList(BoxScore.Home)
  def awayBatters() = batterList(BoxScore.Away)

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

  def homePitchingOut():String = hpna("@out")
  def awayPitchingOut():String = apna("@out")
  def homePitchingH():String = hpna("@h")
  def awayPitchingH():String = apna("@h")
  def homePitchingR():String = hpna("@r")
  def awayPitchingR():String = apna("@r")
  def homePitchingEr():String = hpna("@er")
  def awayPitchingEr():String = apna("@er")
  def homePitchingBb():String = hpna("@bb")
  def awayPitchingBb():String = apna("@bb")
  def homePitchingSo():String = hpna("@so")
  def awayPitchingSo():String = apna("@so")
  def homePitchingHr():String = hpna("@hr")
  def awayPitchingHr():String = apna("@hr")
  def homePitchingBf():String = hpna("@bf")
  def awayPitchingBf():String = apna("@bf")
  def homePitchingEra():String = hpna("@era")
  def awayPitchingEra():String = apna("@era")

  def homeBattingAb():String = hbna("@ab")
  def awayBattingAb():String = abna("@ab")
  def homeBattingR():String = hbna("@r")
  def awayBattingR():String = abna("@r")
  def homeBattingD():String = hbna("@d")
  def awayBattingD():String = abna("@d")
  def homeBattingT():String = hbna("@t")
  def awayBattingT():String = abna("@t")
  def homeBattingHr():String = hbna("@hr")
  def awayBattingHr():String = abna("@hr")
  def homeBattingRbi():String = hbna("@rbi")
  def awayBattingRbi():String = abna("@rbi")
  def homeBattingBb():String = hbna("@bb")
  def awayBattingBb():String = abna("@bb")
  def homeBattingPo():String = hbna("@po")
  def awayBattingPo():String = abna("@po")
  def homeBattingDa():String = hbna("@da")
  def awayBattingDa():String = abna("@da")
  def homeBattingSo():String = hbna("@so")
  def awayBattingSo():String = abna("@so")
  def homeBattingLob():String = hbna("@lob")
  def awayBattingLob():String = abna("@lob")
  def homeBattingAvg():String = hbna("@avg")
  def awayBattingAvg():String = abna("@avg")

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
    (battingNode(home_or_away) \ "batter" \\ "_" filter boExists() ).foldLeft(List[Batter]())((list, batterNode) => list :+ new Batter(batterNode))
  }

  /**
   * A filter for including only batters with a 'bo' attribute, which will exclude
   * pitchers in games played under American League rules.
   */
  private def boExists()(node: Node) = node.attributes.exists(_.key == "bo")

  /**
   * Returns attribute values from the box score node
   */
  private def bsna(attribute: String):String = (boxScoreNode \ attribute).text

  /**
   * Returns attribute values from the home pitching node
   */
  private def hpna(attribute: String):String = (pitchingNode(BoxScore.Home) \ attribute).text

  /**
   * Returns attribute values from the away pitching node
   */
  private def apna(attribute: String):String = (pitchingNode(BoxScore.Away) \ attribute).text

  /**
   * Returns attribute values from the home batting node
   */
  private def hbna(attribute: String):String = (battingNode(BoxScore.Home) \ attribute).text

  /**
   * Returns attribute values from the away batting node
   */
  private def abna(attribute: String):String = (battingNode(BoxScore.Away) \ attribute).text

}
