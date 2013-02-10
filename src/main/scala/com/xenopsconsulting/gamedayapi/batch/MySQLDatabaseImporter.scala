package com.xenopsconsulting.gamedayapi.batch

import com.xenopsconsulting.gamedayapi.fetchstrategies.{LocalCachingFetchStrategy, FetchStrategy}
import com.xenopsconsulting.gamedayapi._
import org.joda.time.DateTime
import com.xenopsconsulting.gamedayapi.ScheduleYear
import org.slf4j.LoggerFactory
import net.noerd.prequel.{FloatFormattable, IntFormattable, StringFormattable, DatabaseConfig}

object MySQLDatabaseImporter {
  private val _log = LoggerFactory.getLogger(getClass)

  val database = DatabaseConfig(
    driver = "com.mysql.jdbc.Driver",
    jdbcURL = "jdbc:mysql://localhost:3306/scala_gameday_api",
    username = "gameday"
  )

  def createTables() {
    database.transaction { tx =>
      tx.execute("DROP TABLE IF EXISTS pitches;")
      tx.execute("CREATE TABLE pitches (gid varchar(40), inning int, half varchar(6), at_bat_num int, start_tfs int, " +
        "batter int, stand char(1), b_height varchar(4), pitcher int, p_throws char(1), at_bat_des varchar(400), " +
        "event varchar(20), pitch_des varchar(40), pitch_id int, pitch_type char(2), pitch_tfs int, " +
        "pitch_x DECIMAL(5, 2), pitch_y DECIMAL(5, 2));")
    }
  }

  def importPitchesByYearAndTeam(year: Int, team: String) {
    val fetcher: Fetcher = new Fetcher(LocalCachingFetchStrategy)
    fetcher.fetchByYearAndTeam(year, team, importPitches)
  }

  def importPitches(game: Game) {
    database.transaction { tx =>
      val gid: String = game.gid();

      println("---------------------------------------------------------------------------------------")
      println(gid)

      for (pitch <- game.pitches()) {
        val atBat = pitch.atBat

        tx.execute("insert into pitches values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
          StringFormattable(gid), IntFormattable(atBat.inning.num.toInt), StringFormattable(atBat.half),
          IntFormattable(atBat.num().toInt), IntFormattable(atBat.startTfs().toInt),
          IntFormattable(atBat.batter().toInt), StringFormattable(atBat.stand()), StringFormattable(atBat.bHeight()),
          IntFormattable(atBat.pitcher().id().toInt), StringFormattable(atBat.pThrows()), StringFormattable(atBat.des()),
          StringFormattable(atBat.event()), StringFormattable(pitch.des()), IntFormattable(pitch.id().toInt),
          StringFormattable(pitch.pitchType()), IntFormattable(pitch.tfs().toInt), FloatFormattable(pitch.x().toFloat),
          FloatFormattable(pitch.y().toFloat)
        )
      }
    }
  }
}
