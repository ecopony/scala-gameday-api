package com.xenopsconsulting.gamedayapi

import xml.Node

case class Score(scoreNode: Node) {

  def atBat() = AtBat((scoreNode \ "atbat").head, half())

  def inn() = sna("@inn")
  def atBatNum() = sna("@atbat_num")
  def topInning() = sna("@top_inning")
  def home() = sna("@home")
  def away() = sna("@away")
  def pbp() = sna("@pbp")

  def half(): String = {
    topInning() match {
      case "Y" => "top"
      case "N" => "bottom"
      case _ => ""
    }
  }

  private def sna(attribute: String) = (scoreNode \ attribute).text

}