package com.xenopsconsulting.gamedayapi

import xml.Node

class Pitcher(pitcherNode: Node) {
  def pn = pitcherNode

  def name():String = (pitcherNode \ "@name").text
}