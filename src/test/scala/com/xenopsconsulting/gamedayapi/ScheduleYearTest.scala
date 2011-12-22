package com.xenopsconsulting.gamedayapi

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import org.junit.Before
import java.text.SimpleDateFormat
import java.util.Date

class ScheduleYearTest extends AssertionsForJUnit {
  var schedule: ScheduleYear = _

  @Before def initialize {
    schedule = ScheduleYear(2011)
  }

  @Test def testYear {
    assertEquals(2011, schedule.year)
  }

  @Test def testOpeningDay {
    assertEquals(new SimpleDateFormat("yyy-MM-dd").parse("2011-03-31"), schedule.openingDay)
  }

}
