package com.xenopsconsulting.gamedayapi

import xml.Elem
import java.util.Date

object TestEmptyXmlFetchStrategy extends FetchStrategy {

  /*
    All test XML file is bound to the following:

     <!--Copyright 2011 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms
      posted here http://gdx.mlb.com/components/copyright.txt-->
   */

  def fetchEpg(date: Date): Elem = {
    <epg></epg>
  }

  def fetchGame(date: Date, team: String, gid: String = null): Elem = {
    <game>
        <team type="home" name="Kansas City" />
    </game>
  }

  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem = {
    <boxscore></boxscore>
  }

  def fetchLineScore(date: Date, team: String, gid: String = null): Elem = {
    <game></game>
  }

  def fetchHitChart(date: Date, team: String, gid: String = null): Elem = {
    <hitchart></hitchart>
  }

  def fetchInnings(date: Date, team: String, gid: String = null): Elem = {
    <game></game>
  }

  def fetchInningScores(date: Date, team: String, gid: String = null) = {
    <scores></scores>
  }

  def fetchGameEvents(date: Date, team: String, gid: String = null) = {
    <game></game>
  }
}