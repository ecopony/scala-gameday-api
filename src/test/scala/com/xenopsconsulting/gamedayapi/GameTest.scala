package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import xml.{XML, Elem}
import java.text.SimpleDateFormat
import java.util.Date

class GameTest extends AssertionsForJUnit {
  var game: Game = _
  var date: Date = _
  var team: String = _
  
  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sfn"
    game = new Game(date, team)
    game.fetch_strategy = TestFetchStrategy
  }

  @Test def testInitialization {
    assertEquals(team, game.tm)
    assertEquals(date, game.dt)
  }

  @Test def testGameTime {
    assertEquals("10:10 PM", game.gameTimeEt)
  }
  
  @Test def testGameType {
    assertEquals("R", game.gameType)
  }

  @Test def testLocalGameTime {
    assertEquals("19:10", game.localGameTime)
  }

  @Test def testGamedaySw {
    assertEquals("P", game.gamedaySw)
  }

  @Test def testHomeTeamCode {
    assertEquals("sea", game.homeTeamCode)
  }

  @Test def testAwayTeamCode {
    assertEquals("bos", game.awayTeamCode)
  }

    /*
    TODO:
      - Team bits
      - Stadium bits

      <game type="R" local_game_time="19:10" game_pk="288682" game_time_et="10:10 PM" gameday_sw="P">
        <team type="home" code="sea" file_code="sea" abbrev="SEA" id="136" name="Seattle" name_full="Seattle Mariners" name_brief="Mariners" w="51" l="67" division_id="200" league_id="103" league="AL"/>
        <team type="away" code="bos" file_code="bos" abbrev="BOS" id="111" name="Boston" name_full="Boston Red Sox" name_brief="Red Sox" w="73" l="45" division_id="201" league_id="103" league="AL"/>
        <stadium id="680" name="Safeco Field" venue_w_chan_loc="USWA0395" location="Seattle, WA"/>
      </game>
   */
}



