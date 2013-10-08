package com.xenopsconsulting.gamedayapi

import xml.{Node, Elem}

@scala.serializable
abstract class GamedayRepresentation {
  var _xml: Elem = _

  def fetch():Unit

  def xml():Elem = {
    if (_xml == null) this.fetch()
    _xml
  }

  def exists() = {
    try {
      fetch()
      true
    } catch {
      case e: Throwable => {
        false
      }
    }
  }

  protected def gameNode() = xml \\ "game"

  protected def attributeValueEquals(value: String)(node: Node) = node.attributes.exists(_.value.text == value)
}
