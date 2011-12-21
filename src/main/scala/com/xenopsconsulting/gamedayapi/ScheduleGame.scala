package com.xenopsconsulting.gamedayapi

import java.text.SimpleDateFormat

// scheduleFileLine from the retrosheet schedule files looks like:
// "20110331","0","Thu","MIL","NL",1,"CIN","NL",1,"d","",""
case class ScheduleGame(scheduleFileLine: String) {
  private val _valueArray:Array[String] = scheduleFileLine.split(",")

  def date() = {
    new SimpleDateFormat("yyyyMMdd").parse(gameLineValue(0))
  }

  private def gameLineValue(index: Int) = {
    _valueArray(index).replaceAll("\"", "")
  }

}