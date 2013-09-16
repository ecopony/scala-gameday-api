package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class GameEventsTest extends AssertionsForJUnit {
  var game: Game = _
  var gameEvents: GameEvents = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    game = new Game(date, team) with TestFetchStrategyProvider
    gameEvents = game.gameEvents()
  }

  @Test def testTopInningAtBatsExist {
    assertEquals(3, gameEvents.inning(1).get.top.atBats.size)
    assertEquals(8, gameEvents.inning(1).get.bottom.atBats.size)
  }

  @Test def testB1OnAtBat {
    assertEquals("", gameEvents.inning(1).get.top.atBats.head.b1)
  }

  @Test def testB2OnAtBat {
    assertEquals("", gameEvents.inning(1).get.top.atBats.head.b2)
  }
  
  @Test def testB3OnAtBat {
    assertEquals("", gameEvents.inning(1).get.top.atBats.head.b3)
  }

}
