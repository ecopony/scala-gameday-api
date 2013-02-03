package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class EpgGameTest extends AssertionsForJUnit {
  var epg: Epg = _
  var date: Date = _
  var epgGame: EpgGame = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    epg = new Epg(date)
    epg.fetchStrategy = TestFetchStrategy
    epgGame = epg.gamesForTeam("sea").head
  }

  @Test def testHomeCode {
    assertEquals("sea", epgGame.homeCode)
  }

  @Test def testAwayCode {
    assertEquals("bos", epgGame.awayCode)
  }

}
