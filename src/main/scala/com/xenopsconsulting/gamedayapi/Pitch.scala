package com.xenopsconsulting.gamedayapi

import scala.xml._

case class Pitch(pitchNode: Node) {

  def des() = pna("@des")
  def id() = pna("@id")
  def theType() = pna("@type")
  def tfs() = pna("@tfs")
  def tfsZulu() = pna("@tfs_zulu")
  def x() = pna("@x")
  def y() = pna("@y")
  def svId() = pna("@sv_id")
  def startSpeed() = pna("@start_speed")
  def endSpeed() = pna("@end_speed")
  def szTop() = pna("@sz_top")
  def szBot() = pna("@sz_bot")
  def pfxX() = pna("@pfx_x")
  def pfxZ() = pna("@pfx_z")
  def px() = pna("@px")
  def pz() = pna("@pz")
  def x0() = pna("@x0")
  def y0() = pna("@y0")
  def z0() = pna("@z0")
  def vx0() = pna("@vx0")
  def vy0() = pna("@vy0")
  def vz0() = pna("@vz0")
  def ax() = pna("@ax")
  def ay() = pna("@ay")
  def az() = pna("@az")
  def breakY() = pna("@break_y")
  def breakAngle() = pna("@break_angle")
  def breakLength() = pna("@break_length")
  def pitchType() = pna("@pitch_type")
  def typeConfidence() = pna("@type_confidence")
  def zone() = pna("@zone")
  def nasty() = pna("@nasty")
  def spinDir() = pna("@spin_dir")
  def spinRate() = pna("@spin_rate")
  def cc() = pna("@cc")
  def mt() = pna("@mt")

  private def pna(attribute: String) = (pitchNode \ attribute).text

}