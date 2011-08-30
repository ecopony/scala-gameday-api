package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class LineScoreTest extends AssertionsForJUnit {
  var lineScore: LineScore = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    lineScore = new LineScore(date, team)
    lineScore.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization {
    assertEquals(team, lineScore.tm)
    assertEquals(date, lineScore.dt)
  }

  @Test def testGameId {
    assertEquals("2011/08/13/bosmlb-seamlb-1", lineScore.gameId)
  }

  @Test def testVenue {
    assertEquals("Safeco Field", lineScore.venue)
  }

  @Test def testGamePk {
    assertEquals("288682", lineScore.gamePk)
  }

  @Test def testTime {
    assertEquals("10:10", lineScore.time)
  }

  @Test def testTimeZone {
    assertEquals("ET", lineScore.timeZone)
  }

  @Test def testAmPm {
    assertEquals("PM", lineScore.amPm)
  }

  @Test def testAwayTime {
    assertEquals("10:10", lineScore.awayTime)
  }

  @Test def testAwayTimeZone {
    assertEquals("ET", lineScore.awayTimeZone)
  }

  @Test def testAwayAmPm {
    assertEquals("PM", lineScore.awayAmPm)
  }

  @Test def testHomeTime {
    assertEquals("7:10", lineScore.homeTime)
  }

  @Test def testHomeTimeZone {
    assertEquals("PT", lineScore.homeTimeZone)
  }

  @Test def testHomeAmPm {
    assertEquals("PM", lineScore.homeAmPm)
  }

  @Test def testGameType {
    assertEquals("R", lineScore.gameType)
  }

  @Test def testTimeAwLg {
    assertEquals("10:10", lineScore.timeAwLg)
  }

  @Test def testAwLgAmPm {
    assertEquals("PM", lineScore.awLgAmPm)
  }

  @Test def testTzAwLgGen {
    assertEquals("ET", lineScore.tzAwLgGen)
  }

  @Test def testTimeHmLg {
    assertEquals("10:10", lineScore.timeHmLg)
  }

  @Test def testHmLgAmPm {
    assertEquals("PM", lineScore.hmLgAmPm)
  }

  @Test def testTzHmLgGen {
    assertEquals("ET", lineScore.tzHmLgGen)
  }

  @Test def testVenueId {
    assertEquals("680", lineScore.venueId)
  }

  @Test def testScheduledInnings {
    assertEquals("9", lineScore.scheduledInnings)
  }

  @Test def testAwayNameAbbrev {
    assertEquals("BOS", lineScore.awayNameAbbrev)
  }

  @Test def testHomeNameAbbrev {
    assertEquals("SEA", lineScore.homeNameAbbrev)
  }

  @Test def testAwayCode {
    assertEquals("bos", lineScore.awayCode)
  }

  @Test def testAwayFileCode {
    assertEquals("bos", lineScore.awayFileCode)
  }

  @Test def testAwayTeamId {
    assertEquals("111", lineScore.awayTeamId)
  }

  @Test def testAwayTeamCity {
    assertEquals("Boston", lineScore.awayTeamCity)
  }

  @Test def testAwayTeamName {
    assertEquals("Red Sox", lineScore.awayTeamName)
  }

  @Test def testAwayDivision {
    assertEquals("E", lineScore.awayDivision)
  }

  @Test def testAwayLeagueId {
    assertEquals("103", lineScore.awayLeagueId)
  }

  @Test def testAwaySportCode {
    assertEquals("mlb", lineScore.awaySportCode)
  }

  @Test def testHomeCode {
    assertEquals("sea", lineScore.homeCode)
  }

  @Test def testHomeFileCode {
    assertEquals("sea", lineScore.homeFileCode)
  }

  @Test def testHomeTeamId {
    assertEquals("136", lineScore.homeTeamId)
  }

  @Test def testHomeTeamCity {
    assertEquals("Seattle", lineScore.homeTeamCity)
  }

  @Test def testHomeTeamName {
    assertEquals("Mariners", lineScore.homeTeamName)
  }

  @Test def testHomeDivision {
    assertEquals("W", lineScore.homeDivision)
  }

  @Test def testHomeLeagueId {
    assertEquals("103", lineScore.homeLeagueId)
  }

  @Test def testHomeSportCode {
    assertEquals("mlb", lineScore.homeSportCode)
  }

  @Test def testDay {
    assertEquals("SAT", lineScore.day)
  }

  @Test def testGamedaySw {
    assertEquals("P", lineScore.gamedaySw)
  }

  @Test def testAwayGamesBack {
    assertEquals("-", lineScore.awayGamesBack)
  }

  @Test def testHomeGamesBack {
    assertEquals("16.0", lineScore.homeGamesBack)
  }

  @Test def testHomeGamesBackWildcard {
    assertEquals("21.0", lineScore.homeGamesBackWildcard)
  }

//          venue_w_chan_loc="USWA0395"
//          gameday_link="2011_08_13_bosmlb_seamlb_1"
//          away_win="73"
//          away_loss="45"
//          home_win="51"
//          home_loss="67"
//          league="AA"
//          top_inning="Y"
//          inning_state=""
//          status="Final"
//          ind="F"
//          inning="9"
//          outs="3"
//          away_team_runs="4"
//          home_team_runs="5"
//          away_team_hits="10"
//          home_team_hits="9"
//          away_team_errors="0"
//          home_team_errors="1"
//          wrapup_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=wrap&amp;c_id=mlb"
//    home_preview_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
//    away_preview_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
//    preview="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
//    tv_station="ROOT SPORTS"
//    home_recap_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=recap&amp;c_id=sea"
//    away_recap_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=recap&amp;c_id=bos"
//    photos_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=photos"

  @Test def testLineScoreInningsExist {
    assertNotNull(lineScore.innings)
  }

  @Test def testLineScoreInningLength {
    assertEquals(9, lineScore.innings.length)
  }

  @Test def testLineScoreInningInitialization {
    assertEquals("1", lineScore.innings.head.inning)
  }

  @Test def testWinningPitcherInitialization {
    assertEquals("Felix", lineScore.winningPitcher.firstName)
  }

  @Test def testLosingPitcherInitialization {
    assertEquals("Josh", lineScore.losingPitcher.firstName)
  }

  @Test def testSavePitcherInitialization {
    assertEquals("Brandon", lineScore.savePitcher.firstName)
  }

}
