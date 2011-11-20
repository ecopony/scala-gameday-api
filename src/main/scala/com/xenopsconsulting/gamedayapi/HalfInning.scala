package com.xenopsconsulting.gamedayapi

import xml.Node

case class HalfInning(halfInningNode: Node) {

  def atBats() = (halfInningNode \ "atbat").map (AtBat(_))

}