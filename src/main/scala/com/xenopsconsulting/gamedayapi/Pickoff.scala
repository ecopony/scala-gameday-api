package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Pickoff(pickoffNode: Node) {

  def des() =  (pickoffNode \ "@des").text

}