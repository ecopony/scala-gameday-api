package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Pitch(pitchNode: Node, atBat:AtBat) extends GamedayNode {

  def des() = pna("@des")
  def id() = pna("@id")
  def theType() = pna("@type")
  def tfs(): Option[Int] = parseInt(pna("@tfs"))
  def tfsZulu() = pna("@tfs_zulu")
  def x() = pna("@x")
  def y() = pna("@y")
  def svId() = pna("@sv_id")
  def startSpeed():Option[Float] = parseFloat(pna("@start_speed"))
  def endSpeed():Option[Float] = parseFloat(pna("@end_speed"))
  def szTop():Option[Float] = parseFloat(pna("@sz_top"))
  def szBot():Option[Float] = parseFloat(pna("@sz_bot"))
  def pfxX():Option[Float] = parseFloat(pna("@pfx_x"))
  def pfxZ():Option[Float] = parseFloat(pna("@pfx_z"))
  def px():Option[Float] = parseFloat(pna("@px"))
  def pz():Option[Float] = parseFloat(pna("@pz"))
  def x0():Option[Float] = parseFloat(pna("@x0"))
  def y0():Option[Float] = parseFloat(pna("@y0"))
  def z0():Option[Float] = parseFloat(pna("@z0"))
  def vx0():Option[Float] = parseFloat(pna("@vx0"))
  def vy0():Option[Float] = parseFloat(pna("@vy0"))
  def vz0():Option[Float] = parseFloat(pna("@vz0"))
  def ax():Option[Float] = parseFloat(pna("@ax"))
  def ay():Option[Float] = parseFloat(pna("@ay"))
  def az():Option[Float] = parseFloat(pna("@az"))
  def breakY():Option[Float] = parseFloat(pna("@break_y"))
  def breakAngle():Option[Float] = parseFloat(pna("@break_angle"))
  def breakLength():Option[Float] = parseFloat(pna("@break_length"))
  def pitchType() = pna("@pitch_type")
  def typeConfidence():Option[Float] = parseFloat(pna("@type_confidence"))
  def zone():Option[Int] = parseInt(pna("@zone"))
  def nasty() = pna("@nasty")
  def spinDir():Option[Float] = parseFloat(pna("@spin_dir"))
  def spinRate():Option[Float] = parseFloat(pna("@spin_rate"))
  def cc() = pna("@cc")
  def mt() = pna("@mt")

  def pitcher() = atBat.pitcher()

  private def pna(attribute: String) = (pitchNode \ attribute).text
}