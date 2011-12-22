package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat

// Attributes for a game are from the retrosheet schedule that looks like:
// "20110331","0","Thu","MIL","NL",1,"CIN","NL",1,"d","",""
class ScheduleGameTest extends AssertionsForJUnit {
  var schedule: ScheduleYear = _
  var game: ScheduleGame = _

  @Before def initialize {
    schedule = ScheduleYear(2011)
    game = schedule.games.head
  }

  @Test def testDate {
    assertEquals(new SimpleDateFormat("yyy-MM-dd").parse("2011-03-31"), game.date)
  }

  @Test def testDay {
    assertEquals("Thu", game.day)
  }

  @Test def testAwayTeam {
    assertEquals("MIL", game.awayTeam)
  }

  @Test def testAwayLeague {
    assertEquals("NL", game.awayLeague)
  }

  @Test def testAwayGameNumber {
    assertEquals("1", game.awayGameNumber)
  }

  @Test def testHomeTeam {
    assertEquals("CIN", game.homeTeam)
  }

  @Test def testHomeLeague {
    assertEquals("NL", game.homeLeague)
  }

  @Test def testHomeGameNumber {
    assertEquals("1", game.homeGameNumber)
  }

  @Test def testDayOrNight {
    assertEquals("d", game.dayOrNight)
  }

}
