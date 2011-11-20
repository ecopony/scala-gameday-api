package com.xenopsconsulting.gamedayapi

import xml.Node

case class Inning(inningNode: Node) {

  def top() = {
    HalfInning((inningNode \ "top").head)
  }

}
