package com.xenopsconsulting.gamedayapi

import xml.Node

case class HalfInning(halfInningNode: Node, inning: Inning) {

  def atBats() = (halfInningNode \ "atbat").map (AtBat(_, inning))

}