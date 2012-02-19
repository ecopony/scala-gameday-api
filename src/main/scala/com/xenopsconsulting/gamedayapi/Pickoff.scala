package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Pickoff(pickoffNode: Node, atBat: AtBat) {

  def des() =  (pickoffNode \ "@des").text

}