package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class LineScorePitcherTest extends AssertionsForJUnit {
  var lineScore: LineScore = _
  var lineScorePitcher: LineScorePitcher = _
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
    lineScore = new LineScore(date, team)
    lineScore.fetchStrategy = TestFetchStrategy
    lineScorePitcher = lineScore.winningPitcher
  }

  @Test def testId {
    assertEquals("433587", lineScorePitcher.id)
  }

  @Test def testFirstName {
    assertEquals("Felix", lineScorePitcher.firstName)
  }

  @Test def testFirst {
    assertEquals("Felix", lineScorePitcher.first)
  }

  @Test def testLastName {
    assertEquals("Hernandez", lineScorePitcher.lastName)
  }

  @Test def testLast {
    assertEquals("Hernandez", lineScorePitcher.last)
  }

  @Test def testNameDisplayRoster {
    assertEquals("Hernandez, F", lineScorePitcher.nameDisplayRoster)
  }

  @Test def testWins {
    assertEquals("11", lineScorePitcher.wins)
  }

  @Test def testLoses {
    assertEquals("10", lineScorePitcher.losses)
  }

  @Test def testEra {
    assertEquals("3.38", lineScorePitcher.era)
  }

  @Test def testSWins {
    assertEquals("", lineScorePitcher.sWins)
  }

  @Test def testSLoses {
    assertEquals("", lineScorePitcher.sLosses)
  }

  @Test def testSEra {
    assertEquals("", lineScorePitcher.sEra)
  }

  @Test def testCallingSavesOnNonSavePitcher {
    assertEquals("", lineScorePitcher.saves)
  }

  @Test def testCallingSavesOnSavePitcher {
    lineScorePitcher = lineScore.savePitcher
    assertEquals("28", lineScorePitcher.saves)
  }

  @Test def testNameDisplayRosterFallsThroughToFirstLastName {
    lineScorePitcher = LineScorePitcher(
        <winning_pitcher first_name="Felix" first="Felix" id="433587" last_name="Hernandez"
                         last="Hernandez"
                         wins="11"
                         losses="10"
                         era="3.38"
                         s_wins=""
                         s_losses=""
                         s_era=""/>
    )
    assertEquals("Hernandez", lineScorePitcher.nameDisplayRoster)
  }
}
