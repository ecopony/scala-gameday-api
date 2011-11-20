package com.xenopsconsulting.gamedayapi

import xml.Node

case class LineScoreInning(lineScoreNode: Node) {
  def inning() = (lineScoreNode \ "@inning").text
  def homeInningRuns() = (lineScoreNode \ "@home_inning_runs").text
  def awayInningRuns() = (lineScoreNode \ "@away_inning_runs").text
}