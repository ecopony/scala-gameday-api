package com.xenopsconsulting.gamedayapi

import fetchstrategies.{DefaultFetchStrategy, FetchStrategy}
import xml.{Node, Elem}
import java.util.Date

case class EpgGame(gameNode: Node) {

  def ind(): String = (gameNode \ "@ind").text
  def homeCode():String = (gameNode \ "@home_code").text
  def awayCode():String = (gameNode \ "@away_code").text

}
