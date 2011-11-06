package com.xenopsconsulting.gamedayapi

import xml.Node

class Batter(batterNode: Node) {
  def id():String = bna("@id")
  def name():String = bna("@name")
  def nameDisplayFirstLast():String = bna("@name_display_first_last")
  def pos():String = bna("@pos")
  def bo():String = bna("@bo")
  def ab():String = bna("@ab")
  def po():String = bna("@po")
  def r():String = bna("@r")
  def a():String = bna("@a")
  def bb():String = bna("@bb")
  def sac():String = bna("@sac")
  def t():String = bna("@t")
  def sf():String = bna("@sf")
  def h():String = bna("@h")
  def e():String = bna("@e")
  def d():String = bna("@d")
  def hbp():String = bna("@hbp")
  def so():String = bna("@so")
  def hr():String = bna("@hr")
  def rbi():String = bna("@rbi")
  def lob():String = bna("@lob")
  def fldg():String = bna("@fldg")
  def sb():String = bna("@sb")
  def sHr():String = bna("@s_hr")
  def sRbi():String = bna("@s_rbi")
  def avg():String = bna("@avg")

  private def bna(attribute: String):String = (batterNode \ attribute).text
}
