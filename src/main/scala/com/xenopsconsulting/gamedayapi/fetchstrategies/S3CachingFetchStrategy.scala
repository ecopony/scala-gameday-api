package com.xenopsconsulting.gamedayapi.fetchstrategies

import scala.xml._
import java.util.Date
import dispatch._

import java.text.SimpleDateFormat
import java.io.ByteArrayInputStream
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.model.{PutObjectRequest, ObjectMetadata, GetObjectRequest}
import org.joda.time.DateTime


object S3CachingFetchStrategy extends FetchStrategy {
  val _http = new Http
  var _s3Client = new AmazonS3Client(new BasicAWSCredentials("", ""))
  var _bucketPrefix = "<change-me>-gameday-files-"

  def fetchEpg(date: Date): Elem = {
    val cachedEpg = fetchCachedFile(date, datePath(date), "epg.xml")
    cachedEpg match {
      case Some(n) => cachedEpg.get
      case None => {
        val epg = XML.loadString(_http(url(epgUrl(date)) as_str))
        cacheContent(date, datePath(date), "epg.xml", epg)
        epg
      }
    }
  }

  def fetchGame(date: Date, team: String, gid: String = null): Elem = {
    val cachedGame = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "game.xml")
    cachedGame match {
      case Some(n) => cachedGame.get
      case None => {
        val game = XML.loadString(_http(url(gameUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "game.xml", game)
        game
      }
    }
  }

  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem = {
    val cachedBoxScore = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "boxscore.xml")
    cachedBoxScore match {
      case Some(n) => cachedBoxScore.get
      case None => {
        val boxScore = XML.loadString(_http(url(boxScoreUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "boxscore.xml", boxScore)
        boxScore
      }
    }
  }

  def fetchLineScore(date: Date, team: String, gid: String = null): Elem = {
    val cachedLineScore = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "linescore.xml")
    cachedLineScore match {
      case Some(n) => cachedLineScore.get
      case None => {
        val lineScore = XML.loadString(_http(url(lineScoreUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "linescore.xml", lineScore)
        lineScore
      }
    }
  }

  def fetchHitChart(date: Date, team: String, gid: String = null) = {
    val cachedHitChart = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "inning/inning_hit.xml")

    cachedHitChart match {
      case Some(n) => cachedHitChart.get
      case None => {
        val hitChart = XML.loadString(_http(url(hitChartUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "inning/inning_hit.xml", hitChart)
        hitChart
      }
    }
  }

  def fetchInnings(date: Date, team: String, gid: String = null) = {
    val cachedInnings = fetchCachedFile(date, gameDirectoryPath(date, team, gid), "inning/inning_all.xml")
    cachedInnings match {
      case Some(n) => cachedInnings.get
      case None => {
        val innings = XML.loadString(_http(url(inningsUrl(date, team, gid)) as_str))
        cacheContent(date, gameDirectoryPath(date, team), "inning/inning_all.xml", innings)
        innings
      }
    }
  }

  def fetchInningScores(date: Date, team: String, gid: String = null) = {
      <xml/>
  }

  def fetchGameEvents(date: Date, team: String, gid: String = null) = {
      <xml/>
  }

  private def fetchCachedFile(date: Date, path: String, fileName: String) = {
    if (canCache(date)) {
      try {
        val s3Object = _s3Client.getObject(new GetObjectRequest(bucket(date), key(path, fileName)));
        Some(XML.load(s3Object.getObjectContent))
      } catch {
        case e => {
          None
        }
      }
    } else {
      None
    }
  }

  private def cacheContent(date: Date, path: String, fileName: String, content: Elem) {
    if (canCache(date)) {
      val streamBytes = content.toString.getBytes
      val gamedayStream = new ByteArrayInputStream(streamBytes)
      val metadata = new ObjectMetadata()
      metadata.setContentLength(streamBytes.length)
      _s3Client.putObject(new PutObjectRequest(bucket(date), key(path, fileName), gamedayStream, metadata));
    }
  }

  private def bucket(date: Date) = {
    _bucketPrefix + new SimpleDateFormat("yyyy").format(date)
  }

  private def key(path: String, fileName: String) = {
    (path + "-" + fileName).replaceAll("/", "-").replaceFirst("-", "")
  }

  private def canCache(date: Date):Boolean = {
    val now = new DateTime()
    val convertedDate = new DateTime(date)
    val okToCacheAfter = convertedDate.plusDays(1).toMutableDateTime()
    okToCacheAfter.addHours(3)

    if (now.isAfter(okToCacheAfter)) {
      return true
    }

    return false
  }

}