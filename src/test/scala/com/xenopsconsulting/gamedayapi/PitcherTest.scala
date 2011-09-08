package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before

class PitcherTest extends AssertionsForJUnit {
  var pitcher: Pitcher = _

  @Before def initialize {
    pitcher = new Pitcher(<pitcher id="277417" name="Beckett" name_display_first_last="Josh Beckett" pos="P" out="15" bf="23" er="5" r="5" h="8" so="6" hr="2" bb="1" w="9" l="5" sv="0" bs="0" hld="0" era="2.40" note="(L, 9-5)"/>)
  }

  @Test def testName {
    assertEquals("Beckett", pitcher.name)
  }

}