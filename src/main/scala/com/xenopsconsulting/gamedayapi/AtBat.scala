package com.xenopsconsulting.gamedayapi

import scala.xml._

case class AtBat(atBatNode: Node) {

  def num() = ( atBatNode \ "@num" ).text

}