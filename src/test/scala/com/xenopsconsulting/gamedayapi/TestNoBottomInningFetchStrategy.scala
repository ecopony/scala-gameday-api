package com.xenopsconsulting.gamedayapi

import fetchstrategies.FetchStrategy
import xml.Elem
import java.util.Date

class TestNoBottomInningFetchStrategy(date: Date, team: String) extends FetchStrategy {
  val _date = date
  val _team = team

  /*
    All test XML file is bound to the following:

     <!--Copyright 2011 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms
      posted here http://gdx.mlb.com/components/copyright.txt-->
   */

  def fetchEpg(): Elem = {
    <epg/>
  }

  def fetchGame(): Elem = {
    <game/>
  }

  def fetchBoxScore(): Elem = {
    <boxscore/>
  }

  def fetchLineScore(): Elem = {
    <game/>
  }

  def fetchHitChart(): Elem = {
    <hitchart/>
  }

  def fetchInnings(): Elem = {
    <game atBat="123660" deck="340192" hole="453056" ind="F">
      <inning num="1" away_team="bos" home_team="sea" next="Y">
        <top>
          <atbat num="1" b="1" s="2" o="1" start_tfs="220954" start_tfs_zulu="2011-08-14T02:09:54Z" batter="453056" stand="L" b_height="6-1" pitcher="433587" p_throws="R" des="Jacoby Ellsbury pops out to shortstop Jack Wilson. " event="Pop Out">
              <pitch des="Ball" id="3" type="B" tfs="221017" tfs_zulu="2011-08-14T02:10:17Z" x="108.15" y="121.75" sv_id="110813_191020" start_speed="91.6" end_speed="84.3" sz_top="3.19" sz_bot="1.52" pfx_x="-3.39" pfx_z="3.96" px="-0.311" pz="3.362" x0="-2.411" y0="50.0" z0="5.765" vx0="6.728" vy0="-134.21" vz0="-1.659" ax="-6.173" ay="29.604" az="-24.898" break_y="23.8" break_angle="10.6" break_length="5.7" pitch_type="FF" type_confidence=".901" zone="11" nasty="65" spin_dir="220.310" spin_rate="1031.450" cc=" " mt=" "/>
              <pitch des="Foul" id="4" type="S" tfs="221031" tfs_zulu="2011-08-14T02:10:31Z" x="120.17" y="129.52" sv_id="110813_191033" start_speed="92.9" end_speed="84.8" sz_top="3.47" sz_bot="1.6" pfx_x="-7.88" pfx_z="2.42" px="-0.556" pz="3.024" x0="-2.51" y0="50.0" z0="5.741" vx0="7.955" vy0="-136.027" vz0="-2.096" ax="-14.599" ay="33.066" az="-27.619" break_y="23.7" break_angle="24.4" break_length="6.8" pitch_type="SI" type_confidence=".933" zone="1" nasty="51" spin_dir="252.671" spin_rate="1631.070" cc=" " mt=" "/>
              <pitch des="Foul" id="5" type="S" tfs="221051" tfs_zulu="2011-08-14T02:10:51Z" x="84.98" y="140.74" sv_id="110813_191053" start_speed="93.5" end_speed="86.0" sz_top="3.47" sz_bot="1.6" pfx_x="-8.48" pfx_z="3.41" px="0.5" pz="2.848" x0="-1.938" y0="50.0" z0="5.671" vx0="9.553" vy0="-136.761" vz0="-2.864" ax="-16.047" ay="30.52" az="-25.654" break_y="23.8" break_angle="28.0" break_length="6.4" pitch_type="SI" type_confidence=".945" zone="3" nasty="47" spin_dir="247.887" spin_rate="1837.438" cc="Felix Hernandez is trying to tie up Jacoby Ellsbury with fastballs inside, where Jacoby Ellsbury hits .371." mt=" "/>
              <pitch des="In play, out(s)" id="6" type="X" tfs="221112" tfs_zulu="2011-08-14T02:11:12Z" x="84.12" y="144.20" sv_id="110813_191115" start_speed="87.3" end_speed="81.6" sz_top="3.47" sz_bot="1.6" pfx_x="2.98" pfx_z="-5.24" px="0.387" pz="2.629" x0="-2.316" y0="50.0" z0="5.914" vx0="5.869" vy0="-127.927" vz0="-0.267" ax="4.978" ay="24.333" az="-40.853" break_y="23.9" break_angle="-8.3" break_length="10.0" pitch_type="SL" type_confidence=".901" zone="6" nasty="27" spin_dir="29.836" spin_rate="1134.669" cc=" " mt=" "/>
          </atbat>
          <atbat num="2" b="1" s="1" o="2" start_tfs="221134" start_tfs_zulu="2011-08-14T02:11:34Z" batter="408307" stand="L" b_height="6-2" pitcher="433587" p_throws="R" des="Carl Crawford grounds out, second baseman Dustin Ackley to first baseman Mike Carp. " event="Groundout">
              <pitch des="Ball" id="10" type="B" tfs="221141" tfs_zulu="2011-08-14T02:11:41Z" x="164.81" y="132.11" sv_id="110813_191144" start_speed="80.3" end_speed="73.7" sz_top="3.47" sz_bot="1.52" pfx_x="7.17" pfx_z="-11.9" px="-1.863" pz="2.928" x0="-2.552" y0="50.0" z0="6.139" vx0="-0.555" vy0="-117.691" vz0="3.098" ax="9.895" ay="25.598" az="-48.531" break_y="23.8" break_angle="-11.5" break_length="14.4" pitch_type="CU" type_confidence=".893" zone="11" nasty="64" spin_dir="31.170" spin_rate="2356.570" cc=" " mt=" "/>
              <pitch des="Called Strike" id="11" type="S" tfs="221152" tfs_zulu="2011-08-14T02:11:52Z" x="104.72" y="146.79" sv_id="110813_191155" start_speed="89.3" end_speed="82.6" sz_top="3.82" sz_bot="1.86" pfx_x="-6.47" pfx_z="1.08" px="-0.415" pz="2.553" x0="-2.205" y0="50.0" z0="5.919" vx0="6.796" vy0="-130.754" vz0="-2.845" ax="-11.222" ay="27.113" az="-30.227" break_y="23.8" break_angle="17.8" break_length="7.6" pitch_type="CH" type_confidence=".933" zone="4" nasty="33" spin_dir="260.157" spin_rate="1263.740" cc=" " mt=" "/>
              <pitch des="In play, out(s)" id="12" type="X" tfs="221204" tfs_zulu="2011-08-14T02:12:04Z" x="120.17" y="147.65" sv_id="110813_191206" start_speed="95.0" end_speed="87.0" sz_top="3.47" sz_bot="1.52" pfx_x="-8.01" pfx_z="2.25" px="-0.473" pz="2.498" x0="-1.884" y0="50.0" z0="5.783" vx0="6.705" vy0="-139.189" vz0="-3.931" ax="-15.57" ay="33.799" az="-27.719" break_y="23.8" break_angle="26.1" break_length="6.7" pitch_type="SI" type_confidence=".931" zone="4" nasty="41" spin_dir="254.032" spin_rate="1688.003" cc=" " mt=" "/>
          </atbat>
          <atbat num="3" b="2" s="2" o="3" start_tfs="221227" start_tfs_zulu="2011-08-14T02:12:27Z" batter="408236" stand="L" b_height="6-2" pitcher="433587" p_throws="R" des="Adrian Gonzalez lines out to center fielder Franklin Gutierrez. " event="Lineout">
              <pitch des="Ball" id="16" type="B" tfs="221246" tfs_zulu="2011-08-14T02:12:46Z" x="139.06" y="115.70" sv_id="110813_191249" start_speed="93.4" end_speed="84.8" sz_top="3.57" sz_bot="1.74" pfx_x="-7.25" pfx_z="3.96" px="-1.336" pz="3.616" x0="-2.361" y0="50.0" z0="5.744" vx0="5.275" vy0="-136.944" vz0="-1.116" ax="-13.55" ay="34.769" az="-24.704" break_y="23.7" break_angle="26.1" break_length="6.1" pitch_type="SI" type_confidence=".886" zone="11" nasty="49" spin_dir="241.132" spin_rate="1639.171" cc=" " mt=" "/>
              <pitch des="Foul" id="17" type="S" tfs="221300" tfs_zulu="2011-08-14T02:13:00Z" x="84.98" y="124.34" sv_id="110813_191303" start_speed="93.6" end_speed="85.8" sz_top="3.57" sz_bot="1.74" pfx_x="-6.74" pfx_z="3.42" px="0.375" pz="3.459" x0="-1.842" y0="50.0" z0="5.772" vx0="8.342" vy0="-136.997" vz0="-1.493" ax="-12.74" ay="31.718" az="-25.639" break_y="23.8" break_angle="22.7" break_length="6.1" pitch_type="SI" type_confidence=".899" zone="3" nasty="52" spin_dir="242.844" spin_rate="1516.292" cc="Felix Hernandez is trying to tie up Adrian Gonzalez with fastballs inside, where Adrian Gonzalez hits .415." mt=" "/>
              <pitch des="Ball" id="18" type="B" tfs="221323" tfs_zulu="2011-08-14T02:13:23Z" x="145.06" y="133.84" sv_id="110813_191326" start_speed="94.7" end_speed="86.9" sz_top="3.57" sz_bot="1.74" pfx_x="-2.94" pfx_z="3.38" px="-1.464" pz="2.749" x0="-2.447" y0="50.0" z0="5.687" vx0="3.727" vy0="-138.77" vz0="-3.358" ax="-5.693" ay="32.682" az="-25.549" break_y="23.8" break_angle="10.4" break_length="5.6" pitch_type="FF" type_confidence=".994" zone="11" nasty="21" spin_dir="220.672" spin_rate="913.212" cc=" " mt=" "/>
              <pitch des="Foul" id="19" type="S" tfs="221338" tfs_zulu="2011-08-14T02:13:38Z" x="113.30" y="130.38" sv_id="110813_191340" start_speed="93.7" end_speed="84.9" sz_top="3.57" sz_bot="1.74" pfx_x="-8.13" pfx_z="2.59" px="-0.483" pz="3.036" x0="-2.39" y0="50.0" z0="5.707" vx0="7.947" vy0="-137.111" vz0="-2.097" ax="-15.184" ay="35.573" az="-27.269" break_y="23.7" break_angle="25.4" break_length="6.7" pitch_type="SI" type_confidence=".939" zone="1" nasty="47" spin_dir="252.097" spin_rate="1688.380" cc=" " mt=" "/>
              <pitch des="In play, out(s)" id="20" type="X" tfs="221402" tfs_zulu="2011-08-14T02:14:02Z" x="101.29" y="154.56" sv_id="110813_191405" start_speed="83.0" end_speed="76.3" sz_top="3.57" sz_bot="1.74" pfx_x="5.96" pfx_z="-11.2" px="0.037" pz="2.039" x0="-2.129" y0="50.0" z0="5.996" vx0="3.323" vy0="-121.684" vz0="0.753" ax="8.782" ay="27.849" az="-48.588" break_y="23.8" break_angle="-11.0" break_length="13.6" pitch_type="CU" type_confidence=".892" zone="8" nasty="22" spin_dir="28.147" spin_rate="2219.460" cc=" " mt=" "/>
          </atbat>
        </top>
      </inning>
    </game>
  }

  def fetchInningScores() = {
    <scores/>
  }

  def fetchGameEvents() = {
    <game/>
  }
}