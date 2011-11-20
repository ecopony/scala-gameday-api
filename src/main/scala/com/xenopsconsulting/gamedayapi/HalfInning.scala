package com.xenopsconsulting.gamedayapi

import xml.Node

case class HalfInning(halfInningNode: Node) {

  def atBats() = (halfInningNode \ "at_bat").map (AtBat(_))

}