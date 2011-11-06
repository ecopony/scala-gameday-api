package com.xenopsconsulting.gamedayapi

import xml.Node

class Pitcher(pitcherNode: Node) {
  def id():String = pna("@id")
  def name():String = pna("@name")
  def nameDisplayFirstLast():String = pna("@name_display_first_last")
  def pos():String = pna("@pos")
  def out():String = pna("@out")
  def bf():String = pna("@bf")
  def er():String = pna("@er")
  def r():String = pna("@r")
  def h():String = pna("@h")
  def so():String = pna("@so")
  def hr():String = pna("@hr")
  def bb():String = pna("@bb")
  def w():String = pna("@w")
  def l():String = pna("@l")
  def sv():String = pna("@sv")
  def bs():String = pna("@bs")
  def hld():String = pna("@hld")
  def era():String = pna("@era")
  def note():String = pna("@note")

  private def pna(attribute: String):String = (pitcherNode \ attribute).text
}
