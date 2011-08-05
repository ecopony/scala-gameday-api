package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._

class GameTest extends AssertionsForJUnit {

  @Test def testInitialization() {
    val game = new Game("Tigers", "1-2-2001")
    assertEquals("Tigers", game.tm())
    assertEquals("1-2-2001", game.dt())
  }
}

