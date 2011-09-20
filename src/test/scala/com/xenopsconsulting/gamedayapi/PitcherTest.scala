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

  @Test def testId {
    assertEquals("277417", pitcher.id)
  }

  @Test def testName {
    assertEquals("Beckett", pitcher.name)
  }

  @Test def testNameDisplayFirstLast {
    assertEquals("Josh Beckett", pitcher.nameDisplayFirstLast)
  }

  @Test def testPos {
    assertEquals("P", pitcher.pos)
  }

  @Test def testOut {
    assertEquals("15", pitcher.out)
  }

  @Test def testBf {
    assertEquals("23", pitcher.bf)
  }

  @Test def testEr {
    assertEquals("5", pitcher.er)
  }

  @Test def testR {
    assertEquals("5", pitcher.r)
  }

  @Test def testH {
    assertEquals("8", pitcher.h)
  }

  @Test def testSo {
    assertEquals("6", pitcher.so)
  }

  @Test def testHr {
    assertEquals("2", pitcher.hr)
  }

  @Test def testBb {
    assertEquals("1", pitcher.bb)
  }

  @Test def testW {
    assertEquals("9", pitcher.w)
  }

  @Test def testL {
    assertEquals("5", pitcher.l)
  }

  @Test def testSv {
    assertEquals("0", pitcher.sv)
  }

  @Test def testBs {
    assertEquals("0", pitcher.bs)
  }

  @Test def testHld {
    assertEquals("0", pitcher.hld)
  }

  @Test def testEra {
    assertEquals("2.40", pitcher.era)
  }

  @Test def testNote {
    assertEquals("(L, 9-5)", pitcher.note)
  }

}