package com.xenopsconsulting.gamedayapi

import fetchstrategies.{LocalCachingFetchStrategy, DefaultFetchStrategy}
import org.scalatest.junit.AssertionsForJUnit
import org.junit.{Before, Test}
import org.junit.Assert._
import java.util.Date
import java.text.SimpleDateFormat


class EpgFactoryTest extends AssertionsForJUnit {
  var date: Date = _
  var factory: EpgFactory = _
  var epg: Epg = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
  }

  @Test
  def testFactoryReturnsEpgWithDefaultStrategy() {
    factory = new EpgFactory()
    epg = factory.epgFor(date)
    assertNotNull(epg)
    assertEquals(DefaultFetchStrategy.getClass, epg.fetchStrategy.getClass)
  }

  @Test
  def testFactoryReturnsEpgWithGivenStrategy() {
    factory = new EpgFactory(LocalCachingFetchStrategy)
    epg = factory.epgFor(date)
    assertNotNull(epg)
    assertEquals(LocalCachingFetchStrategy.getClass, epg.fetchStrategy.getClass)
  }

}
