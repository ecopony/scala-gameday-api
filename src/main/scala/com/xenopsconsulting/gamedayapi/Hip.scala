package com.xenopsconsulting.gamedayapi

import xml.Node

class Hip(hipNode: Node) {

  def des():String = hna("@des")
  def x():String = hna("@x")
  def y():String = hna("@y")
  def batter():String = hna("@batter")
  def pitcher():String = hna("@pitcher")
  def hipType():String = hna("@type")
  def team():String = hna("@team")
  def inning():String = hna("@inning")

  /**
   * Returns attribute values from the hip node
   */
  private def hna(attribute: String):String = (hipNode \ attribute).text

}