package com.xenopsconsulting.gamedayapi.batch

import org.slf4j.LoggerFactory
import net.noerd.prequel._
import net.noerd.prequel.DatabaseConfig
import scala.Some
import com.xenopsconsulting.gamedayapi.Game

object MySQLDatabaseImporter {
  private val _log = LoggerFactory.getLogger(getClass)

  val database = DatabaseConfig(
    driver = "com.mysql.jdbc.Driver",
    jdbcURL = "jdbc:mysql://localhost:3306/scala_gameday_api",
    username = "gameday"
  )

  def createTables() {
    _log.info("Recreating pitch table")
    database.transaction { tx =>
      tx.execute("DROP TABLE IF EXISTS pitches;")
      tx.execute("CREATE TABLE pitches (gid varchar(40), year int, inning int, half varchar(6), at_bat_num int, at_bat_b int, " +
        "at_bat_s int, at_bat_o int, at_bat_start_tfs int, batter int, stand char(1), b_height varchar(4), pitcher int, " +
        "p_throws char(1), at_bat_des varchar(400), at_bat_event varchar(20), pitch_des varchar(40), pitch_id int, " +
        "pitch_type char(2), type_confidence DECIMAL(4, 3), pitch_tfs int, pitch_x DECIMAL(5, 2), pitch_y DECIMAL(5, 2), " +
        "pitch_sv_id varchar(40), pitch_start_speed DECIMAL(4, 1), pitch_end_speed DECIMAL(4, 1), sz_top DECIMAL(3, 2), " +
        "sz_bottom DECIMAL(3, 2), pfx_x DECIMAL(4, 2), pfx_z DECIMAL(4, 2), px DECIMAL(4, 3), pz DECIMAL(4, 3), " +
        "x0 DECIMAL(5, 3), y0 DECIMAL(5, 3), z0 DECIMAL(5, 3), vx0 DECIMAL(4, 2), vy0 DECIMAL(6, 3), vz0 DECIMAL(5, 3), " +
        "ax DECIMAL(5, 3), ay DECIMAL(5, 3), az DECIMAL(5, 3), break_y DECIMAL(3, 1), break_angle DECIMAL(4, 1), " +
        "break_length DECIMAL(3, 1), zone int, spin_dir DECIMAL(6, 3), spin_rate DECIMAL(7, 3));")
    }
  }

  def importPitchesByYearsAndTeam(years: List[Int], team: String) {
    val fetcher: Fetcher = new Fetcher()
    fetcher.fetchByYearsAndTeam(years, team, importPitches)
  }

  def importPitchesByYearAndTeam(year: Int, team: String) {
    val fetcher: Fetcher = new Fetcher()
    fetcher.fetchByYearAndTeam(year, team, importPitches)
  }

  def importPitchesByYear(year: Int) {
    val fetcher: Fetcher = new Fetcher()
    fetcher.fetchByYear(year, importPitches)
  }

  def importPitches(game: Game) {
    database.transaction { tx =>
      val gid: String = game.fetchStrategy.gid();

      _log.info("---------------------------------------------------------------------------------------")
      _log.info(gid)

      for (pitch <- game.pitches()) {
        val atBat = pitch.atBat

        try {
          tx.execute("insert into pitches values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
            " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            StringFormattable(gid), IntFormattable(game.year()), IntFormattable(atBat.inning.num.toInt), StringFormattable(atBat.half),
            IntFormattable(atBat.num().toInt), IntFormattable(atBat.b().toInt), IntFormattable(atBat.s().toInt),
            IntFormattable(atBat.o().toInt), Nullable(getIntFormattable(atBat.startTfs())), IntFormattable(atBat.batter().toInt),
            StringFormattable(atBat.stand()), StringFormattable(atBat.bHeight()), IntFormattable(atBat.pitcher().id().toInt),
            StringFormattable(atBat.pThrows()), StringFormattable(atBat.des()), StringFormattable(atBat.event()),
            StringFormattable(pitch.des()), IntFormattable(pitch.id().toInt), StringFormattable(pitch.pitchType()),
            Nullable(getFloatFormattable(pitch.typeConfidence())),
            Nullable(getIntFormattable(pitch.tfs())), FloatFormattable(pitch.x().toFloat), FloatFormattable(pitch.y().toFloat),
            StringFormattable(pitch.svId()), Nullable(getFloatFormattable(pitch.startSpeed())),
            Nullable(getFloatFormattable(pitch.endSpeed())), Nullable(getFloatFormattable(pitch.szTop())),
            Nullable(getFloatFormattable(pitch.szBot())), Nullable(getFloatFormattable(pitch.pfxX())),
            Nullable(getFloatFormattable(pitch.pfxZ())), Nullable(getFloatFormattable(pitch.px())),
            Nullable(getFloatFormattable(pitch.pz())), Nullable(getFloatFormattable(pitch.x0())),
            Nullable(getFloatFormattable(pitch.y0())), Nullable(getFloatFormattable(pitch.z0())),
            Nullable(getFloatFormattable(pitch.vx0())), Nullable(getFloatFormattable(pitch.vy0())),
            Nullable(getFloatFormattable(pitch.vz0())), Nullable(getFloatFormattable(pitch.ax())),
            Nullable(getFloatFormattable(pitch.ay())), Nullable(getFloatFormattable(pitch.az())),
            Nullable(getFloatFormattable(pitch.breakY())), Nullable(getFloatFormattable(pitch.breakAngle())),
            Nullable(getFloatFormattable(pitch.breakLength())), Nullable(getIntFormattable(pitch.zone())),
            Nullable(getFloatFormattable(pitch.spinDir())), Nullable(getFloatFormattable(pitch.spinRate()))
          )
        } catch {
          case e: Throwable => {
            e.printStackTrace()
          }
        }
      }
    }
  }

  private def getFloatFormattable(value: Option[Float]):Option[Formattable] = {
    if (value.isDefined) {
      Some(FloatFormattable(value.get))
    } else {
      None
    }
  }

  private def getIntFormattable(value: Option[Int]):Option[Formattable] = {
    if (value.isDefined) {
      Some(IntFormattable(value.get))
    } else {
      None
    }
  }
}
