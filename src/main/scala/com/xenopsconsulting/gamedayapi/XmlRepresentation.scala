package com.xenopsconsulting.gamedayapi

import fetchstrategies.{FetchStrategy, DefaultFetchStrategy}
import xml.{Node, Elem}
import java.util.Date

@scala.serializable
abstract class XmlRepresentation(date:Date, team:String) {
  protected var _gid:String = _
  protected var _xml:Elem = null
  var fetchStrategy: FetchStrategy = DefaultFetchStrategy

  def xml():Elem = {
    if (_xml == null) fetch()
    _xml
  }

  def fetch()

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

  protected def gid = {
    if (_gid == null) _gid = fetchStrategy.fetchGid(date, team)
    _gid
  }

  protected[gamedayapi] def initializeWith(gid:String, fetchStrategy: FetchStrategy) {
    _gid = gid
    this.fetchStrategy = fetchStrategy
  }

  protected def gameNode() = (xml \\ "game")

  protected def attributeValueEquals(value: String)(node: Node) = node.attributes.exists(_.value.text == value)
}