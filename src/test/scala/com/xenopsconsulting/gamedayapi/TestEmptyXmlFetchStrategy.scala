package com.xenopsconsulting.gamedayapi

import fetchstrategies.FetchStrategy
import xml.Elem
import java.util.Date

class TestEmptyXmlFetchStrategy(date: Date, team: String) extends FetchStrategy {
  val _date = date
  val _team = team

  /*
    All test XML file is bound to the following:

     <!--Copyright 2011 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms
      posted here http://gdx.mlb.com/components/copyright.txt-->
   */

  def fetchEpg(): Elem = {
    <epg></epg>
  }

  def fetchGame(): Elem = {
    <game>
        <team type="home" name="Kansas City" />
    </game>
  }

  def fetchBoxScore(): Elem = {
    <boxscore></boxscore>
  }

  def fetchLineScore(): Elem = {
    <game></game>
  }

  def fetchHitChart(): Elem = {
    <hitchart></hitchart>
  }

  def fetchInnings(): Elem = {
    <game></game>
  }

  def fetchInningScores() = {
    <scores></scores>
  }

  def fetchGameEvents() = {
    <game></game>
  }
}