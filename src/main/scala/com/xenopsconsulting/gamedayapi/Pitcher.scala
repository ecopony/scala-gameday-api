package com.xenopsconsulting.gamedayapi

import xml.Node

case class Pitcher(pitcherNode: Node) {
  def id() = pna("@id")
  def name() = pna("@name")
  def nameDisplayFirstLast() = pna("@name_display_first_last")
  def pos() = pna("@pos")
  def out() = pna("@out")
  def bf() = pna("@bf")
  def er() = pna("@er")
  def r() = pna("@r")
  def h() = pna("@h")
  def so() = pna("@so")
  def hr() = pna("@hr")
  def bb() = pna("@bb")
  def w() = pna("@w")
  def l() = pna("@l")
  def sv() = pna("@sv")
  def bs() = pna("@bs")
  def hld() = pna("@hld")
  def era() = pna("@era")
  def note() = pna("@note")

  private def pna(attribute: String) = (pitcherNode \ attribute).text
}
