package com.xenopsconsulting.gamedayapi

case class ScheduleYear(year: Int) {

  def games() = {
    readGamesFromFile
  }

  def openingDay() = {
    games.head.date
  }

  private def readGamesFromFile() = {
    scala.io.Source.fromFile(scheduleFileName).getLines.toList map(ScheduleGame(_))
  }

  private def scheduleFileName() = {
    "schedules/" + year.toString + "SKED.TXT"
  }

}