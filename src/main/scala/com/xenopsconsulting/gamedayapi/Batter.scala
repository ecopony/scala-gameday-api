package com.xenopsconsulting.gamedayapi

import xml.Node

case class Batter(batterNode: Node) {
  def id() = bna("@id")
  def name() = bna("@name")
  def pos() = bna("@pos")
  def bo() = bna("@bo")
  def ab() = bna("@ab")
  def po() = bna("@po")
  def r() = bna("@r")
  def a() = bna("@a")
  def bb() = bna("@bb")
  def sac() = bna("@sac")
  def t() = bna("@t")
  def sf() = bna("@sf")
  def h() = bna("@h")
  def e() = bna("@e")
  def d() = bna("@d")
  def hbp() = bna("@hbp")
  def so() = bna("@so")
  def hr() = bna("@hr")
  def rbi() = bna("@rbi")
  def lob() = bna("@lob")
  def fldg() = bna("@fldg")
  def sb() = bna("@sb")
  def sHr() = bna("@s_hr")
  def sRbi() = bna("@s_rbi")
  def avg() = bna("@avg")

  def nameDisplayFirstLast() = {
    val nameDisplay = bna("@name_display_first_last")
    if (nameDisplay == "") {
      name()
    } else {
      nameDisplay
    }
  }

  private def bna(attribute: String) = (batterNode \ attribute).text
}
