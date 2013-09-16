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


class S3CachingFetchStrategy(date: Date, team: String) extends CachingStrategy {
  val _date = date
  val _team = team

  var _s3Client = new AmazonS3Client(new BasicAWSCredentials("", ""))
  var _bucketPrefix = "<change-me>-gameday-files-"

  def fetchCachedFile(date: Date, path: String, fileName: String) = {
    if (canCache(date)) {
      try {
        val s3Object = _s3Client.getObject(new GetObjectRequest(bucket(date), key(path, fileName)));
        Some(XML.load(s3Object.getObjectContent))
      } catch {
        case e : Throwable => {
          None
        }
      }
    } else {
      None
    }
  }

  def cacheContent(date: Date, path: String, fileName: String, content: Elem) {
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

}
