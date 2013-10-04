package com.xenopsconsulting.gamedayapi

import java.util.Date
import java.text.SimpleDateFormat

case class ScheduleYear(year: Int) {
  val _scheduleLines: List[String] = readGamesFromFile()

  def games() = {
    _scheduleLines map(ScheduleGame(_))
  }

  def openingDay() = {
    games().head.date()
  }

  def finalDay() = {
    games().last.date()
  }

  def gamesForDay(date: Date) = {
    (_scheduleLines filter dayMatches(new SimpleDateFormat("yyyyMMdd").format(date))) map(ScheduleGame(_))
  }

  def gamesForDayAndTeam(date: Date, team: String) = {
    (_scheduleLines filter dayMatches(new SimpleDateFormat("yyyyMMdd").format(date))) filter teamMatches(team) map(ScheduleGame(_))
  }

  def teams() = {
    _scheduleLines.map(ScheduleGame(_).homeTeam().toLowerCase).distinct
  }

  private def readGamesFromFile() = {
    scala.io.Source.fromInputStream(getClass.getResourceAsStream(scheduleFileName())).getLines().toList
  }

  private def scheduleFileName() = {
    "schedules/" + year.toString + "SKED.TXT"
  }

  private def dayMatches(dateString: String)(scheduleLine: String) = scheduleLine.contains(dateString)

  private def teamMatches(team: String)(scheduleLine: String) = scheduleLine.contains(team.toUpperCase())

}