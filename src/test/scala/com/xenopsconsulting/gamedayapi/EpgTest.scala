package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class EpgTest extends AssertionsForJUnit {
  var epg: Epg = _
  var date: Date = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    epg = new Epg(date) with TestFetchStrategyProvider
  }

  @Test
  def testGames() {
    val games = epg.games()
    assertEquals(15, games.size)
    assert(games.head.isInstanceOf[EpgGame])
  }

  @Test
  def testGamesForTeam() {
    val games = epg.gamesForTeam("sea")
    assertEquals(1, games.size)
    assert(games.head.isInstanceOf[EpgGame])
  }
}
