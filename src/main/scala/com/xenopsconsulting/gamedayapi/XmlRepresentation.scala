package com.xenopsconsulting.gamedayapi

import xml.{Node, Elem}
import java.util.Date

@scala.serializable
abstract class XmlRepresentation(date:Date, team:String) {
  protected var _gid:String = _
  protected var _xml:Elem = null
  var fetchStrategy: FetchStrategy = MlbFetchStrategy

  def xml():Elem = {
    if (_xml == null) fetch
    _xml
  }

  def fetch

  def exists() = {
    try {
      fetch
      true
    } catch {
      case e => {
        false
      }
    }
  }

  def inning(number: Int) = {
    val inningNode = (gameNode \ "inning").find((node: Node) => node.attribute("num").isDefined && node.attribute("num").get.text == number.toString)

    inningNode match {
      case Some(node) => Some(new Inning(node))
      case _ => None
    }
  }

  protected def gid = {
    if (_gid == null) _gid = fetchStrategy.fetchGid(date, team)
    _gid
  }

  protected[gamedayapi] def setGid(gid:String) = {
    _gid = gid
  }

  protected def gameNode() = (xml \\ "game")

  protected def attributeValueEquals(value: String)(node: Node) = node.attributes.exists(_.value.text == value)
}