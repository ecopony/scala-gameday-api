package com.xenopsconsulting.gamedayapi.batch

import com.xenopsconsulting.gamedayapi.fetchstrategies.{LocalCachingFetchStrategyProvider}
import com.xenopsconsulting.gamedayapi._
import org.joda.time.DateTime
import com.xenopsconsulting.gamedayapi.ScheduleYear
import org.slf4j.LoggerFactory

class Fetcher() {

  private val _log = LoggerFactory.getLogger(getClass)

  def fetchByYearsAndTeam(years: List[Int], team: String, gameCallback: (Game) => Unit) {
    for (year <- years) {
      fetchByYearAndTeam(year, team, gameCallback)
    }
  }

  def fetchByYear(year: Int, gameCallback: (Game) => Unit) {
    val scheduleYear: ScheduleYear = new ScheduleYear(year)

    for (team <- scheduleYear.teams()) {
      fetchByYearAndTeam(year, team, gameCallback)
    }
  }

  def fetchByYearAndTeam(year: Int, team: String, gameCallback: (Game) => Unit) {
    _log.info("[" + year + "-" + team + "]")
    val scheduleYear: ScheduleYear = new ScheduleYear(year)
    var date: DateTime = new DateTime(scheduleYear.openingDay())
    val finalDay: DateTime = new DateTime(scheduleYear.finalDay())
    var epgGameCount = 0
    var importedGameCount = 0

    while(date.compareTo(finalDay) <= 0) {
      val epg: Epg = new Epg(date.toDate) with LocalCachingFetchStrategyProvider
      val epgGames: Seq[EpgGame] = epg.gamesForTeam(team)

      for (epgGame <- epgGames) {

        epgGameCount = epgGameCount+1
        if (epgGame.ind().head.toString != "D" && epgGame.gameType() == "R") {
          importedGameCount = importedGameCount+1
          try {
            val game = new Game (date.toDate, team, epgGame.nightcap()) with LocalCachingFetchStrategyProvider
            game.fetchAll()
            gameCallback(game)
          } catch {
            case e : Throwable => {
              _log.error("Error fetching", e)
            }
          }
        }
        _log.info("[" + importedGameCount.toString + "-" + epgGameCount.toString + "] " +
          epgGame.gid() + " " + epgGame.ind() + " " + epgGame.gameType())
      }

      date = date.plusDays(1)
    }
  }
}
