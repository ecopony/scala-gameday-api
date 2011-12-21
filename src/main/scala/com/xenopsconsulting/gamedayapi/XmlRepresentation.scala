package com.xenopsconsulting.gamedayapi

import xml.{Node, Elem}

@scala.serializable
trait XmlRepresentation {
  protected var _xml:Elem = null
  var fetchStrategy: FetchStrategy = MlbFetchStrategy

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def fetch

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node))
      case _ => None
    }
  }

  protected def gameNode() = (xml \\ "game")

  protected def attributeValueEquals(value: String)(node: Node) = node.attributes.exists(_.value.text == value)
}