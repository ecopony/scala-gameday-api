package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import xml.{XML, Elem}
import java.text.SimpleDateFormat
import java.util.Date

class GameTest extends AssertionsForJUnit {
  var game: Game = _
  var date: Date = _
  var team: String = _
  
  @Before def initialize() {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sfn"
    game = new Game(date, team)
    game.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization() {
    assertEquals(team, game.tm)
    assertEquals(date, game.dt)
  }

  @Test def testHomeFname() {
    assertEquals(team, game.homeFname())
  }
}



