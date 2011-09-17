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
    lineScore.fetchStrategy = TestFetchStrategy
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

  @Test def testVenueWithChanLoc {
    assertEquals("USWA0395", lineScore.venueWithChanLoc)
  }

  @Test def testGamedayLink {
    assertEquals("2011_08_13_bosmlb_seamlb_1", lineScore.gamedayLink)
  }

  @Test def testAwayWin {
    assertEquals("73", lineScore.awayWin)
  }

  @Test def testAwayLoss {
    assertEquals("45", lineScore.awayLoss)
  }

  @Test def testHomeWin {
    assertEquals("51", lineScore.homeWin)
  }

  @Test def testHomeLoss {
    assertEquals("67", lineScore.homeLoss)
  }

  @Test def testLeague {
    assertEquals("AA", lineScore.league)
  }

  @Test def testTopInning {
    assertEquals("Y", lineScore.topInning)
  }

  @Test def testInningState {
    assertEquals("", lineScore.inningState)
  }

  @Test def testStatus {
    assertEquals("Final", lineScore.status)
  }

  @Test def testInd {
    assertEquals("F", lineScore.ind)
  }

  @Test def testInning {
    assertEquals("9", lineScore.inning)
  }

  @Test def testOuts {
    assertEquals("3", lineScore.outs)
  }

  @Test def testAwayTeamRuns {
    assertEquals("4", lineScore.awayTeamRuns)
  }

  @Test def testHomeTeamRuns {
    assertEquals("5", lineScore.homeTeamRuns)
  }

  @Test def testAwayTeamHits {
    assertEquals("10", lineScore.awayTeamHits)
  }

  @Test def testHomeTeamHits {
    assertEquals("9", lineScore.homeTeamHits)
  }

  @Test def testAwayTeamErrors {
    assertEquals("0", lineScore.awayTeamErrors)
  }

  @Test def testHomeTeamErrors {
    assertEquals("1", lineScore.homeTeamErrors)
  }

  @Test def testWrapupLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=wrap&c_id=mlb", lineScore.wrapupLink)
  }

  @Test def testHomePreviewLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=preview&c_id=mlb", lineScore.homePreviewLink)
  }

  @Test def testAwayPreviewLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=preview&c_id=mlb", lineScore.awayPreviewLink)
  }

  @Test def testPreview {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=preview&c_id=mlb", lineScore.preview)
  }

  @Test def testTvStation {
    assertEquals("ROOT SPORTS", lineScore.tvStation)
  }

  @Test def testAwayRecapLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=recap&c_id=bos", lineScore.awayRecapLink)
  }

  @Test def testHomeRecapLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=recap&c_id=sea", lineScore.homeRecapLink)
  }

  @Test def testPhotosLink {
    assertEquals("/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&mode=photos", lineScore.photosLink)
  }

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
