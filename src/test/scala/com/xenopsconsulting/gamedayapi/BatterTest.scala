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

  @Test def testName {
    assertEquals("Suzuki, I", batter.name)
  }

}