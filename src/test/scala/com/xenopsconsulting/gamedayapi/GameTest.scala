package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import xml.{XML, Elem}

class GameTest extends AssertionsForJUnit {
  var game: Game = _
  
  @Before def initialize() {
    game = new Game("Tigers", "1-2-2001")
    game.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization() {
    assertEquals("Tigers", game.tm)
    assertEquals("1-2-2001", game.dt)
  }

  @Test def testHomeFname() {
    assertEquals("San Francisco Giants", game.homeFname())
  }
}

object TestFetchStrategy extends FetchStrategy {
  def fetch: Elem = {
    XML.loadString("<boxscore home_fname='San Francisco Giants'></boxscore>")
  }
}

