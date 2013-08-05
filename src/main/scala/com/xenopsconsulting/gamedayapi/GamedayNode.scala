package com.xenopsconsulting.gamedayapi

abstract class GamedayNode {

  protected def parseInt(attribute: String):Option[Int] = {
    try {
      val result = attribute.toInt
      Some(result)
    } catch {
      case e => {
        None
      }
    }
  }

  protected def parseFloat(attribute: String):Option[Float] = {
    try {
      val result = attribute.toFloat
      Some(result)
    } catch {
      case e => {
        None
      }
    }
  }
}
