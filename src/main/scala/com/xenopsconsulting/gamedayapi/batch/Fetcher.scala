package com.xenopsconsulting.gamedayapi.batch

import com.xenopsconsulting.gamedayapi.fetchstrategies.{LocalCachingFetchStrategy, FetchStrategy}
import com.xenopsconsulting.gamedayapi._
import org.joda.time.DateTime
import com.xenopsconsulting.gamedayapi.ScheduleYear

class Fetcher(fetchStrategy: FetchStrategy) {

  def this() {
    this(LocalCachingFetchStrategy)
  }

  def fetchByYearAndTeam(year: Int, team: String) {
    val scheduleYear: ScheduleYear = new ScheduleYear(year)
    var date: DateTime = new DateTime(scheduleYear.openingDay())
    val finalDay: DateTime = new DateTime(scheduleYear.finalDay())
    val epgFactory: EpgFactory = new EpgFactory(fetchStrategy)
    val gameFactory: GameFactory = new GameFactory(LocalCachingFetchStrategy)

    while(date.compareTo(finalDay) <= 0) {
      val epg: Epg = epgFactory.epgFor(date.toDate)
      val epgGames: Seq[EpgGame] = epg.gamesForTeam(team)

      for (epgGame <- epgGames) {
        if (epgGame.ind() == "F") {
          val game = gameFactory.gameFor(date.toDate, team)
          game.fetchAll()
        }
      }

      date = date.plusDays(1)
    }
  }
}
