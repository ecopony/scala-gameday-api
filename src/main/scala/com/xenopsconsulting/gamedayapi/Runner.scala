package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Runner(runnerNode: Node, atBat: AtBat) {

  def id() = rna("@id")
  def start() = rna("@start")
  def end() = rna("@end")
  def event() = rna("@event")
  def score() = rna("@score")
  def rbi() = rna("@rbi")
  def earned() = rna("@earned")

  private def rna(attribute: String) = (runnerNode \ attribute).text

}