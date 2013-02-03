package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import xml.{Node, Elem}
import java.util.Date
import java.text.SimpleDateFormat

class Epg(date: Date) {
  protected var _xml:Elem = null
  var fetchStrategy: FetchStrategy = DefaultFetchStrategy

  def fetch() {
    _xml = fetchStrategy.fetchEpg(date)
  }

  def xml():Elem = {
    if (_xml == null) fetch()
    _xml
  }

  def games(): Seq[EpgGame] = {
    gameNodes.map(EpgGame(_))
  }

  def gamesForTeam(team: String): Seq[EpgGame] = {
    (gameNodes filter idMatches(team) map(EpgGame(_)))
  }

  private def gameNodes() = (xml \\ "game")

  private def idMatches(code: String)(gameNode: Node) = gameNode.attribute("id").get.text.contains(code + "mlb")

}
