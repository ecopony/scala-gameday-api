package com.xenopsconsulting.gamedayapi.batch

import com.xenopsconsulting.gamedayapi.fetchstrategies.{LocalCachingFetchStrategy, FetchStrategy}
import com.xenopsconsulting.gamedayapi._
import org.joda.time.DateTime
import com.xenopsconsulting.gamedayapi.ScheduleYear
import org.slf4j.LoggerFactory

class Fetcher(fetchStrategy: FetchStrategy) {
  private val _log = LoggerFactory.getLogger(getClass)

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
      _log.info("Fetching game(s) for " + date)
      val epg: Epg = epgFactory.epgFor(date.toDate)
      val epgGames: Seq[EpgGame] = epg.gamesForTeam(team)

      for (epgGame <- epgGames) {
        _log.info(epgGame.ind())
        if (epgGame.ind() == "F") {
          try {
            val game = gameFactory.gameFor(date.toDate, team)
            game.fetchAll()
          } catch {
            case e => {
              _log.error("Error fetching", e)
            }
          }
        }
      }

      date = date.plusDays(1)
    }
  }
}
