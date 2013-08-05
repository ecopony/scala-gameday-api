package com.xenopsconsulting.gamedayapi


case class GameStats(game: Game) {
  val pitches = game.pitches()

  def nastiestPitch(): Option[Pitch] = {
    var nastiest:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.nasty().toFloat > nastiest.nasty().toFloat) {
          nastiest = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (nastiest.nasty() != "") {
      Some(nastiest)
    } else None
  }

  def fastestPitch(): Option[Pitch] = {
    var fastest:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.startSpeed().get > fastest.startSpeed().get) {
          fastest = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (fastest.startSpeed() != None) {
      Some(fastest)
    } else None
  }

  def slowestPitch(): Option[Pitch] = {
    var slowest:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.startSpeed().get < slowest.startSpeed().get) {
          slowest = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (slowest.startSpeed() != None) {
      Some(slowest)
    } else None
  }

  def highestBreakAngle(): Option[Pitch] = {
    var highestBreak:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.breakAngle().get > highestBreak.breakAngle().get) {
          highestBreak = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (highestBreak.breakAngle() != None) {
      Some(highestBreak)
    } else None
  }

  def lowestBreakAngle(): Option[Pitch] = {
    var lowestBreak:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.breakAngle().get < lowestBreak.breakAngle().get) {
          lowestBreak = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (lowestBreak.breakAngle() != None) {
      Some(lowestBreak)
    } else None
  }

  def highestSpinRate(): Option[Pitch] = {
    var highestSpin:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.spinRate().get > highestSpin.spinRate().get) {
          highestSpin = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (highestSpin.spinRate() != None) {
      Some(highestSpin)
    } else None
  }

  def lowestSpinRate(): Option[Pitch] = {
    var lowestSpin:Pitch = game.pitches().head

    for (pitch <- game.pitches()) {
      try {
        if (pitch.spinRate().get < lowestSpin.spinRate().get) {
          lowestSpin = pitch
        }
      } catch {
        case e: Throwable => {}
      }
    }

    if (lowestSpin.spinRate() != None) {
      Some(lowestSpin)
    } else None
  }

}
