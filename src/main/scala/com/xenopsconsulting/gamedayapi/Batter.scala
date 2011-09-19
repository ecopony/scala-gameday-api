package com.xenopsconsulting.gamedayapi

import xml.Node

class Batter(batterNode: Node) {
  def bn = batterNode

  def name():String = (batterNode \ "@name").text
}