package com.xenopsconsulting.gamedayapi

import xml.Node

case class Inning(inningNode: Node) {

  def top() = HalfInning((inningNode \ "top").head)
  def bottom() = HalfInning((inningNode \ "bottom").head)

  def num = (inningNode \ "@num").text
  def homeTeam = (inningNode \ "@home_team").text
  def awayTeam = (inningNode \ "@away_team").text
  def next = (inningNode \ "@next").text

}
