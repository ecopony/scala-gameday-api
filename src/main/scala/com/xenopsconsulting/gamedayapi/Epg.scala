package com.xenopsconsulting.gamedayapi

import com.xenopsconsulting.gamedayapi.fetchstrategies.{FetchStrategyProvider, FetchStrategy}
import xml.{Node, Elem}
import java.util.Date

object Epg {
  def apply(date: Date) = {
    new Epg(date) with FetchStrategyProvider
  }
}

class Epg(date: Date) {
  this: FetchStrategyProvider =>

  val fetchStrategy: FetchStrategy = newEpgFetchStrategy(date)

  protected var _xml:Elem = null

  def fetch():Unit = {
    _xml = fetchStrategy.fetchEpg()
  }

  def xml():Elem = {
    if (_xml == null) fetch()
    _xml
  }

  def games(): Seq[EpgGame] = {
    gameNodes().map(EpgGame)
  }

  def gamesForTeam(team: String): Seq[EpgGame] = {
    gameNodes filter idMatches(team) map EpgGame
  }

  private def gameNodes() = xml \\ "game"

  private def idMatches(code: String)(gameNode: Node) = gameNode.attribute("id").get.text.contains(code + "mlb")

}
