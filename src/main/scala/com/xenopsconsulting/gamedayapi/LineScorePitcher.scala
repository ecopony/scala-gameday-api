package com.xenopsconsulting.gamedayapi

import xml.Node

case class LineScorePitcher(lineScoreNode: Node) {
  def id() = (lineScoreNode \ "@id").text
  def firstName() = (lineScoreNode \ "@first_name").text
  def first() = (lineScoreNode \ "@first").text
  def lastName() = (lineScoreNode \ "@last_name").text
  def last() = (lineScoreNode \ "@last").text
  def nameDisplayRoster() = (lineScoreNode \ "@name_display_roster").text
  def wins() = (lineScoreNode \ "@wins").text
  def losses() = (lineScoreNode \ "@losses").text
  def era() = (lineScoreNode \ "@era").text
  def sWins() = (lineScoreNode \ "@s_wins").text
  def sLosses() = (lineScoreNode \ "@s_losses").text
  def sEra() = (lineScoreNode \ "@s_era").text
  def saves() = (lineScoreNode \ "@saves").text
}
