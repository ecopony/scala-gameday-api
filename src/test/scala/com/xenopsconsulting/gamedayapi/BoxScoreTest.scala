package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class BoxScoreTest extends AssertionsForJUnit {
  var boxScore: BoxScore = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    boxScore = new BoxScore(date, team)
    boxScore.fetchStrategy = TestFetchStrategy
  }

  @Test def testFetchStrategyPropagation {
    assertEquals(TestFetchStrategy.getClass, boxScore.lineScore.fetchStrategy.getClass)
  }

  @Test def testLineScoreExists {
    assertNotNull(boxScore.lineScore)
  }

  @Test def testHomePitchersExists {
    assertNotNull(boxScore.homePitchers)
    assertEquals(3, boxScore.homePitchers.size)
  }

  @Test def testAwayPitchersExists {
    assertNotNull(boxScore.awayPitchers)
    assertEquals(4, boxScore.awayPitchers.size)
  }

  @Test def testPitchersInOrder {
    val pitchers = boxScore.homePitchers
    assertEquals("Hernandez, F", pitchers.head.name)
    assertEquals("League", pitchers.last.name)
  }

  @Test def testHomePitchingOut {
    assertEquals("27", boxScore.homePitchingOut)
  }

  @Test def testAwayPitchingOut {
    assertEquals("24", boxScore.awayPitchingOut)
  }

  @Test def testHomePitchingH {
    assertEquals("10", boxScore.homePitchingH)
  }

  @Test def testAwayPitchingH {
    assertEquals("9", boxScore.awayPitchingH)
  }

  @Test def testHomePitchingR {
    assertEquals("4", boxScore.homePitchingR)
  }

  @Test def testAwayPitchingR {
    assertEquals("5", boxScore.awayPitchingR)
  }

  @Test def testHomePitchingEr {
    assertEquals("4", boxScore.homePitchingEr)
  }

  @Test def testAwayPitchingEr {
    assertEquals("5", boxScore.awayPitchingEr)
  }

  @Test def testHomePitchingBb {
    assertEquals("3", boxScore.homePitchingBb)
  }

  @Test def testAwayPitchingBb {
    assertEquals("1", boxScore.awayPitchingBb)
  }

  @Test def testHomePitchingSo {
    assertEquals("4", boxScore.homePitchingSo)
  }

  @Test def testAwayPitchingSo {
    assertEquals("12", boxScore.awayPitchingSo)
  }

  @Test def testHomePitchingHr {
    assertEquals("2", boxScore.homePitchingHr)
  }

  @Test def testAwayPitchingHr {
    assertEquals("2", boxScore.awayPitchingHr)
  }

  @Test def testHomePitchingBf {
    assertEquals("35", boxScore.homePitchingBf)
  }

  @Test def testAwayPitchingBf {
    assertEquals("33", boxScore.awayPitchingBf)
  }

  @Test def testHomePitchingEra {
    assertEquals("3.62", boxScore.homePitchingEra)
  }

  @Test def testAwayPitchingEra {
    assertEquals("3.93", boxScore.awayPitchingEra)
  }

  @Test def testHomeBattingAb {
    assertEquals("32", boxScore.homeBattingAb)
  }

  @Test def testAwayBattingAb {
    assertEquals("32", boxScore.awayBattingAb)
  }

  @Test def testHomeBattingR {
    assertEquals("5", boxScore.homeBattingR)
  }

  @Test def testAwayBattingR {
    assertEquals("4", boxScore.awayBattingR)
  }

  @Test def testHomeBattingD {
    assertEquals("2", boxScore.homeBattingD)
  }

  @Test def testAwayBattingD {
    assertEquals("0", boxScore.awayBattingD)
  }

  @Test def testHomeBattingT {
    assertEquals("0", boxScore.homeBattingT)
  }

  @Test def testAwayBattingT {
    assertEquals("1", boxScore.awayBattingT)
  }

  @Test def testHomeBattingHr {
    assertEquals("2", boxScore.homeBattingHr)
  }

  @Test def testAwayBattingHr {
    assertEquals("2", boxScore.awayBattingHr)
  }

  @Test def testHomeBattingRbi {
    assertEquals("5", boxScore.homeBattingRbi)
  }

  @Test def testAwayBattingRbi {
    assertEquals("4", boxScore.awayBattingRbi)
  }

  @Test def testHomeBattingBb {
    assertEquals("1", boxScore.homeBattingBb)
  }

  @Test def testAwayBattingBb {
    assertEquals("3", boxScore.awayBattingBb)
  }

  @Test def testHomeBattingPo {
    assertEquals("27", boxScore.homeBattingPo)
  }

  @Test def testAwayBattingPo {
    assertEquals("24", boxScore.awayBattingPo)
  }

  @Test def testHomeBattingDa {
    assertEquals("13", boxScore.homeBattingDa)
  }

  @Test def testAwayBattingDa {
    assertEquals("6", boxScore.awayBattingDa)
  }

  @Test def testHomeBattingSo {
    assertEquals("12", boxScore.homeBattingSo)
  }

  @Test def testAwayBattingSo {
    assertEquals("4", boxScore.awayBattingSo)
  }

  @Test def testHomeBattingLob {
    assertEquals("11", boxScore.homeBattingLob)
  }

  @Test def testAwayBattingLob {
    assertEquals("14", boxScore.awayBattingLob)
  }

  @Test def testHomeBattingAvg {
    assertEquals(".230", boxScore.homeBattingAvg)
  }

  @Test def testAwayBattingAvg {
    assertEquals(".281", boxScore.awayBattingAvg)
  }

  @Test def testHomeBattingNote {
    assertEquals("", boxScore.homeBattingNote)
  }

  @Test def testAwayBattingNote {
    assertEquals("a-Struck out for Aviles in the 9th. <br/>1-Ran for Ortiz in the 8th.", boxScore.awayBattingNote)
  }

  @Test def testHomeBattingTextData {
    assertEquals("<b>BATTING</b><br/><b>2B</b>: Ackley (11, Beckett), Wilson, Ja (8, Beckett).<br/><b>HR</b>: Suzuki, I (2, 1st inning off Beckett, 0 on, 0 out), Wells, C (6, 1st inning off Beckett, 1 on, 1 out).<br/><b>TB</b>: Suzuki, I 4; Gutierrez, F 2; Ackley 2; Carp; Wells, C 5; Wilson, Ja 3.<br/><b>RBI</b>: Suzuki, I (28), Carp 2 (23), Wells, C 2 (20).<br/><b>Runners left in scoring position, 2 out</b>: Pena 2.<br/><b>GIDP</b>: Suzuki, I.<br/><b>Team RISP</b>: 2-for-5.<br/><b>Team LOB</b>: 4.<br/> <br/><b>BASERUNNING</b><br/><b>SB</b>: Gutierrez, F (11, 2nd base off Beckett/Varitek).<br/> <br/><b>FIELDING</b><br/><b>E</b>: Carp (4, pickoff).<br/><b>Outfield assists</b>: Suzuki, I (Ellsbury at home).<br/><b>DP</b>: 4 (Ackley-Wilson, Ja-Carp, Suzuki, I-Bard, Ackley-Carp, Wright, J-Wilson, Ja-Carp).<br/> <br/>", boxScore.homeBattingTextData)
  }

  @Test def testAwayBattingTextData {
    assertEquals("<b>BATTING</b><br/><b>3B</b>: Scutaro (1, Hernandez, F).<br/><b>HR</b>: Ellsbury (20, 6th inning off Hernandez, F, 1 on, 0 out), Pedroia (16, 6th inning off Hernandez, F, 1 on, 1 out).<br/><b>TB</b>: Ellsbury 5; Crawford; Gonzalez, Ad 2; Pedroia 4; Ortiz; Aviles 2; Scutaro 3.<br/><b>RBI</b>: Ellsbury 2 (74), Pedroia 2 (62).<br/><b>Runners left in scoring position, 2 out</b>: Varitek.<br/><b>GIDP</b>: Scutaro; Crawford; Pedroia.<br/><b>Team RISP</b>: 2-for-5.<br/><b>Team LOB</b>: 4.<br/> <br/><b>BASERUNNING</b><br/><b>CS</b>: McDonald, D (3, 2nd base by Wright, J/Bard).<br/> <br/><b>FIELDING</b><br/><b>DP</b>: (Gonzalez, Ad-Scutaro-Gonzalez, Ad).<br/> <br/>", boxScore.awayBattingTextData)
  }

  @Test def testHomeBattersExists {
    assertNotNull(boxScore.homeBatters)
    assertEquals(9, boxScore.homeBatters.size)
  }

  @Test def testAwayBattersExists {
    assertNotNull(boxScore.awayBatters)
    assertEquals(11, boxScore.awayBatters.size)
  }

  @Test def testBattersInOrder {
    val batters = boxScore.homeBatters
    assertEquals("Suzuki, I", batters.head.name)
    assertEquals("Wilson, Ja", batters.last.name)
  }

  @Test def testGameId {
    assertEquals("2011/08/13/bosmlb-seamlb-1", boxScore.gameId)
  }

  @Test def testGamePk {
    assertEquals("288682", boxScore.gamePk)
  }

  @Test def testVenueId {
    assertEquals("680", boxScore.venueId)
  }

  @Test def testVenueName {
    assertEquals("Safeco Field", boxScore.venueName)
  }

  @Test def testHomeSportCode {
    assertEquals("mlb", boxScore.homeSportCode)
  }

  @Test def testAwayTeamCode {
    assertEquals("bos", boxScore.awayTeamCode)
  }

  @Test def testHomeTeamCode {
    assertEquals("sea", boxScore.homeTeamCode)
  }

  @Test def testAwayId {
    assertEquals("111", boxScore.awayId)
  }

  @Test def testHomeId {
    assertEquals("136", boxScore.homeId)
  }

  @Test def testAwayFname {
    assertEquals("Boston Red Sox", boxScore.awayFname)
  }

  @Test def testHomeFname {
    assertEquals("Seattle Mariners", boxScore.homeFname)
  }

  @Test def testHomeSname {
    assertEquals("Seattle", boxScore.homeSname)
  }

  @Test def testAwayWins {
    assertEquals("73", boxScore.awayWins)
  }

  @Test def testAwayLoss {
    assertEquals("45", boxScore.awayLoss)
  }

  @Test def testHomeWins {
    assertEquals("51", boxScore.homeWins)
  }

  @Test def testHomeLoss {
    assertEquals("67", boxScore.homeLoss)
  }

  @Test def testStatusInd {
    assertEquals("F", boxScore.statusInd)
  }

  @Test def testGameInfo {
    assertEquals("<b>Pitches-strikes</b>: Beckett 99-63, Albers 26-18, Morales, F 6-5, Aceves 10-7, Hernandez, F 107-73, Wright, J 18-8, League 14-9.<br/><b>Groundouts-flyouts</b>: Beckett 6-2, Albers 0-2, Morales, F 0-1, Aceves 0-0, Hernandez, F 7-4, Wright, J 1-0, League 1-0.<br/><b>Batters faced</b>: Beckett 23, Albers 6, Morales, F 2, Aceves 2, Hernandez, F 29, Wright, J 3, League 3.<br/><b>Ejections</b>: Boston Red Sox Manager Terry Francona ejected by HP umpire Mark Ripperger (4th).<br/><b>Umpires</b>: HP: Mark Ripperger. 1B: Brian O'Nora. 2B: Alfonso Marquez. 3B: Ed Hickox.<br/><b>Weather</b>: 68 degrees, partly cloudy.<br/><b>Wind</b>: 4 mph, Out to CF.<br/><b>T</b>: 3:03.<br/><b>Att</b>: 41,326.<br/>", boxScore.gameInfo)
  }

}
