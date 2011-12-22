package com.xenopsconsulting.gamedayapi

import java.text.SimpleDateFormat

// scheduleFileLine from the retrosheet schedule files looks like:
// "20110331","0","Thu","MIL","NL",1,"CIN","NL",1,"d","",""
case class ScheduleGame(scheduleFileLine: String) {
  private val _valueArray:Array[String] = scheduleFileLine.split(",")

  def date() = new SimpleDateFormat("yyyyMMdd").parse(gameLineValue(0))
  def day() = gameLineValue(2)
  def awayTeam() = gameLineValue(3)
  def awayLeague() = gameLineValue(4)
  def awayGameNumber() = gameLineValue(5)
  def homeTeam() = gameLineValue(6)
  def homeLeague() = gameLineValue(7)
  def homeGameNumber() = gameLineValue(8)
  def dayOrNight() = gameLineValue(9)

  private def gameLineValue(index: Int) = {
    _valueArray(index).replaceAll("\"", "")
  }
}
