package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class PitchTest extends AssertionsForJUnit {
  var game: Game = _
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _
  var top_first_at_bats: Seq[AtBat] = _
  var first_at_bat_pitches: Seq[Pitch] = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    innings = game.innings
    top_first_at_bats = innings.inning(1).get.top.atBats
    first_at_bat_pitches = top_first_at_bats.head.pitches
  }
  
  @Test def testPitchCount {
    assertEquals(4, first_at_bat_pitches.size)
  }

  @Test def testDes {
    assertEquals("Ball", first_at_bat_pitches.head.des)
  }

  @Test def testId {
    assertEquals("3", first_at_bat_pitches.head.id)
  }

  @Test def testTheType {
    assertEquals("B", first_at_bat_pitches.head.theType)
  }

  @Test def testTfs {
    assertEquals(221017, first_at_bat_pitches.head.tfs().get)
  }

  @Test def testTfsZulu {
    assertEquals("2011-08-14T02:10:17Z", first_at_bat_pitches.head.tfsZulu)
  }

  @Test def testX {
    assertEquals("108.15", first_at_bat_pitches.head.x)
  }

  @Test def testY {
    assertEquals("121.75", first_at_bat_pitches.head.y)
  }

  @Test def testSvId {
    assertEquals("110813_191020", first_at_bat_pitches.head.svId)
  }

  @Test def testStartSpeed {
    assertEquals(91.6, first_at_bat_pitches.head.startSpeed.get, .1)
  }

  @Test def testEndSpeed {
    assertEquals(84.3, first_at_bat_pitches.head.endSpeed.get, .1)
  }

  @Test def testSzTop {
    assertEquals(3.19, first_at_bat_pitches.head.szTop().get, .1)
  }

  @Test def testSzBot {
    assertEquals(1.52, first_at_bat_pitches.head.szBot().get, .1)
  }

  @Test def testPfxX {
    assertEquals(-3.39, first_at_bat_pitches.head.pfxX().get, .1)
  }

  @Test def testPfxZ {
    assertEquals(3.96, first_at_bat_pitches.head.pfxZ().get, .1)
  }

  @Test def testPx {
    assertEquals(-0.311, first_at_bat_pitches.head.px().get, .1)
  }

  @Test def testPz {
    assertEquals(3.362, first_at_bat_pitches.head.pz().get, .1)
  }

  @Test def testX0 {
    assertEquals(-2.411, first_at_bat_pitches.head.x0().get, .1)
  }

  @Test def testY0 {
    assertEquals(50.0, first_at_bat_pitches.head.y0().get, .1)
  }

  @Test def testZ0 {
    assertEquals(5.765, first_at_bat_pitches.head.z0().get, .1)
  }

  @Test def testVx0 {
    assertEquals(6.728, first_at_bat_pitches.head.vx0().get, .1)
  }

  @Test def testVy0 {
    assertEquals(-134.21, first_at_bat_pitches.head.vy0().get, .1)
  }

  @Test def testVz0 {
    assertEquals(-1.659, first_at_bat_pitches.head.vz0().get, .1)
  }

  @Test def testAx {
    assertEquals(-6.173, first_at_bat_pitches.head.ax().get, .1)
  }

  @Test def testAy {
    assertEquals(29.604, first_at_bat_pitches.head.ay().get, .1)
  }

  @Test def testAz {
    assertEquals(-24.898, first_at_bat_pitches.head.az().get, .1)
  }

  @Test def testBreakY {
    assertEquals(23.8, first_at_bat_pitches.head.breakY().get, .1)
  }

  @Test def testBreakAngle {
    assertEquals(10.6, first_at_bat_pitches.head.breakAngle().get, .1)
  }

  @Test def testBreakLength {
    assertEquals(5.7, first_at_bat_pitches.head.breakLength().get, .1)
  }

  @Test def testPitchType {
    assertEquals("FF", first_at_bat_pitches.head.pitchType)
  }

  @Test def testTypeConfidence {
    assertEquals(.901, first_at_bat_pitches.head.typeConfidence.get, .1)
  }

  @Test def testZone {
    assertEquals(11, first_at_bat_pitches.head.zone().get)
  }

  @Test def testNasty {
    assertEquals("65", first_at_bat_pitches.head.nasty)
  }

  @Test def testSpinDir {
    assertEquals(220.310, first_at_bat_pitches.head.spinDir().get, .1)
  }

  @Test def testSpinRate {
    assertEquals(1031.450, first_at_bat_pitches.head.spinRate().get, .1)
  }

  @Test def testCc {
    assertEquals("", first_at_bat_pitches.head.cc)
  }

  @Test def testMt {
    assertEquals("", first_at_bat_pitches.head.mt)
  }
  
  @Test def testPitcher {
    assertEquals("433587", first_at_bat_pitches.head.pitcher.id)
  }

}
