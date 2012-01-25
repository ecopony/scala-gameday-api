package com.xenopsconsulting.gamedayapi

import java.util.Date
import java.text.SimpleDateFormat

case class ScheduleYear(year: Int) {

  def games() = {
    readGamesFromFile map(ScheduleGame(_))
  }

  def openingDay() = {
    games.head.date
  }

  def gamesForDay(date: Date) = {
    (readGamesFromFile filter dayMatches(new SimpleDateFormat("yyyyMMdd").format(date))) map(ScheduleGame(_))
  }

  private def readGamesFromFile() = {
    scala.io.Source.fromFile(scheduleFileName).getLines.toList
  }

  private def scheduleFileName() = {
    "schedules/" + year.toString + "SKED.TXT"
  }

  private def dayMatches(dateString: String)(scheduleLine: String) = scheduleLine.contains(dateString)

}