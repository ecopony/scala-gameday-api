package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Runner(runnerNode: Node) {

  private def rna(attribute: String) = (runnerNode \ attribute).text

}