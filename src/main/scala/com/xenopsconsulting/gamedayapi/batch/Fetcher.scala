package com.xenopsconsulting.gamedayapi.batch

import com.xenopsconsulting.gamedayapi.fetchstrategies.{CachingFetchStrategyProvider, FetchStrategyProvider, LocalCachingFetchStrategy, FetchStrategy}
import com.xenopsconsulting.gamedayapi._
import org.joda.time.DateTime
import com.xenopsconsulting.gamedayapi.ScheduleYear
import org.slf4j.LoggerFactory

class Fetcher() {

  private val _log = LoggerFactory.getLogger(getClass)

  def fetchByYearAndTeam(year: Int, team: String, gameCallback: (Game) => Unit) {
    _log.info("Fetching for year " + year + " and team " + team)
    val scheduleYear: ScheduleYear = new ScheduleYear(year)
    var date: DateTime = new DateTime(scheduleYear.openingDay())
    val finalDay: DateTime = new DateTime(scheduleYear.finalDay())

    while(date.compareTo(finalDay) <= 0) {
      _log.info("Fetching game(s) for " + date)

      val epg: Epg = new Epg(date.toDate) with CachingFetchStrategyProvider
      val epgGames: Seq[EpgGame] = epg.gamesForTeam(team)

      for (epgGame <- epgGames) {
        _log.info(epgGame.ind())
        if (epgGame.ind() == "F" && epgGame.gameType() == "R") {
          try {
            val game = new Game (date.toDate, team) with CachingFetchStrategyProvider
            game.fetchAll()
            gameCallback(game)
          } catch {
            case e : Throwable => {
              _log.error("Error fetching", e)
            }
          }
        }
      }

      date = date.plusDays(1)
    }
  }
}
