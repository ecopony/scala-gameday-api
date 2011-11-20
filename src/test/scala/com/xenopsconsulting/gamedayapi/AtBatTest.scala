package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class AtBatTest extends AssertionsForJUnit {
  var innings: Innings = _
  var inning: Inning = _
  var date: Date = _
  var team: String = _
  var top_first_at_bats: Seq[AtBat] = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    innings = new Innings(date, team)
    innings.fetchStrategy = TestFetchStrategy
    top_first_at_bats = innings.inning(1).get.top.atBats
  }

  //           <atbat num="1" b="1" s="2" o="1" start_tfs="220954" start_tfs_zulu="2011-08-14T02:09:54Z" batter="453056" stand="L" b_height="6-1" pitcher="433587" p_throws="R" des="Jacoby Ellsbury pops out to shortstop Jack Wilson. " event="Pop Out">


  @Test def testNum {
    assertEquals("1", top_first_at_bats.head.num)
  }

}
