package com.xenopsconsulting.gamedayapi

import scala.xml._
import dispatch._
import java.util.Date

object MlbFetchStrategy extends FetchStrategy {

  def fetchEpg(date: Date): Elem = {
    val http = new Http
    XML.loadString(http(url(epgUrl(date)) as_str))
  }

  def fetchGame(date: Date, team: String): Elem = {
    val http = new Http
    XML.loadString(http(url(gameUrl(date, team)) as_str))
  }

  def fetchBoxScore(date: Date, team: String): Elem = {
    val http = new Http
    XML.loadString(http(url(boxScoreUrl(date, team)) as_str))
  }


}