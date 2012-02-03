package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before

class BatterTest extends AssertionsForJUnit {
  var batter: Batter = _

  @Before def initialize {
    batter = new Batter(<batter id="400085" name="Suzuki, I" name_display_first_last="Ichiro Suzuki" pos="RF" bo="100" ab="4" po="1" r="1" a="1" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="2" hr="1" rbi="1" lob="2" fldg="1.000" sb="0" s_hr="2" s_rbi="28" avg=".267"/>)
  }

  @Test def testId {
    assertEquals("400085", batter.id)
  }

  @Test def testName {
    assertEquals("Suzuki, I", batter.name)
  }
  
  @Test def testNameDisplayFirstLast {
    assertEquals("Ichiro Suzuki", batter.nameDisplayFirstLast)
  }

  @Test def testPos {
    assertEquals("RF", batter.pos)
  }

  @Test def testBo {
    assertEquals("100", batter.bo)
  }

  @Test def testAb {
    assertEquals("4", batter.ab)
  }

  @Test def testPo {
    assertEquals("1", batter.po)
  }

  @Test def testR {
    assertEquals("1", batter.r)
  }

  @Test def testA {
    assertEquals("1", batter.a)
  }

  @Test def testBb {
    assertEquals("0", batter.bb)
  }

  @Test def testSac {
    assertEquals("0", batter.sac)
  }

  @Test def testT {
    assertEquals("0", batter.t)
  }
  
  @Test def testSf {
    assertEquals("0", batter.sf)
  }

  @Test def testH {
    assertEquals("1", batter.h)
  }

  @Test def testE {
    assertEquals("0", batter.e)
  }

  @Test def testD {
    assertEquals("0", batter.d)
  }

  @Test def testHbp {
    assertEquals("0", batter.hbp)
  }

  @Test def testSo {
    assertEquals("2", batter.so)
  }

  @Test def testHr {
    assertEquals("1", batter.hr)
  }

  @Test def testRbi {
    assertEquals("1", batter.rbi)
  }
  
  @Test def testLob {
    assertEquals("2", batter.lob)
  }
  
  @Test def testFldg {
    assertEquals("1.000", batter.fldg)
  }

  @Test def testSb {
    assertEquals("0", batter.sb)
  }

  @Test def testSHr {
    assertEquals("2", batter.sHr)
  }
  
  @Test def testSRbi {
    assertEquals("28", batter.sRbi)
  }

  @Test def testAvg {
    assertEquals(".267", batter.avg)
  }

  @Test def testNameDisplayFirstLastShouldFallBackToName {
    batter = new Batter(<batter id="400085" name="Suzuki, I" pos="RF" bo="100" ab="4" po="1" r="1" a="1" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="2" hr="1" rbi="1" lob="2" fldg="1.000" sb="0" s_hr="2" s_rbi="28" avg=".267"/>)
    assertEquals("Suzuki, I", batter.nameDisplayFirstLast)
  }

}