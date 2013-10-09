package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import xml.{Node, Elem}
import java.util.Date

case class EpgGame(gameNode: Node) {

  def id():String = (gameNode \ "@id").text
  def gameday():String = (gameNode \ "@gameday").text
  def ind(): String = (gameNode \ "@ind").text
  def status(): String = (gameNode \ "@status").text
  def gameType(): String = (gameNode \ "@game_type").text
  def homeCode():String = (gameNode \ "@home_code").text
  def awayCode():String = (gameNode \ "@away_code").text

  /**
   * Convenience method that returns the gid for the game, which is just the 'gameday' attribute, with a 'gid_'
   * prepended.
   *
   * @return gid
   */
  def gid():String = {
    "gid_" + gameday()
  }

  /**
   * Check to see if this game is the second of a doubleheader.
   *
   * @return true for nightcaps, false for single games or the first of two
   */
  def nightcap():Boolean = {
    if (gameday().last.toString == "2") {
      true
    } else {
      false
    }
  }

}
