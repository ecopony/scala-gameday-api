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
    epg = new Epg(date) with TestFetchStrategyProvider
    epgGame = epg.gamesForTeam("sea").head
  }

  @Test def testInd {
    assertEquals("F", epgGame.ind())
  }

  @Test def status {
    assertEquals("Final", epgGame.status())
  }

  @Test def testGameType {
    assertEquals("R", epgGame.gameType())
  }

  @Test def testHomeCode {
    assertEquals("sea", epgGame.homeCode)
  }

  @Test def testAwayCode {
    assertEquals("bos", epgGame.awayCode)
  }

  @Test def id {
    assertEquals("2011/08/13/bosmlb-seamlb-1", epgGame.id())
  }

  @Test def gameday {
    assertEquals("2011_08_13_bosmlb_seamlb_1", epgGame.gameday())
  }

  @Test def gid {
    assertEquals("gid_2011_08_13_bosmlb_seamlb_1", epgGame.gid())
  }

  @Test def nightcap {
    assertFalse(epgGame.nightcap())
  }

}
