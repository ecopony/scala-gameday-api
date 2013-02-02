package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import java.util.Date

class GameFactory(fetchStrategy: FetchStrategy) {

  def this() {
    this(DefaultFetchStrategy)
  }

  def gameFor(date: Date, team: String): Game = {
    val game = new Game(date, team);
    game.fetchStrategy = fetchStrategy;
    game
  }

}
