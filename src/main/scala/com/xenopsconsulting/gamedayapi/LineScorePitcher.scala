package com.xenopsconsulting.gamedayapi

import xml.Node

class LineScorePitcher(lineScoreNode: Node) {
  def id():String = (lineScoreNode \ "@id").text
  def firstName():String = (lineScoreNode \ "@first_name").text
  def first():String = (lineScoreNode \ "@first").text
  def lastName():String = (lineScoreNode \ "@last_name").text
  def last():String = (lineScoreNode \ "@last").text
  def nameDisplayRoster():String = (lineScoreNode \ "@name_display_roster").text
  def wins():String = (lineScoreNode \ "@wins").text
  def losses():String = (lineScoreNode \ "@losses").text
  def era():String = (lineScoreNode \ "@era").text
  def sWins():String = (lineScoreNode \ "@s_wins").text
  def sLosses():String = (lineScoreNode \ "@s_losses").text
  def sEra():String = (lineScoreNode \ "@s_era").text
  def saves():String = (lineScoreNode \ "@saves").text
}
