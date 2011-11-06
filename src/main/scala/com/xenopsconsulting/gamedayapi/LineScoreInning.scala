package com.xenopsconsulting.gamedayapi

import xml.Node

class LineScoreInning(lineScoreNode: Node) {
  def inning():String = (lineScoreNode \ "@inning").text
  def homeInningRuns():String = (lineScoreNode \ "@home_inning_runs").text
  def awayInningRuns():String = (lineScoreNode \ "@away_inning_runs").text
}