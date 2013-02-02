package com.xenopsconsulting.gamedayapi

import fetchstrategies.{LocalCachingFetchStrategy, DefaultFetchStrategy}
import org.scalatest.junit.AssertionsForJUnit
import org.junit.{Before, Test}
import org.junit.Assert._
import java.util.Date
import java.text.SimpleDateFormat


class GameFactoryTest extends AssertionsForJUnit {
  var date: Date = _
  var team: String = _

  @Before def initialize {
    date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-13")
    team = "sea"
  }

  @Test
  def testFactoryReturnsGameWithDefaultStrategy() {
    val factory = new GameFactory();
    val game: Game = factory.gameFor(date, "sea");
    assertNotNull(game);
    assertEquals(DefaultFetchStrategy.getClass, game.fetchStrategy.getClass)
  }

  @Test
  def testFactoryReturnsGameWithGivenStrategy() {
    val factory = new GameFactory(LocalCachingFetchStrategy);
    val game: Game = factory.gameFor(date, "sea");
    assertNotNull(game);
    assertEquals(LocalCachingFetchStrategy.getClass, game.fetchStrategy.getClass)
  }

}
