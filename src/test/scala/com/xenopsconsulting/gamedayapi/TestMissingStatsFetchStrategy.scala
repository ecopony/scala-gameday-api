package com.xenopsconsulting.gamedayapi

import fetchstrategies.FetchStrategy
import xml.Elem
import java.util.Date

object TestMissingStatsFetchStrategy extends FetchStrategy {

  /*
    All test XML file is bound to the following:

     <!--Copyright 2011 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms
      posted here http://gdx.mlb.com/components/copyright.txt-->
   */

  def fetchEpg(date: Date): Elem = {
    <epg date="20110813" last_modified="2011-08-14T17:52:23Z" display_time_zone="ET">
      <game calendar_event_id="14-288681-2011-08-13" start="2011-08-13T13:07:00-0400"
            id="2011/08/13/anamlb-tormlb-1"
            venue="Rogers Centre"
            game_pk="288681"
            time_zone="ET"
            ampm="PM"
            away_time="10:07"
            away_time_zone="PT"
            away_ampm="AM"
            home_time="1:07"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="1:07"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="1:07"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="14"
            scheduled_innings="9"
            description=""
            away_name_abbrev="LAA"
            home_name_abbrev="TOR"
            away_code="ana"
            away_file_code="ana"
            away_team_id="108"
            away_team_city="LA Angels"
            away_team_name="Angels"
            away_division="W"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="tor"
            home_file_code="tor"
            home_team_id="141"
            home_team_city="Toronto"
            home_team_name="Blue Jays"
            home_division="E"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="3.0"
            home_games_back="13.5"
            away_games_back_wildcard="8.0"
            home_games_back_wildcard="12.5"
            venue_w_chan_loc="CAXX0504"
            gameday="2011_08_13_anamlb_tormlb_1"
            away_win="65"
            away_loss="55"
            home_win="60"
            home_loss="59"
            league="AA"
            time="1:07"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="2"
            home_team_runs="11"
            away_team_hits="4"
            home_team_hits="13"
            away_team_errors="1"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288681-2011-08-13"
                   start="2011-08-13T13:07:00-0400"
                   title="LAA @ TOR"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/anator_288681_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288690-2011-08-13" start="2011-08-13T16:10:00-0400"
            id="2011/08/13/pitmlb-milmlb-1"
            venue="Miller Park"
            game_pk="288690"
            time_zone="ET"
            ampm="PM"
            away_time="4:10"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="3:10"
            home_time_zone="CT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="4:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="4:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="32"
            scheduled_innings="9"
            description=""
            away_name_abbrev="PIT"
            home_name_abbrev="MIL"
            away_code="pit"
            away_file_code="pit"
            away_team_id="134"
            away_team_city="Pittsburgh"
            away_team_name="Pirates"
            away_division="C"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="mil"
            home_file_code="mil"
            home_team_id="158"
            home_team_city="Milwaukee"
            home_team_name="Brewers"
            home_division="C"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="12.0"
            home_games_back="-"
            away_games_back_wildcard="13.0"
            home_games_back_wildcard=""
            venue_w_chan_loc="USWI0455"
            gameday="2011_08_13_pitmlb_milmlb_1"
            away_win="56"
            away_loss="62"
            home_win="69"
            home_loss="51"
            league="NN"
            time="4:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="0"
            home_team_runs="1"
            away_team_hits="3"
            home_team_hits="8"
            away_team_errors="0"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288690-2011-08-13"
                   start="2011-08-13T16:10:00-0400"
                   title="PIT @ MIL"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/pitmil_288690_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288693-2011-08-13" start="2011-08-13T16:10:00-0400"
            id="2011/08/13/tbamlb-nyamlb-1"
            venue="Yankee Stadium"
            game_pk="288693"
            time_zone="ET"
            ampm="PM"
            away_time="4:10"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="4:10"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="4:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="4:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="3313"
            scheduled_innings="9"
            description=""
            away_name_abbrev="TB"
            home_name_abbrev="NYY"
            away_code="tba"
            away_file_code="tb"
            away_team_id="139"
            away_team_city="Tampa Bay"
            away_team_name="Rays"
            away_division="E"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="nya"
            home_file_code="nyy"
            home_team_id="147"
            home_team_city="NY Yankees"
            home_team_name="Yankees"
            home_division="E"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="9.5"
            home_games_back="1.0"
            away_games_back_wildcard="8.5"
            home_games_back_wildcard="-"
            venue_w_chan_loc="USNY0172"
            gameday="2011_08_13_tbamlb_nyamlb_1"
            away_win="64"
            away_loss="55"
            home_win="72"
            home_loss="46"
            league="AA"
            time="4:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="2"
            home_team_runs="9"
            away_team_hits="5"
            home_team_hits="15"
            away_team_errors="0"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288693-2011-08-13"
                   start="2011-08-13T16:10:00-0400"
                   title="TB @ NYY"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/tbanya_288693_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288694-2011-08-13" start="2011-08-13T16:10:00-0400"
            id="2011/08/13/texmlb-oakmlb-1"
            venue="Oakland Coliseum"
            game_pk="288694"
            time_zone="ET"
            ampm="PM"
            away_time="3:10"
            away_time_zone="CT"
            away_ampm="PM"
            home_time="1:10"
            home_time_zone="PT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="4:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="4:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="10"
            scheduled_innings="9"
            description=""
            away_name_abbrev="TEX"
            home_name_abbrev="OAK"
            away_code="tex"
            away_file_code="tex"
            away_team_id="140"
            away_team_city="Texas"
            away_team_name="Rangers"
            away_division="W"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="oak"
            home_file_code="oak"
            home_team_id="133"
            home_team_city="Oakland"
            home_team_name="Athletics"
            home_division="W"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="-"
            home_games_back="14.5"
            away_games_back_wildcard=""
            home_games_back_wildcard="19.5"
            venue_w_chan_loc="USCA0791"
            gameday="2011_08_13_texmlb_oakmlb_1"
            away_win="68"
            away_loss="52"
            home_win="53"
            home_loss="66"
            league="AA"
            time="4:10"
            top_inning="N"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="7"
            home_team_runs="1"
            away_team_hits="11"
            home_team_hits="5"
            away_team_errors="0"
            home_team_errors="4">
        <game_media>
            <media type="game" calendar_event_id="14-288694-2011-08-13"
                   start="2011-08-13T16:10:00-0400"
                   title="TEX @ OAK"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/texoak_288694_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288685-2011-08-13" start="2011-08-13T19:05:00-0400"
            id="2011/08/13/detmlb-balmlb-1"
            venue="Oriole Park at Camden Yards"
            game_pk="288685"
            time_zone="ET"
            ampm="PM"
            away_time="7:05"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="7:05"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:05"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:05"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="2"
            scheduled_innings="9"
            description=""
            away_name_abbrev="DET"
            home_name_abbrev="BAL"
            away_code="det"
            away_file_code="det"
            away_team_id="116"
            away_team_city="Detroit"
            away_team_name="Tigers"
            away_division="C"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="bal"
            home_file_code="bal"
            home_team_id="110"
            home_team_city="Baltimore"
            home_team_name="Orioles"
            home_division="E"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="-"
            home_games_back="27.5"
            away_games_back_wildcard=""
            home_games_back_wildcard="26.5"
            venue_w_chan_loc="USMD0018"
            gameday="2011_08_13_detmlb_balmlb_1"
            away_win="64"
            away_loss="55"
            home_win="45"
            home_loss="72"
            league="AA"
            time="7:05"
            top_inning="N"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="6"
            home_team_runs="5"
            away_team_hits="9"
            home_team_hits="8"
            away_team_errors="1"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288685-2011-08-13"
                   start="2011-08-13T19:05:00-0400"
                   title="DET @ BAL"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/detbal_288685_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288688-2011-08-13" start="2011-08-13T19:05:00-0400"
            id="2011/08/13/minmlb-clemlb-1"
            venue="Progressive Field"
            game_pk="288688"
            time_zone="ET"
            ampm="PM"
            away_time="6:05"
            away_time_zone="CT"
            away_ampm="PM"
            home_time="7:05"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:05"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:05"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="5"
            scheduled_innings="9"
            description=""
            away_name_abbrev="MIN"
            home_name_abbrev="CLE"
            away_code="min"
            away_file_code="min"
            away_team_id="142"
            away_team_city="Minnesota"
            away_team_name="Twins"
            away_division="C"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="cle"
            home_file_code="cle"
            home_team_id="114"
            home_team_city="Cleveland"
            home_team_name="Indians"
            home_division="C"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="12.0"
            home_games_back="3.0"
            away_games_back_wildcard="20.5"
            home_games_back_wildcard="11.5"
            venue_w_chan_loc="USOH0195"
            gameday="2011_08_13_minmlb_clemlb_1"
            away_win="52"
            away_loss="67"
            home_win="60"
            home_loss="57"
            league="AA"
            time="7:05"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="1"
            home_team_runs="3"
            away_team_hits="5"
            home_team_hits="10"
            away_team_errors="1"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288688-2011-08-13"
                   start="2011-08-13T19:05:00-0400"
                   title="MIN @ CLE"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/mincle_288688_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288695-2011-08-13" start="2011-08-13T19:05:00-0400"
            id="2011/08/13/wasmlb-phimlb-1"
            venue="Citizens Bank Park"
            game_pk="288695"
            time_zone="ET"
            ampm="PM"
            away_time="7:05"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="7:05"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:05"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:05"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="2681"
            scheduled_innings="9"
            description=""
            away_name_abbrev="WSH"
            home_name_abbrev="PHI"
            away_code="was"
            away_file_code="was"
            away_team_id="120"
            away_team_city="Washington"
            away_team_name="Nationals"
            away_division="E"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="phi"
            home_file_code="phi"
            home_team_id="143"
            home_team_city="Philadelphia"
            home_team_name="Phillies"
            home_division="E"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="21.0"
            home_games_back="-"
            away_games_back_wildcard="12.5"
            home_games_back_wildcard=""
            venue_w_chan_loc="USPA1276"
            gameday="2011_08_13_wasmlb_phimlb_1"
            away_win="57"
            away_loss="62"
            home_win="78"
            home_loss="41"
            league="NN"
            time="7:05"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="3"
            home_team_runs="11"
            away_team_hits="7"
            home_team_hits="9"
            away_team_errors="3"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288695-2011-08-13"
                   start="2011-08-13T19:05:00-0400"
                   title="WSH @ PHI"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/wasphi_288695_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288683-2011-08-13" start="2011-08-13T19:10:00-0400"
            id="2011/08/13/chnmlb-atlmlb-1"
            venue="Turner Field"
            game_pk="288683"
            time_zone="ET"
            ampm="PM"
            away_time="6:10"
            away_time_zone="CT"
            away_ampm="PM"
            home_time="7:10"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="16"
            scheduled_innings="9"
            description=""
            away_name_abbrev="CHC"
            home_name_abbrev="ATL"
            away_code="chn"
            away_file_code="chc"
            away_team_id="112"
            away_team_city="Chi Cubs"
            away_team_name="Cubs"
            away_division="C"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="atl"
            home_file_code="atl"
            home_team_id="144"
            home_team_city="Atlanta"
            home_team_name="Braves"
            home_division="E"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="17.0"
            home_games_back="8.5"
            away_games_back_wildcard="18.0"
            home_games_back_wildcard="-"
            venue_w_chan_loc="USGA0028"
            gameday="2011_08_13_chnmlb_atlmlb_1"
            away_win="52"
            away_loss="68"
            home_win="70"
            home_loss="50"
            league="NN"
            time="7:10"
            top_inning="N"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="8"
            home_team_runs="4"
            away_team_hits="14"
            home_team_hits="12"
            away_team_errors="1"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288683-2011-08-13"
                   start="2011-08-13T19:10:00-0400"
                   title="CHC @ ATL"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/chnatl_288683_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288687-2011-08-13" start="2011-08-13T19:10:00-0400"
            id="2011/08/13/kcamlb-chamlb-1"
            venue="U.S. Cellular Field"
            game_pk="288687"
            time_zone="ET"
            ampm="PM"
            away_time="6:10"
            away_time_zone="CT"
            away_ampm="PM"
            home_time="6:10"
            home_time_zone="CT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="4"
            scheduled_innings="9"
            description=""
            away_name_abbrev="KC"
            home_name_abbrev="CWS"
            away_code="kca"
            away_file_code="kc"
            away_team_id="118"
            away_team_city="Kansas City"
            away_team_name="Royals"
            away_division="C"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="cha"
            home_file_code="cws"
            home_team_id="145"
            home_team_city="Chi White Sox"
            home_team_name="White Sox"
            home_division="C"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="14.5"
            home_games_back="5.0"
            away_games_back_wildcard="23.0"
            home_games_back_wildcard="13.5"
            venue_w_chan_loc="USIL0225"
            gameday="2011_08_13_kcamlb_chamlb_1"
            away_win="50"
            away_loss="70"
            home_win="59"
            home_loss="60"
            league="AA"
            time="7:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="4"
            home_team_runs="5"
            away_team_hits="11"
            home_team_hits="9"
            away_team_errors="1"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288687-2011-08-13"
                   start="2011-08-13T19:10:00-0400"
                   title="KC @ CWS"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/kcacha_288687_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288691-2011-08-13" start="2011-08-13T19:10:00-0400"
            id="2011/08/13/sdnmlb-cinmlb-1"
            venue="Great American Ball Park"
            game_pk="288691"
            time_zone="ET"
            ampm="PM"
            away_time="4:10"
            away_time_zone="PT"
            away_ampm="PM"
            home_time="7:10"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="2602"
            scheduled_innings="9"
            description=""
            away_name_abbrev="SD"
            home_name_abbrev="CIN"
            away_code="sdn"
            away_file_code="sd"
            away_team_id="135"
            away_team_city="San Diego"
            away_team_name="Padres"
            away_division="W"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="cin"
            home_file_code="cin"
            home_team_id="113"
            home_team_city="Cincinnati"
            home_team_name="Reds"
            home_division="C"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="14.5"
            home_games_back="10.0"
            away_games_back_wildcard="17.5"
            home_games_back_wildcard="11.0"
            venue_w_chan_loc="USOH0188"
            gameday="2011_08_13_sdnmlb_cinmlb_1"
            away_win="53"
            away_loss="68"
            home_win="59"
            home_loss="61"
            league="NN"
            time="7:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="1"
            home_team_runs="13"
            away_team_hits="7"
            home_team_hits="13"
            away_team_errors="0"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288691-2011-08-13"
                   start="2011-08-13T19:10:00-0400"
                   title="SD @ CIN"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/sdncin_288691_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288692-2011-08-13" start="2011-08-13T19:10:00-0400"
            id="2011/08/13/sfnmlb-flomlb-1"
            venue="Sun Life Stadium"
            game_pk="288692"
            time_zone="ET"
            ampm="PM"
            away_time="4:10"
            away_time_zone="PT"
            away_ampm="PM"
            home_time="7:10"
            home_time_zone="ET"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="20"
            scheduled_innings="9"
            description=""
            away_name_abbrev="SF"
            home_name_abbrev="FLA"
            away_code="sfn"
            away_file_code="sf"
            away_team_id="137"
            away_team_city="San Francisco"
            away_team_name="Giants"
            away_division="W"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="flo"
            home_file_code="fla"
            home_team_id="146"
            home_team_city="Florida"
            home_team_name="Marlins"
            home_division="E"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="2.0"
            home_games_back="22.0"
            away_games_back_wildcard="5.0"
            home_games_back_wildcard="13.5"
            venue_w_chan_loc="USFL0316"
            gameday="2011_08_13_sfnmlb_flomlb_1"
            away_win="65"
            away_loss="55"
            home_win="56"
            home_loss="63"
            league="NN"
            time="7:10"
            top_inning="N"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="3"
            home_team_runs="0"
            away_team_hits="6"
            home_team_hits="3"
            away_team_errors="0"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288692-2011-08-13"
                   start="2011-08-13T19:10:00-0400"
                   title="SF @ FLA"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/sfnflo_288692_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288684-2011-08-13" start="2011-08-13T19:15:00-0400"
            id="2011/08/13/colmlb-slnmlb-1"
            venue="Busch Stadium"
            game_pk="288684"
            time_zone="ET"
            ampm="PM"
            away_time="5:15"
            away_time_zone="MT"
            away_ampm="PM"
            home_time="6:15"
            home_time_zone="CT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="7:15"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="7:15"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="2889"
            scheduled_innings="9"
            description=""
            away_name_abbrev="COL"
            home_name_abbrev="STL"
            away_code="col"
            away_file_code="col"
            away_team_id="115"
            away_team_city="Colorado"
            away_team_name="Rockies"
            away_division="W"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="sln"
            home_file_code="stl"
            home_team_id="138"
            home_team_city="St. Louis"
            home_team_name="Cardinals"
            home_division="C"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="11.5"
            home_games_back="5.0"
            away_games_back_wildcard="14.5"
            home_games_back_wildcard="6.0"
            venue_w_chan_loc="USMO0787"
            gameday="2011_08_13_colmlb_slnmlb_1"
            away_win="56"
            away_loss="65"
            home_win="64"
            home_loss="56"
            league="NN"
            time="7:15"
            top_inning="N"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="6"
            home_team_runs="1"
            away_team_hits="9"
            home_team_hits="6"
            away_team_errors="0"
            home_team_errors="0">
        <game_media>
            <media type="game" calendar_event_id="14-288684-2011-08-13"
                   start="2011-08-13T19:15:00-0400"
                   title="COL @ STL"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/colsln_288684_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288689-2011-08-13" start="2011-08-13T20:10:00-0400"
            id="2011/08/13/nynmlb-arimlb-1"
            venue="Chase Field"
            game_pk="288689"
            time_zone="ET"
            ampm="PM"
            away_time="8:10"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="5:10"
            home_time_zone="MST"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="8:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="8:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="15"
            scheduled_innings="9"
            description=""
            away_name_abbrev="NYM"
            home_name_abbrev="ARI"
            away_code="nyn"
            away_file_code="nym"
            away_team_id="121"
            away_team_city="NY Mets"
            away_team_name="Mets"
            away_division="E"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="ari"
            home_file_code="ari"
            home_team_id="109"
            home_team_city="Arizona"
            home_team_name="D-backs"
            home_division="W"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="20.0"
            home_games_back="-"
            away_games_back_wildcard="11.5"
            home_games_back_wildcard=""
            venue_w_chan_loc="USAZ0166"
            gameday="2011_08_13_nynmlb_arimlb_1"
            away_win="58"
            away_loss="61"
            home_win="67"
            home_loss="53"
            league="NN"
            time="8:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="4"
            home_team_runs="6"
            away_team_hits="8"
            home_team_hits="7"
            away_team_errors="1"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288689-2011-08-13"
                   start="2011-08-13T20:10:00-0400"
                   title="NYM @ ARI"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/nynari_288689_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288682-2011-08-13" start="2011-08-13T22:10:00-0400"
            id="2011/08/13/bosmlb-seamlb-1"
            venue="Safeco Field"
            game_pk="288682"
            time_zone="ET"
            ampm="PM"
            away_time="10:10"
            away_time_zone="ET"
            away_ampm="PM"
            home_time="7:10"
            home_time_zone="PT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="10:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="10:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="680"
            scheduled_innings="9"
            description=""
            away_name_abbrev="BOS"
            home_name_abbrev="SEA"
            away_code="bos"
            away_file_code="bos"
            away_team_id="111"
            away_team_city="Boston"
            away_team_name="Red Sox"
            away_division="E"
            away_league_id="103"
            away_sport_code="mlb"
            home_code="sea"
            home_file_code="sea"
            home_team_id="136"
            home_team_city="Seattle"
            home_team_name="Mariners"
            home_division="W"
            home_league_id="103"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="-"
            home_games_back="16.0"
            away_games_back_wildcard=""
            home_games_back_wildcard="21.0"
            venue_w_chan_loc="USWA0395"
            gameday="2011_08_13_bosmlb_seamlb_1"
            away_win="73"
            away_loss="45"
            home_win="51"
            home_loss="67"
            league="AA"
            time="10:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="4"
            home_team_runs="5"
            away_team_hits="10"
            home_team_hits="9"
            away_team_errors="0"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288682-2011-08-13"
                   start="2011-08-13T22:10:00-0400"
                   title="BOS @ SEA"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/bossea_288682_preview.jpg"/>
        </game_media>
      </game>
      <game calendar_event_id="14-288686-2011-08-13" start="2011-08-13T22:10:00-0400"
            id="2011/08/13/houmlb-lanmlb-1"
            venue="Dodger Stadium"
            game_pk="288686"
            time_zone="ET"
            ampm="PM"
            away_time="9:10"
            away_time_zone="CT"
            away_ampm="PM"
            home_time="7:10"
            home_time_zone="PT"
            home_ampm="PM"
            game_type="R"
            resume_date=""
            time_aw_lg="10:10"
            aw_lg_ampm="PM"
            tz_aw_lg_gen="ET"
            time_hm_lg="10:10"
            hm_lg_ampm="PM"
            tz_hm_lg_gen="ET"
            venue_id="22"
            scheduled_innings="9"
            description=""
            away_name_abbrev="HOU"
            home_name_abbrev="LAD"
            away_code="hou"
            away_file_code="hou"
            away_team_id="117"
            away_team_city="Houston"
            away_team_name="Astros"
            away_division="C"
            away_league_id="104"
            away_sport_code="mlb"
            home_code="lan"
            home_file_code="la"
            home_team_id="119"
            home_team_city="LA Dodgers"
            home_team_name="Dodgers"
            home_division="W"
            home_league_id="104"
            home_sport_code="mlb"
            day="SAT"
            gameday_sw="P"
            away_games_back="31.0"
            home_games_back="12.0"
            away_games_back_wildcard="32.0"
            home_games_back_wildcard="15.0"
            venue_w_chan_loc="USCA0638"
            gameday="2011_08_13_houmlb_lanmlb_1"
            away_win="38"
            away_loss="82"
            home_win="54"
            home_loss="64"
            league="NN"
            time="10:10"
            top_inning="Y"
            status="Final"
            ind="F"
            inning="9"
            outs="3"
            away_team_runs="1"
            home_team_runs="6"
            away_team_hits="6"
            home_team_hits="9"
            away_team_errors="3"
            home_team_errors="1">
        <game_media>
            <media type="game" calendar_event_id="14-288686-2011-08-13"
                   start="2011-08-13T22:10:00-0400"
                   title="HOU @ LAD"
                   has_mlbtv="true"
                   free="NO"
                   media_state="media_archive"
                   thumbnail="http://mediadownloads.mlb.com/mlbam/preview/houlan_288686_preview.jpg"/>
        </game_media>
      </game>
    </epg>
  }

  def fetchGame(date: Date, team: String, gid: String = null): Elem = {
    <game type="R" local_game_time="19:10" game_pk="288682" game_time_et="10:10 PM" gameday_sw="P">
        <team type="home" code="sea" file_code="sea" abbrev="SEA" id="136" name="Seattle" name_full="Seattle Mariners" name_brief="Mariners" w="51" l="67" division_id="200" league_id="103" league="AL"/>
        <team type="away" code="bos" file_code="bos" abbrev="BOS" id="111" name="Boston" name_full="Boston Red Sox" name_brief="Red Sox" w="73" l="45" division_id="201" league_id="103" league="AL"/>
        <stadium id="680" name="Safeco Field" venue_w_chan_loc="USWA0395" location="Seattle, WA"/>
    </game>
  }

  def fetchBoxScore(date: Date, team: String, gid: String = null): Elem = {
    <boxscore game_id="2011/08/13/bosmlb-seamlb-1" game_pk="288682" venue_id="680" venue_name="Safeco Field" home_sport_code="mlb" away_team_code="bos" home_team_code="sea" away_id="111" home_id="136" away_fname="Boston Red Sox" home_fname="Seattle Mariners" away_sname="Boston" home_sname="Seattle" date="August 13, 2011" away_wins="73" away_loss="45" home_wins="51" home_loss="67" status_ind="F">
      <linescore away_team_runs="4" home_team_runs="5" away_team_hits="10" home_team_hits="9" away_team_errors="0" home_team_errors="1">
          <inning_line_score away="0" home="5" inning="1"/>
          <inning_line_score away="0" home="0" inning="2"/>
          <inning_line_score away="0" home="0" inning="3"/>
          <inning_line_score away="0" home="0" inning="4"/>
          <inning_line_score away="0" home="0" inning="5"/>
          <inning_line_score away="4" home="0" inning="6"/>
          <inning_line_score away="0" home="0" inning="7"/>
          <inning_line_score away="0" home="0" inning="8"/>
          <inning_line_score away="0" home="x" inning="9"/>
      </linescore>
      <pitching team_flag="away" out="24" h="9" r="5" er="5" bb="1" so="12" hr="2" bf="33" era="3.93">
          <pitcher id="277417" name="Beckett" name_display_first_last="Josh Beckett" pos="P" out="15" bf="23" er="5" r="5" h="8" so="6" hr="2" bb="1" w="9" l="5" sv="0" bs="0" hld="0" era="2.40" note="(L, 9-5)"/>
          <pitcher id="458006" name="Albers" name_display_first_last="Matt Albers" pos="P" out="5" bf="6" er="0" r="0" h="1" so="3" hr="0" bb="0" w="4" l="3" sv="0" bs="2" hld="8" era="2.37"/>
          <pitcher id="462985" name="Morales, F" name_display_first_last="Franklin Morales" pos="P" out="2" bf="2" er="0" r="0" h="0" so="1" hr="0" bb="0" w="0" l="2" sv="0" bs="0" hld="6" era="4.13"/>
          <pitcher id="469686" name="Aceves" name_display_first_last="Alfredo Aceves" pos="P" out="2" bf="2" er="0" r="0" h="0" so="2" hr="0" bb="0" w="8" l="1" sv="1" bs="2" hld="7" era="3.26"/>
      </pitching>
      <batting team_flag="home" ab="32" r="5" h="9" d="2" t="0" hr="2" rbi="5" bb="1" po="27" da="13" so="12" lob="11" avg=".230">
          <batter id="400085" name="Suzuki, I" name_display_first_last="Ichiro Suzuki" pos="RF" bo="100" ab="4" po="1" r="1" a="1" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="2" hr="1" rbi="1" lob="2" fldg="1.000" sb="0" s_hr="2" s_rbi="28" avg=".267"/>
          <batter id="429711" name="Gutierrez, F" name_display_first_last="Franklin Gutierrez" pos="CF" bo="200" ab="4" po="2" r="1" a="0" bb="0" sac="0" t="0" sf="0" h="2" e="0" d="0" hbp="0" so="1" hr="0" rbi="0" lob="0" fldg="1.000" sb="1" s_hr="1" s_rbi="11" avg=".221"/>
          <batter id="554429" name="Ackley" name_display_first_last="Dustin Ackley" pos="2B" bo="300" ab="4" po="3" r="1" a="3" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="1" hbp="0" so="2" hr="0" rbi="0" lob="2" fldg="1.000" sb="0" s_hr="5" s_rbi="24" avg=".297"/>
          <batter id="455077" name="Carp" name_display_first_last="Mike Carp" pos="1B" bo="400" ab="3" po="7" r="1" a="3" bb="1" sac="0" t="0" sf="0" h="1" e="1" d="0" hbp="0" so="1" hr="0" rbi="2" lob="0" fldg=".909" sb="0" s_hr="4" s_rbi="23" avg=".323"/>
          <batter id="276377" name="Pena" name_display_first_last="Wily Mo Pena" pos="DH" bo="500" ab="4" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="2" hr="0" rbi="0" lob="4" fldg=".000" sb="0" s_hr="5" s_rbi="7" avg=".180"/>
          <batter id="489413" name="Wells, C" name_display_first_last="Casper Wells" pos="LF" bo="600" ab="4" po="2" r="1" a="0" bb="0" sac="0" t="0" sf="0" h="2" e="0" d="0" hbp="0" so="2" hr="1" rbi="2" lob="0" fldg="1.000" sb="0" s_hr="6" s_rbi="20" avg=".274"/>
          <batter id="408036" name="Bard" name_display_first_last="Josh Bard" pos="C" bo="700" ab="3" po="5" r="0" a="1" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="1" hr="0" rbi="0" lob="1" fldg="1.000" sb="0" s_hr="1" s_rbi="6" avg=".212"/>
          <batter id="425904" name="Rodriguez, L" name_display_first_last="Luis Rodriguez" pos="3B" bo="800" ab="3" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="1" fldg=".000" sb="0" s_hr="1" s_rbi="11" avg=".171"/>
          <batter id="333292" name="Wilson, Ja" name_display_first_last="Jack Wilson" pos="SS" bo="900" ab="3" po="5" r="0" a="3" bb="0" sac="0" t="0" sf="0" h="2" e="0" d="1" hbp="0" so="1" hr="0" rbi="0" lob="1" fldg="1.000" sb="0" s_hr="0" s_rbi="9" avg=".244"/>
          <batter id="433587" name="Hernandez, F" name_display_first_last="Felix Hernandez" pos="P" ab="0" po="2" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg="1.000" sb="0" s_hr="0" s_rbi="0" avg=".143"/>
          <batter id="124604" name="Wright, J" name_display_first_last="Jamey Wright" pos="P" ab="0" po="0" r="0" a="1" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg="1.000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
          <batter id="434181" name="League" name_display_first_last="Brandon League" pos="P" ab="0" po="0" r="0" a="1" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg="1.000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
        <text_data><![CDATA[<b>BATTING</b><br/><b>2B</b>: Ackley (11, Beckett), Wilson, Ja (8, Beckett).<br/><b>HR</b>: Suzuki, I (2, 1st inning off Beckett, 0 on, 0 out), Wells, C (6, 1st inning off Beckett, 1 on, 1 out).<br/><b>TB</b>: Suzuki, I 4; Gutierrez, F 2; Ackley 2; Carp; Wells, C 5; Wilson, Ja 3.<br/><b>RBI</b>: Suzuki, I (28), Carp 2 (23), Wells, C 2 (20).<br/><b>Runners left in scoring position, 2 out</b>: Pena 2.<br/><b>GIDP</b>: Suzuki, I.<br/><b>Team RISP</b>: 2-for-5.<br/><b>Team LOB</b>: 4.<br/> <br/><b>BASERUNNING</b><br/><b>SB</b>: Gutierrez, F (11, 2nd base off Beckett/Varitek).<br/> <br/><b>FIELDING</b><br/><b>E</b>: Carp (4, pickoff).<br/><b>Outfield assists</b>: Suzuki, I (Ellsbury at home).<br/><b>DP</b>: 4 (Ackley-Wilson, Ja-Carp, Suzuki, I-Bard, Ackley-Carp, Wright, J-Wilson, Ja-Carp).<br/> <br/>]]></text_data>
      </batting>
      <pitching team_flag="home" out="27" h="10" r="4" er="4" bb="3" so="4" hr="2" bf="35" era="3.62">
          <pitcher id="433587" name="Hernandez, F" name_display_first_last="Felix Hernandez" pos="P" out="21" bf="29" er="4" r="4" h="9" so="2" hr="2" bb="2" w="11" l="10" sv="0" bs="0" hld="0" era="3.38" note="(W, 11-10)"/>
          <pitcher id="124604" name="Wright, J" name_display_first_last="Jamey Wright" pos="P" out="3" bf="3" er="0" r="0" h="1" so="0" hr="0" bb="1" w="2" l="3" sv="1" bs="4" hld="14" era="3.44" note="(H, 14)"/>
          <pitcher id="434181" name="League" name_display_first_last="Brandon League" pos="P" out="3" bf="3" er="0" r="0" h="0" so="2" hr="0" bb="0" w="1" l="4" sv="28" bs="4" hld="0" era="2.91" note="(S, 28)"/>
      </pitching>
      <batting team_flag="away" ab="32" r="4" h="10" d="0" t="1" hr="2" rbi="4" bb="3" po="24" da="6" so="4" lob="14" avg=".281">
          <batter id="453056" name="Ellsbury" name_display_first_last="Jacoby Ellsbury" pos="CF" bo="100" ab="3" po="3" r="1" a="0" bb="1" sac="0" t="0" sf="0" h="2" e="0" d="0" hbp="0" so="0" hr="1" rbi="2" lob="0" fldg="1.000" sb="0" s_hr="20" s_rbi="74" avg=".315"/>
          <batter id="408307" name="Crawford" name_display_first_last="Carl Crawford" pos="LF" bo="200" ab="4" po="1" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="1" fldg="1.000" sb="0" s_hr="7" s_rbi="38" avg=".257"/>
          <batter id="408236" name="Gonzalez, Ad" name_display_first_last="Adrian Gonzalez" pos="1B" bo="300" ab="4" po="5" r="1" a="2" bb="0" sac="0" t="0" sf="0" h="2" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="2" fldg="1.000" sb="0" s_hr="18" s_rbi="92" avg=".351"/>
          <batter id="456030" name="Pedroia" name_display_first_last="Dustin Pedroia" pos="2B" bo="400" ab="4" po="0" r="1" a="0" bb="0" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="0" hr="1" rbi="2" lob="3" fldg=".000" sb="0" s_hr="16" s_rbi="62" avg=".310"/>
          <batter id="120074" name="Ortiz" name_display_first_last="David Ortiz" pos="DH" bo="500" ab="2" po="0" r="0" a="0" bb="2" sac="0" t="0" sf="0" h="1" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="24" s_rbi="79" avg=".300"/>
          <batter id="150021" name="McDonald, D" name_display_first_last="Darnell McDonald" pos="PR-DH" bo="501" ab="0" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="4" s_rbi="15" avg=".182" note="1-"/>
          <batter id="502210" name="Reddick" name_display_first_last="Josh Reddick" pos="RF" bo="600" ab="4" po="1" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="2" hr="0" rbi="0" lob="2" fldg="1.000" sb="0" s_hr="6" s_rbi="25" avg=".314"/>
          <batter id="449107" name="Aviles" name_display_first_last="Mike Aviles" pos="3B" bo="700" ab="3" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="2" e="0" d="0" hbp="0" so="1" hr="0" rbi="0" lob="1" fldg=".000" sb="0" s_hr="5" s_rbi="32" avg=".238"/>
          <batter id="476704" name="Lowrie" name_display_first_last="Jed Lowrie" pos="PH" bo="701" ab="1" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="1" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="4" s_rbi="26" avg=".263" note="a-"/>
          <batter id="123660" name="Varitek" name_display_first_last="Jason Varitek" pos="C" bo="800" ab="4" po="12" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="4" fldg="1.000" sb="0" s_hr="7" s_rbi="23" avg=".224"/>
          <batter id="340192" name="Scutaro" name_display_first_last="Marco Scutaro" pos="SS" bo="900" ab="3" po="1" r="1" a="3" bb="0" sac="0" t="1" sf="0" h="1" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="1" fldg="1.000" sb="0" s_hr="5" s_rbi="26" avg=".279"/>
          <batter id="277417" name="Beckett" name_display_first_last="Josh Beckett" pos="P" ab="0" po="1" r="0" a="1" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg="1.000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
          <batter id="458006" name="Albers" name_display_first_last="Matt Albers" pos="P" ab="0" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
          <batter id="462985" name="Morales, F" name_display_first_last="Franklin Morales" pos="P" ab="0" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
          <batter id="469686" name="Aceves" name_display_first_last="Alfredo Aceves" pos="P" ab="0" po="0" r="0" a="0" bb="0" sac="0" t="0" sf="0" h="0" e="0" d="0" hbp="0" so="0" hr="0" rbi="0" lob="0" fldg=".000" sb="0" s_hr="0" s_rbi="0" avg=".000"/>
        <note><![CDATA[a-Struck out for Aviles in the 9th. <br/>1-Ran for Ortiz in the 8th.]]></note>
        <text_data><![CDATA[<b>BATTING</b><br/><b>3B</b>: Scutaro (1, Hernandez, F).<br/><b>HR</b>: Ellsbury (20, 6th inning off Hernandez, F, 1 on, 0 out), Pedroia (16, 6th inning off Hernandez, F, 1 on, 1 out).<br/><b>TB</b>: Ellsbury 5; Crawford; Gonzalez, Ad 2; Pedroia 4; Ortiz; Aviles 2; Scutaro 3.<br/><b>RBI</b>: Ellsbury 2 (74), Pedroia 2 (62).<br/><b>Runners left in scoring position, 2 out</b>: Varitek.<br/><b>GIDP</b>: Scutaro; Crawford; Pedroia.<br/><b>Team RISP</b>: 2-for-5.<br/><b>Team LOB</b>: 4.<br/> <br/><b>BASERUNNING</b><br/><b>CS</b>: McDonald, D (3, 2nd base by Wright, J/Bard).<br/> <br/><b>FIELDING</b><br/><b>DP</b>: (Gonzalez, Ad-Scutaro-Gonzalez, Ad).<br/> <br/>]]></text_data>
      </batting>
      <game_info><![CDATA[<b>Pitches-strikes</b>: Beckett 99-63, Albers 26-18, Morales, F 6-5, Aceves 10-7, Hernandez, F 107-73, Wright, J 18-8, League 14-9.<br/><b>Groundouts-flyouts</b>: Beckett 6-2, Albers 0-2, Morales, F 0-1, Aceves 0-0, Hernandez, F 7-4, Wright, J 1-0, League 1-0.<br/><b>Batters faced</b>: Beckett 23, Albers 6, Morales, F 2, Aceves 2, Hernandez, F 29, Wright, J 3, League 3.<br/><b>Ejections</b>: Boston Red Sox Manager Terry Francona ejected by HP umpire Mark Ripperger (4th).<br/><b>Umpires</b>: HP: Mark Ripperger. 1B: Brian O'Nora. 2B: Alfonso Marquez. 3B: Ed Hickox.<br/><b>Weather</b>: 68 degrees, partly cloudy.<br/><b>Wind</b>: 4 mph, Out to CF.<br/><b>T</b>: 3:03.<br/><b>Att</b>: 41,326.<br/>]]></game_info>
    </boxscore>
  }

  def fetchLineScore(date: Date, team: String, gid: String = null): Elem = {
    <game id="2011/08/13/bosmlb-seamlb-1" venue="Safeco Field" game_pk="288682"
          time="10:10"
          time_zone="ET"
          ampm="PM"
          away_time="10:10"
          away_time_zone="ET"
          away_ampm="PM"
          home_time="7:10"
          home_time_zone="PT"
          home_ampm="PM"
          game_type="R"
          time_aw_lg="10:10"
          aw_lg_ampm="PM"
          tz_aw_lg_gen="ET"
          time_hm_lg="10:10"
          hm_lg_ampm="PM"
          tz_hm_lg_gen="ET"
          venue_id="680"
          scheduled_innings="9"
          away_name_abbrev="BOS"
          home_name_abbrev="SEA"
          away_code="bos"
          away_file_code="bos"
          away_team_id="111"
          away_team_city="Boston"
          away_team_name="Red Sox"
          away_division="E"
          away_league_id="103"
          away_sport_code="mlb"
          home_code="sea"
          home_file_code="sea"
          home_team_id="136"
          home_team_city="Seattle"
          home_team_name="Mariners"
          home_division="W"
          home_league_id="103"
          home_sport_code="mlb"
          day="SAT"
          gameday_sw="P"
          away_games_back="-"
          home_games_back="16.0"
          home_games_back_wildcard="21.0"
          venue_w_chan_loc="USWA0395"
          gameday_link="2011_08_13_bosmlb_seamlb_1"
          away_win="73"
          away_loss="45"
          home_win="51"
          home_loss="67"
          league="AA"
          top_inning="Y"
          inning_state=""
          status="Final"
          ind="F"
          inning="9"
          outs="3"
          away_team_runs="4"
          home_team_runs="5"
          away_team_hits="10"
          home_team_hits="9"
          away_team_errors="0"
          home_team_errors="1"
          wrapup_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=wrap&amp;c_id=mlb"
    home_preview_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
    away_preview_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
    preview="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=preview&amp;c_id=mlb"
    tv_station="ROOT SPORTS"
    home_recap_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=recap&amp;c_id=sea"
    away_recap_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=recap&amp;c_id=bos"
    photos_link="/mlb/gameday/index.jsp?gid=2011_08_13_bosmlb_seamlb_1&amp;mode=photos">
      <linescore inning="1" home_inning_runs="5" away_inning_runs="0"/>
        <linescore inning="2" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="3" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="4" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="5" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="6" home_inning_runs="0" away_inning_runs="4"/>
        <linescore inning="7" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="8" home_inning_runs="0" away_inning_runs="0"/>
        <linescore inning="9" home_inning_runs="" away_inning_runs="0"/>
        <winning_pitcher first_name="Felix" first="Felix" id="433587" last_name="Hernandez"
                         last="Hernandez"
                         name_display_roster="Hernandez, F"
                         wins="11"
                         losses="10"
                         era="3.38"
                         s_wins=""
                         s_losses=""
                         s_era=""/>
        <losing_pitcher first_name="Josh" first="Josh" id="277417" last_name="Beckett" last="Beckett"
                        name_display_roster="Beckett"
                        wins="9"
                        losses="5"
                        era="2.40"
                        s_wins=""
                        s_losses=""
                        s_era=""/>
        <save_pitcher first_name="Brandon" first="Brandon" id="434181" last_name="League"
                      last="League"
                      name_display_roster="League"
                      wins="1"
                      losses="4"
                      era="2.91"
                      s_wins=""
                      s_losses=""
                      s_era=""
                      saves="28"/>
      <game_media>
          <media type="game" calendar_event_id="14-288682-2011-08-13"
                 start="2011-08-13T22:10:00-0400"
                 title="BOS @ SEA"
                 has_mlbtv="true"
                 free="NO"
                 media_state="media_archive"
                 thumbnail="http://mediadownloads.mlb.com/mlbam/preview/bossea_288682_preview.jpg"/>
      </game_media>
    </game>
  }

  def fetchHitChart(date: Date, team: String, gid: String = null): Elem = {
    <hitchart>
        <hip des="Pop Out" x="108.43" y="146.59" batter="453056" pitcher="433587" type="O" team="A" inning="1"/>
        <hip des="Groundout" x="135.54" y="161.65" batter="408307" pitcher="433587" type="O" team="A" inning="1"/>
        <hip des="Lineout" x="112.45" y="85.34" batter="408236" pitcher="433587" type="O" team="A" inning="1"/>
        <hip des="Home Run" x="224.90" y="90.36" batter="400085" pitcher="277417" type="H" team="H" inning="1"/>
        <hip des="Single" x="109.44" y="95.38" batter="429711" pitcher="277417" type="H" team="H" inning="1"/>
        <hip des="Double" x="199.80" y="80.32" batter="554429" pitcher="277417" type="H" team="H" inning="1"/>
        <hip des="Single" x="140.56" y="99.40" batter="455077" pitcher="277417" type="H" team="H" inning="1"/>
        <hip des="Flyout" x="114.46" y="91.37" batter="276377" pitcher="277417" type="O" team="H" inning="1"/>
        <hip des="Home Run" x="74.30" y="32.13" batter="489413" pitcher="277417" type="H" team="H" inning="1"/>
        <hip des="Groundout" x="130.52" y="187.75" batter="425904" pitcher="277417" type="O" team="H" inning="1"/>
        <hip des="Pop Out" x="156.63" y="186.75" batter="456030" pitcher="433587" type="O" team="A" inning="2"/>
        <hip des="Flyout" x="70.28" y="137.55" batter="120074" pitcher="433587" type="O" team="A" inning="2"/>
        <hip des="Groundout" x="121.49" y="151.61" batter="502210" pitcher="433587" type="O" team="A" inning="2"/>
        <hip des="Single" x="157.63" y="116.47" batter="333292" pitcher="277417" type="H" team="H" inning="2"/>
        <hip des="Groundout" x="143.57" y="174.70" batter="400085" pitcher="277417" type="O" team="H" inning="2"/>
        <hip des="Groundout" x="111.45" y="164.66" batter="429711" pitcher="277417" type="O" team="H" inning="2"/>
        <hip des="Single" x="113.45" y="186.75" batter="449107" pitcher="433587" type="H" team="A" inning="3"/>
        <hip des="Groundout" x="145.58" y="173.69" batter="123660" pitcher="433587" type="O" team="A" inning="3"/>
        <hip des="Groundout" x="132.53" y="156.63" batter="340192" pitcher="433587" type="O" team="A" inning="3"/>
        <hip des="Groundout" x="149.60" y="161.65" batter="554429" pitcher="277417" type="O" team="H" inning="3"/>
        <hip des="Groundout" x="101.41" y="154.62" batter="276377" pitcher="277417" type="O" team="H" inning="3"/>
        <hip des="Single" x="121.49" y="170.68" batter="408307" pitcher="433587" type="H" team="A" inning="4"/>
        <hip des="Groundout" x="138.55" y="185.74" batter="408236" pitcher="433587" type="O" team="A" inning="4"/>
        <hip des="Flyout" x="167.67" y="113.45" batter="456030" pitcher="433587" type="O" team="A" inning="4"/>
        <hip des="Flyout" x="161.65" y="90.36" batter="408036" pitcher="277417" type="O" team="H" inning="4"/>
        <hip des="Groundout" x="147.59" y="165.66" batter="425904" pitcher="277417" type="O" team="H" inning="4"/>
        <hip des="Flyout" x="81.33" y="103.41" batter="502210" pitcher="433587" type="O" team="A" inning="5"/>
        <hip des="Groundout" x="138.55" y="172.69" batter="123660" pitcher="433587" type="O" team="A" inning="5"/>
        <hip des="Double" x="59.24" y="136.55" batter="333292" pitcher="277417" type="H" team="H" inning="5"/>
        <hip des="Single" x="104.42" y="171.69" batter="429711" pitcher="277417" type="H" team="H" inning="5"/>
        <hip des="Triple" x="79.32" y="45.18" batter="340192" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Home Run" x="203.82" y="56.22" batter="453056" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Flyout" x="99.40" y="61.24" batter="408307" pitcher="433587" type="O" team="A" inning="6"/>
        <hip des="Single" x="103.41" y="170.68" batter="408236" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Home Run" x="171.69" y="35.14" batter="456030" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Single" x="170.68" y="99.40" batter="120074" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Single" x="91.37" y="105.42" batter="449107" pitcher="433587" type="H" team="A" inning="6"/>
        <hip des="Lineout" x="139.56" y="155.62" batter="123660" pitcher="433587" type="O" team="A" inning="6"/>
        <hip des="Single" x="107.43" y="167.67" batter="489413" pitcher="458006" type="H" team="H" inning="6"/>
        <hip des="Flyout" x="82.33" y="104.42" batter="408036" pitcher="458006" type="O" team="H" inning="6"/>
        <hip des="Flyout" x="128.51" y="109.44" batter="425904" pitcher="458006" type="O" team="H" inning="6"/>
        <hip des="Pop Out" x="136.55" y="152.61" batter="340192" pitcher="433587" type="O" team="A" inning="7"/>
        <hip des="Single" x="97.39" y="88.35" batter="453056" pitcher="433587" type="H" team="A" inning="7"/>
        <hip des="Groundout" x="127.51" y="155.62" batter="408307" pitcher="433587" type="O" team="A" inning="7"/>
        <hip des="Single" x="142.57" y="85.34" batter="408236" pitcher="124604" type="H" team="A" inning="8"/>
        <hip des="Groundout" x="126.51" y="180.72" batter="456030" pitcher="124604" type="O" team="A" inning="8"/>
        <hip des="Flyout" x="101.41" y="96.39" batter="455077" pitcher="462985" type="O" team="H" inning="8"/>
        <hip des="Groundout" x="129.52" y="182.73" batter="123660" pitcher="434181" type="O" team="A" inning="9"/>
    </hitchart>
  }

  def fetchInnings(date: Date, team: String, gid: String = null): Elem = {
    <game atBat="123660" deck="340192" hole="453056" ind="F">
      <inning num="1" away_team="bos" home_team="sea" next="Y">
        <top>
          <atbat num="1" b="1" s="2" o="1" start_tfs="220954" start_tfs_zulu="2011-08-14T02:09:54Z" batter="453056" stand="L" b_height="6-1" pitcher="433587" p_throws="R" des="Jacoby Ellsbury pops out to shortstop Jack Wilson. " event="Pop Out">
              <pitch des="Ball" id="3" type="B" tfs="221017" tfs_zulu="2011-08-14T02:10:17Z" x="108.15" y="121.75" sv_id="110813_191020"  end_speed="84.3" sz_top="3.19" sz_bot="1.52" pfx_x="-3.39" pfx_z="3.96" px="-0.311" pz="3.362" x0="-2.411" y0="50.0" z0="5.765" vx0="6.728" vy0="-134.21" vz0="-1.659" ax="-6.173" ay="29.604" az="-24.898" break_y="23.8" break_angle="10.6" break_length="5.7" pitch_type="FF" type_confidence=".901" zone="11"  spin_dir="220.310" spin_rate="1031.450" cc="" mt=""/>
              <pitch des="Foul" id="4" type="S" tfs="221031" tfs_zulu="2011-08-14T02:10:31Z" x="120.17" y="129.52" sv_id="110813_191033"  end_speed="84.8" sz_top="3.47" sz_bot="1.6" pfx_x="-7.88" pfx_z="2.42" px="-0.556" pz="3.024" x0="-2.51" y0="50.0" z0="5.741" vx0="7.955" vy0="-136.027" vz0="-2.096" ax="-14.599" ay="33.066" az="-27.619" break_y="23.7" break_angle="24.4" break_length="6.8" pitch_type="SI" type_confidence=".933" zone="1"  spin_dir="252.671" spin_rate="1631.070" cc="" mt=""/>
              <pitch des="Foul" id="5" type="S" tfs="221051" tfs_zulu="2011-08-14T02:10:51Z" x="84.98" y="140.74" sv_id="110813_191053"  end_speed="86.0" sz_top="3.47" sz_bot="1.6" pfx_x="-8.48" pfx_z="3.41" px="0.5" pz="2.848" x0="-1.938" y0="50.0" z0="5.671" vx0="9.553" vy0="-136.761" vz0="-2.864" ax="-16.047" ay="30.52" az="-25.654" break_y="23.8" break_angle="28.0" break_length="6.4" pitch_type="SI" type_confidence=".945" zone="3"  spin_dir="247.887" spin_rate="1837.438" cc="Felix Hernandez is trying to tie up Jacoby Ellsbury with fastballs inside, where Jacoby Ellsbury hits .371." mt=""/>
              <pitch des="In play, out(s)" id="6" type="X" tfs="221112" tfs_zulu="2011-08-14T02:11:12Z" x="84.12" y="144.20" sv_id="110813_191115"  end_speed="81.6" sz_top="3.47" sz_bot="1.6" pfx_x="2.98" pfx_z="-5.24" px="0.387" pz="2.629" x0="-2.316" y0="50.0" z0="5.914" vx0="5.869" vy0="-127.927" vz0="-0.267" ax="4.978" ay="24.333" az="-40.853" break_y="23.9" break_angle="-8.3" break_length="10.0" pitch_type="SL" type_confidence=".901" zone="6"  spin_dir="29.836" spin_rate="1134.669" cc="" mt=""/>
          </atbat>
          <atbat num="2" b="1" s="1" o="2" start_tfs="221134" start_tfs_zulu="2011-08-14T02:11:34Z" batter="408307" stand="L" b_height="6-2" pitcher="433587" p_throws="R" des="Carl Crawford grounds out, second baseman Dustin Ackley to first baseman Mike Carp. " event="Groundout">
              <pitch des="Ball" id="10" type="B" tfs="221141" tfs_zulu="2011-08-14T02:11:41Z" x="164.81" y="132.11" sv_id="110813_191144"  end_speed="73.7" sz_top="3.47" sz_bot="1.52" pfx_x="7.17" pfx_z="-11.9" px="-1.863" pz="2.928" x0="-2.552" y0="50.0" z0="6.139" vx0="-0.555" vy0="-117.691" vz0="3.098" ax="9.895" ay="25.598" az="-48.531" break_y="23.8" break_angle="-11.5" break_length="14.4" pitch_type="CU" type_confidence=".893" zone="11"  spin_dir="31.170" spin_rate="2356.570" cc="" mt=""/>
              <pitch des="Called Strike" id="11" type="S" tfs="221152" tfs_zulu="2011-08-14T02:11:52Z" x="104.72" y="146.79" sv_id="110813_191155"  end_speed="82.6" sz_top="3.82" sz_bot="1.86" pfx_x="-6.47" pfx_z="1.08" px="-0.415" pz="2.553" x0="-2.205" y0="50.0" z0="5.919" vx0="6.796" vy0="-130.754" vz0="-2.845" ax="-11.222" ay="27.113" az="-30.227" break_y="23.8" break_angle="17.8" break_length="7.6" pitch_type="CH" type_confidence=".933" zone="4"  spin_dir="260.157" spin_rate="1263.740" cc="" mt=""/>
              <pitch des="In play, out(s)" id="12" type="X" tfs="221204" tfs_zulu="2011-08-14T02:12:04Z" x="120.17" y="147.65" sv_id="110813_191206"  end_speed="87.0" sz_top="3.47" sz_bot="1.52" pfx_x="-8.01" pfx_z="2.25" px="-0.473" pz="2.498" x0="-1.884" y0="50.0" z0="5.783" vx0="6.705" vy0="-139.189" vz0="-3.931" ax="-15.57" ay="33.799" az="-27.719" break_y="23.8" break_angle="26.1" break_length="6.7" pitch_type="SI" type_confidence=".931" zone="4"  spin_dir="254.032" spin_rate="1688.003" cc="" mt=""/>
          </atbat>
          <atbat num="3" b="2" s="2" o="3" start_tfs="221227" start_tfs_zulu="2011-08-14T02:12:27Z" batter="408236" stand="L" b_height="6-2" pitcher="433587" p_throws="R" des="Adrian Gonzalez lines out to center fielder Franklin Gutierrez. " event="Lineout">
              <pitch des="Ball" id="16" type="B" tfs="221246" tfs_zulu="2011-08-14T02:12:46Z" x="139.06" y="115.70" sv_id="110813_191249"  end_speed="84.8" sz_top="3.57" sz_bot="1.74" pfx_x="-7.25" pfx_z="3.96" px="-1.336" pz="3.616" x0="-2.361" y0="50.0" z0="5.744" vx0="5.275" vy0="-136.944" vz0="-1.116" ax="-13.55" ay="34.769" az="-24.704" break_y="23.7" break_angle="26.1" break_length="6.1" pitch_type="SI" type_confidence=".886" zone="11"  spin_dir="241.132" spin_rate="1639.171" cc="" mt=""/>
              <pitch des="Foul" id="17" type="S" tfs="221300" tfs_zulu="2011-08-14T02:13:00Z" x="84.98" y="124.34" sv_id="110813_191303"  end_speed="85.8" sz_top="3.57" sz_bot="1.74" pfx_x="-6.74" pfx_z="3.42" px="0.375" pz="3.459" x0="-1.842" y0="50.0" z0="5.772" vx0="8.342" vy0="-136.997" vz0="-1.493" ax="-12.74" ay="31.718" az="-25.639" break_y="23.8" break_angle="22.7" break_length="6.1" pitch_type="SI" type_confidence=".899" zone="3"  spin_dir="242.844" spin_rate="1516.292" cc="Felix Hernandez is trying to tie up Adrian Gonzalez with fastballs inside, where Adrian Gonzalez hits .415." mt=""/>
              <pitch des="Ball" id="18" type="B" tfs="221323" tfs_zulu="2011-08-14T02:13:23Z" x="145.06" y="133.84" sv_id="110813_191326"  end_speed="86.9" sz_top="3.57" sz_bot="1.74" pfx_x="-2.94" pfx_z="3.38" px="-1.464" pz="2.749" x0="-2.447" y0="50.0" z0="5.687" vx0="3.727" vy0="-138.77" vz0="-3.358" ax="-5.693" ay="32.682" az="-25.549" break_y="23.8" break_angle="10.4" break_length="5.6" pitch_type="FF" type_confidence=".994" zone="11"  spin_dir="220.672" spin_rate="913.212" cc="" mt=""/>
              <pitch des="Foul" id="19" type="S" tfs="221338" tfs_zulu="2011-08-14T02:13:38Z" x="113.30" y="130.38" sv_id="110813_191340"  end_speed="84.9" sz_top="3.57" sz_bot="1.74" pfx_x="-8.13" pfx_z="2.59" px="-0.483" pz="3.036" x0="-2.39" y0="50.0" z0="5.707" vx0="7.947" vy0="-137.111" vz0="-2.097" ax="-15.184" ay="35.573" az="-27.269" break_y="23.7" break_angle="25.4" break_length="6.7" pitch_type="SI" type_confidence=".939" zone="1"  spin_dir="252.097" spin_rate="1688.380" cc="" mt=""/>
              <pitch des="In play, out(s)" id="20" type="X" tfs="221402" tfs_zulu="2011-08-14T02:14:02Z" x="101.29" y="154.56" sv_id="110813_191405"  end_speed="76.3" sz_top="3.57" sz_bot="1.74" pfx_x="5.96" pfx_z="-11.2" px="0.037" pz="2.039" x0="-2.129" y0="50.0" z0="5.996" vx0="3.323" vy0="-121.684" vz0="0.753" ax="8.782" ay="27.849" az="-48.588" break_y="23.8" break_angle="-11.0" break_length="13.6" pitch_type="CU" type_confidence=".892" zone="8"  spin_dir="28.147" spin_rate="2219.460" cc="" mt=""/>
          </atbat>
        </top>
        <bottom>
          <atbat num="4" b="0" s="0" o="0" start_tfs="221601" start_tfs_zulu="2011-08-14T02:16:01Z" batter="400085" stand="L" b_height="5-11" pitcher="277417" p_throws="R" des="Ichiro Suzuki homers (2) on a line drive to right field. " event="Home Run" score="T" home_team_runs="1" away_team_runs="0">
              <pitch des="In play, run(s)" id="25" type="X" tfs="221643" tfs_zulu="2011-08-14T02:16:43Z" x="93.56" y="147.65" sv_id="110813_191646"  end_speed="84.6" sz_top="3.48" sz_bot="1.48" pfx_x="-6.78" pfx_z="5.21" px="0.108" pz="2.431" x0="-2.246" y0="50.0" z0="5.38" vx0="8.633" vy0="-136.078" vz0="-3.672" ax="-12.535" ay="33.732" az="-22.465" break_y="23.7" break_angle="24.1" break_length="5.6" pitch_type="FF" type_confidence=".906" zone="5"  spin_dir="232.240" spin_rate="1690.398" cc="" mt=""/>
              <runner id="400085" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
          </atbat>
          <atbat num="5" b="3" s="1" o="0" start_tfs="221712" start_tfs_zulu="2011-08-14T02:17:12Z" batter="429711" stand="R" b_height="6-2" pitcher="277417" p_throws="R" des="Franklin Gutierrez singles on a ground ball to center fielder Jacoby Ellsbury. " event="Single">
              <pitch des="Ball" id="30" type="B" tfs="221730" tfs_zulu="2011-08-14T02:17:30Z" x="113.30" y="110.52" sv_id="110813_191732"  end_speed="84.2" sz_top="3.11" sz_bot="1.48" pfx_x="-5.37" pfx_z="4.25" px="-0.395" pz="3.794" x0="-2.418" y0="50.0" z0="5.367" vx0="7.273" vy0="-136.894" vz0="0.32" ax="-9.956" ay="36.958" az="-24.229" break_y="23.7" break_angle="18.4" break_length="5.6" pitch_type="FF" type_confidence=".907" zone="11"  spin_dir="231.409" spin_rate="1349.906" cc="" mt=""/>
              <pitch des="Foul" id="31" type="S" tfs="221746" tfs_zulu="2011-08-14T02:17:46Z" x="114.16" y="139.02" sv_id="110813_191749"  end_speed="84.9" sz_top="3.11" sz_bot="1.48" pfx_x="-6.13" pfx_z="5.45" px="-0.344" pz="2.592" x0="-2.441" y0="50.0" z0="5.331" vx0="7.762" vy0="-136.867" vz0="-3.269" ax="-11.451" ay="34.512" az="-21.928" break_y="23.7" break_angle="22.8" break_length="5.4" pitch_type="FF" type_confidence=".908" zone="1"  spin_dir="228.178" spin_rate="1628.759" cc="Josh Beckett is trying to tie up Franklin Gutierrez with fastballs inside, where Franklin Gutierrez hits .214." mt=""/>
              <pitch des="Ball" id="32" type="B" tfs="221814" tfs_zulu="2011-08-14T02:18:14Z" x="60.94" y="158.01" sv_id="110813_191817"  end_speed="70.9" sz_top="3.11" sz_bot="1.48" pfx_x="7.82" pfx_z="-11.75" px="1.189" pz="2.067" x0="-2.187" y0="50.0" z0="5.616" vx0="5.222" vy0="-112.828" vz0="2.78" ax="9.9" ay="24.066" az="-46.971" break_y="23.8" break_angle="-13.1" break_length="15.3" pitch_type="CU" type_confidence=".895" zone="14"  spin_dir="33.783" spin_rate="2289.225" cc="" mt=""/>
              <pitch des="Ball" id="33" type="B" tfs="221833" tfs_zulu="2011-08-14T02:18:33Z" x="129.61" y="126.93" sv_id="110813_191836"  end_speed="84.6" sz_top="3.08" sz_bot="1.41" pfx_x="-0.14" pfx_z="2.79" px="-0.965" pz="3.252" x0="-2.579" y0="50.0" z0="5.412" vx0="4.325" vy0="-133.902" vz0="-0.63" ax="-0.253" ay="27.284" az="-27.005" break_y="23.8" break_angle="-1.2" break_length="6.0" pitch_type="FC" type_confidence=".912" zone="11"  spin_dir="182.800" spin_rate="560.714" cc="" mt=""/>
              <pitch des="In play, no out" id="34" type="X" tfs="221856" tfs_zulu="2011-08-14T02:18:56Z" x="91.85" y="161.47" sv_id="110813_191859"  end_speed="85.6" sz_top="3.11" sz_bot="1.48" pfx_x="-9.46" pfx_z="2.61" px="0.277" pz="1.691" x0="-2.318" y0="50.0" z0="5.209" vx0="10.28" vy0="-136.614" vz0="-4.4" ax="-17.756" ay="32.112" az="-27.212" break_y="23.8" break_angle="28.7" break_length="7.0" pitch_type="FT" type_confidence=".908" zone="9"  spin_dir="254.386" spin_rate="1957.856" cc="Dangerous count for Josh Beckett; Franklin Gutierrez is a dead-red fastball hitter, with a .529 OPS against them and .523 against everything else." mt=""/>
              <runner id="429711" start="" end="1B" event="Single"/>
          </atbat>
          <atbat num="6" b="3" s="2" o="0" start_tfs="221925" start_tfs_zulu="2011-08-14T02:19:25Z" batter="554429" stand="L" b_height="6-1" pitcher="277417" p_throws="R" des="Dustin Ackley doubles (11) on a line drive to right fielder Josh Reddick. Franklin Gutierrez to 3rd. " event="Double">
              <pitch des="Ball" id="38" type="B" tfs="221949" tfs_zulu="2011-08-14T02:19:49Z" x="136.48" y="127.79" on_1b="429711" sv_id="110813_191952"  end_speed="84.7" sz_top="3.56" sz_bot="1.55" pfx_x="-5.34" pfx_z="5.84" px="-1.2" pz="3.341" x0="-2.549" y0="50.0" z0="5.445" vx0="5.464" vy0="-136.299" vz0="-1.663" ax="-9.919" ay="33.423" az="-21.247" break_y="23.7" break_angle="21.7" break_length="5.1" pitch_type="FF" type_confidence=".906" zone="11"  spin_dir="222.231" spin_rate="1570.813" cc="" mt=""/>
              <pitch des="Called Strike" id="39" type="S" tfs="222016" tfs_zulu="2011-08-14T02:20:16Z" x="120.17" y="141.61" on_1b="429711" sv_id="110813_192019"  end_speed="84.4" sz_top="3.51" sz_bot="1.62" pfx_x="-3.38" pfx_z="4.81" px="-0.702" pz="2.918" x0="-2.453" y0="50.0" z0="5.321" vx0="5.857" vy0="-136.656" vz0="-2.096" ax="-6.269" ay="35.663" az="-23.182" break_y="23.7" break_angle="11.4" break_length="5.3" pitch_type="FF" type_confidence=".897" zone="1"  spin_dir="214.882" spin_rate="1163.716" cc="" mt=""/>
              <pitch des="Ball" id="40" type="B" tfs="222048" tfs_zulu="2011-08-14T02:20:48Z" x="139.91" y="155.42" on_1b="429711" sv_id="110813_192051"  end_speed="81.5" sz_top="3.41" sz_bot="1.71" pfx_x="-8.42" pfx_z="-0.68" px="-1.241" pz="2.278" x0="-2.561" y0="50.0" z0="5.236" vx0="6.205" vy0="-131.505" vz0="-1.156" ax="-14.453" ay="33.013" az="-33.268" break_y="23.7" break_angle="21.1" break_length="8.5" pitch_type="CH" type_confidence=".890" zone="13"  spin_dir="274.329" spin_rate="1599.037" cc="" mt=""/>
              <po des="Pickoff Attempt 1B"/>
              <pitch des="Ball" id="42" type="B" tfs="222142" tfs_zulu="2011-08-14T02:21:42Z" x="130.47" y="124.34" on_1b="429711" sv_id="110813_192145"  end_speed="84.7" sz_top="3.29" sz_bot="1.54" pfx_x="-4.16" pfx_z="7.09" px="-0.95" pz="3.422" x0="-2.517" y0="50.0" z0="5.413" vx0="5.639" vy0="-136.362" vz0="-1.799" ax="-7.724" ay="33.576" az="-18.917" break_y="23.7" break_angle="18.2" break_length="4.5" pitch_type="FF" type_confidence=".902" zone="11"  spin_dir="210.225" spin_rate="1632.374" cc="" mt=""/>
              <pitch des="Foul" id="43" type="S" tfs="222209" tfs_zulu="2011-08-14T02:22:09Z" x="115.88" y="126.93" on_1b="429711" sv_id="110813_192212"  end_speed="85.2" sz_top="3.41" sz_bot="1.71" pfx_x="-5.76" pfx_z="5.06" px="-0.341" pz="3.343" x0="-2.466" y0="50.0" z0="5.28" vx0="7.72" vy0="-136.725" vz0="-1.003" ax="-10.799" ay="32.791" az="-22.605" break_y="23.7" break_angle="21.5" break_length="5.3" pitch_type="FF" type_confidence=".907" zone="1"  spin_dir="228.455" spin_rate="1531.010" cc="" mt=""/>
              <pitch des="In play, no out" id="44" type="X" tfs="222247" tfs_zulu="2011-08-14T02:22:47Z" x="88.41" y="163.19" on_1b="429711" sv_id="110813_192250"  end_speed="86.1" sz_top="3.41" sz_bot="1.71" pfx_x="-5.07" pfx_z="6.43" px="0.3" pz="1.83" x0="-2.416" y0="50.0" z0="5.23" vx0="9.096" vy0="-136.282" vz0="-5.46" ax="-9.578" ay="28.908" az="-19.959" break_y="23.8" break_angle="20.1" break_length="4.8" pitch_type="FF" type_confidence=".905" zone="9"  spin_dir="218.100" spin_rate="1652.426" cc="Josh Beckett is trying to tie up Dustin Ackley with fastballs inside, where Dustin Ackley hits .231." mt=""/>
              <runner id="429711" start="1B" end="3B" event="Pickoff Attempt 1B"/>
              <runner id="554429" start="" end="2B" event="Pickoff Attempt 1B"/>
          </atbat>
          <atbat num="7" b="0" s="0" o="0" start_tfs="222321" start_tfs_zulu="2011-08-14T02:23:21Z" batter="455077" stand="L" b_height="6-2" pitcher="277417" p_throws="R" des="Mike Carp singles on a ground ball to center fielder Jacoby Ellsbury. Franklin Gutierrez scores. Dustin Ackley scores. " event="Single" score="T" home_team_runs="3" away_team_runs="0">
              <pitch des="In play, run(s)" id="49" type="X" tfs="222404" tfs_zulu="2011-08-14T02:24:04Z" x="84.98" y="152.83" on_2b="554429" on_3b="429711" sv_id="110813_192406"  end_speed="73.1" sz_top="3.33" sz_bot="1.45" pfx_x="5.93" pfx_z="-10.73" px="0.425" pz="2.138" x0="-2.145" y0="50.0" z0="5.666" vx0="4.111" vy0="-116.338" vz0="2.151" ax="8.005" ay="24.88" az="-46.58" break_y="23.8" break_angle="-10.7" break_length="14.1" pitch_type="CU" type_confidence=".854" zone="6"  spin_dir="29.058" spin_rate="2055.208" cc="" mt=""/>
              <runner id="554429" start="2B" end="" event="Single" score="T" rbi="T" earned="T"/>
              <runner id="429711" start="3B" end="" event="Single" score="T" rbi="T" earned="T"/>
              <runner id="455077" start="" end="1B" event="Single"/>
          </atbat>
          <atbat num="8" b="3" s="2" o="1" start_tfs="222432" start_tfs_zulu="2011-08-14T02:24:32Z" batter="276377" stand="R" b_height="6-3" pitcher="277417" p_throws="R" des="Wily Mo Pena flies out to center fielder Jacoby Ellsbury. " event="Flyout">
              <pitch des="Called Strike" id="57" type="S" tfs="222502" tfs_zulu="2011-08-14T02:25:02Z" x="123.61" y="133.84" on_1b="455077" sv_id="110813_192504"  end_speed="83.1" sz_top="3.13" sz_bot="1.64" pfx_x="-1.63" pfx_z="0.67" px="-0.92" pz="2.809" x0="-2.682" y0="50.0" z0="5.404" vx0="5.145" vy0="-132.191" vz0="-0.839" ax="-2.873" ay="28.748" az="-30.911" break_y="23.8" break_angle="3.3" break_length="7.2" pitch_type="FC" type_confidence=".885" zone="11"  spin_dir="246.269" spin_rate="344.432" cc="" mt=""/>
              <pitch des="Called Strike" id="58" type="S" tfs="222525" tfs_zulu="2011-08-14T02:25:25Z" x="89.27" y="136.43" on_1b="455077" sv_id="110813_192527"  end_speed="74.1" sz_top="3.16" sz_bot="1.67" pfx_x="7.31" pfx_z="-8.55" px="0.222" pz="2.883" x0="-2.371" y0="50.0" z0="5.61" vx0="3.815" vy0="-118.049" vz0="3.169" ax="10.194" ay="25.003" az="-44.021" break_y="23.8" break_angle="-14.1" break_length="13.0" pitch_type="CU" type_confidence=".780" zone="2"  spin_dir="40.710" spin_rate="1920.765" cc="" mt=""/>
              <pitch des="Foul" id="59" type="S" tfs="222549" tfs_zulu="2011-08-14T02:25:49Z" x="82.40" y="161.47" on_1b="455077" sv_id="110813_192551"  end_speed="74.4" sz_top="3.38" sz_bot="1.65" pfx_x="6.53" pfx_z="-8.97" px="0.497" pz="1.95" x0="-2.188" y0="50.0" z0="5.581" vx0="4.259" vy0="-117.792" vz0="1.208" ax="9.098" ay="24.136" az="-44.594" break_y="23.8" break_angle="-12.5" break_length="13.2" pitch_type="CU" type_confidence=".817" zone="9"  spin_dir="36.223" spin_rate="1896.217" cc="" mt=""/>
              <pitch des="Foul" id="60" type="S" tfs="222618" tfs_zulu="2011-08-14T02:26:18Z" x="90.13" y="156.29" on_1b="455077" sv_id="110813_192621"  end_speed="73.8" sz_top="3.38" sz_bot="1.65" pfx_x="5.26" pfx_z="-10.52" px="0.197" pz="2.245" x0="-2.279" y0="50.0" z0="5.48" vx0="4.131" vy0="-117.261" vz0="2.655" ax="7.244" ay="24.566" az="-46.578" break_y="23.8" break_angle="-9.8" break_length="13.8" pitch_type="CU" type_confidence=".823" zone="5"  spin_dir="26.697" spin_rate="1994.776" cc="" mt=""/>
              <pitch des="Ball" id="61" type="B" tfs="222653" tfs_zulu="2011-08-14T02:26:53Z" x="48.07" y="128.65" on_1b="455077" sv_id="110813_192656"  end_speed="86.9" sz_top="3.38" sz_bot="1.65" pfx_x="-4.58" pfx_z="4.77" px="1.419" pz="3.16" x0="-2.13" y0="50.0" z0="5.373" vx0="11.291" vy0="-137.914" vz0="-1.825" ax="-8.832" ay="30.218" az="-22.907" break_y="23.8" break_angle="15.4" break_length="5.1" pitch_type="FF" type_confidence=".905" zone="12"  spin_dir="223.622" spin_rate="1346.663" cc="" mt=""/>
              <pitch des="Ball" id="62" type="B" tfs="222721" tfs_zulu="2011-08-14T02:27:21Z" x="41.20" y="178.73" on_1b="455077" sv_id="110813_192724"  end_speed="85.5" sz_top="3.38" sz_bot="1.65" pfx_x="0.1" pfx_z="-0.59" px="1.69" pz="0.96" x0="-2.215" y0="50.0" z0="5.288" vx0="10.28" vy0="-132.998" vz0="-5.155" ax="0.19" ay="24.607" az="-33.181" break_y="23.9" break_angle="-3.1" break_length="7.6" pitch_type="FC" type_confidence=".907" zone="14"  spin_dir="10.683" spin_rate="111.785" cc="" mt=""/>
              <pitch des="Foul" id="63" type="S" tfs="222753" tfs_zulu="2011-08-14T02:27:53Z" x="112.45" y="146.79" on_1b="455077" sv_id="110813_192755"  end_speed="84.7" sz_top="3.38" sz_bot="1.65" pfx_x="-0.12" pfx_z="0.69" px="-0.305" pz="2.641" x0="-2.433" y0="50.0" z0="5.419" vx0="5.691" vy0="-134.67" vz0="-1.568" ax="-0.218" ay="30.109" az="-30.84" break_y="23.8" break_angle="-1.8" break_length="6.9" pitch_type="FC" type_confidence=".908" zone="4"  spin_dir="189.279" spin_rate="145.616" cc="Josh Beckett is trying to tie up Wily Mo Pena with fastballs inside, where Wily Mo Pena hits .333." mt=""/>
              <pitch des="Ball" id="64" type="B" tfs="222827" tfs_zulu="2011-08-14T02:28:27Z" x="175.97" y="139.02" on_1b="455077" sv_id="110813_192829"  end_speed="86.2" sz_top="3.38" sz_bot="1.65" pfx_x="-10.27" pfx_z="1.86" px="-2.255" pz="2.919" x0="-2.635" y0="50.0" z0="5.291" vx0="4.649" vy0="-138.072" vz0="-1.192" ax="-19.647" ay="33.23" az="-28.533" break_y="23.8" break_angle="32.8" break_length="7.3" pitch_type="FT" type_confidence=".909" zone="11"  spin_dir="259.501" spin_rate="2099.546" cc="" mt=""/>
              <pitch des="Foul" id="65" type="S" tfs="222858" tfs_zulu="2011-08-14T02:28:58Z" x="122.75" y="154.56" on_1b="455077" sv_id="110813_192900"  end_speed="86.3" sz_top="3.38" sz_bot="1.65" pfx_x="-8.83" pfx_z="1.71" px="-0.778" pz="1.866" x0="-2.441" y0="50.0" z0="5.188" vx0="7.611" vy0="-137.548" vz0="-3.677" ax="-16.823" ay="32.091" az="-28.844" break_y="23.8" break_angle="27.0" break_length="7.1" pitch_type="FT" type_confidence=".898" zone="13"  spin_dir="258.803" spin_rate="1808.827" cc="" mt=""/>
              <pitch des="In play, out(s)" id="66" type="X" tfs="222926" tfs_zulu="2011-08-14T02:29:26Z" x="97.00" y="142.47" on_1b="455077" sv_id="110813_192928"  end_speed="86.2" sz_top="3.38" sz_bot="1.65" pfx_x="-0.48" pfx_z="1.19" px="-0.04" pz="2.725" x0="-2.412" y0="50.0" z0="5.282" vx0="6.531" vy0="-134.935" vz0="-1.289" ax="-0.904" ay="24.768" az="-29.876" break_y="23.9" break_angle="-.4" break_length="6.5" pitch_type="FC" type_confidence=".910" zone="5"  spin_dir="201.472" spin_rate="265.505" cc="" mt=""/>
          </atbat>
          <atbat num="9" b="1" s="1" o="1" start_tfs="222947" start_tfs_zulu="2011-08-14T02:29:47Z" batter="489413" stand="R" b_height="6-2" pitcher="277417" p_throws="R" des="Casper Wells homers (6) on a fly ball to left center field. Mike Carp scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="0">
              <pitch des="Swinging Strike" id="70" type="S" tfs="223019" tfs_zulu="2011-08-14T02:30:19Z" x="113.30" y="160.60" on_1b="455077" sv_id="110813_193022"  end_speed="86.7" sz_top="3.54" sz_bot="1.64" pfx_x="-7.88" pfx_z="1.72" px="-0.499" pz="1.946" x0="-2.257" y0="50.0" z0="5.278" vx0="7.566" vy0="-137.895" vz0="-3.77" ax="-15.146" ay="31.267" az="-28.792" break_y="23.8" break_angle="24.5" break_length="6.9" pitch_type="FF" type_confidence=".676" zone="7"  spin_dir="257.412" spin_rate="1632.741" cc="" mt=""/>
              <pitch des="Ball" id="71" type="B" tfs="223045" tfs_zulu="2011-08-14T02:30:45Z" x="71.24" y="157.15" on_1b="455077" sv_id="110813_193048"  end_speed="84.8" sz_top="3.54" sz_bot="1.64" pfx_x="-0.42" pfx_z="0.42" px="0.796" pz="2.047" x0="-2.286" y0="50.0" z0="5.339" vx0="8.303" vy0="-133.921" vz0="-2.796" ax="-0.765" ay="28.213" az="-31.334" break_y="23.8" break_angle="-1.5" break_length="7.1" pitch_type="FC" type_confidence=".905" zone="14"  spin_dir="222.324" spin_rate="123.080" cc="" mt=""/>
              <pitch des="In play, run(s)" id="72" type="X" tfs="223108" tfs_zulu="2011-08-14T02:31:08Z" x="87.55" y="151.97" on_1b="455077" sv_id="110813_193111"  end_speed="84.7" sz_top="3.54" sz_bot="1.64" pfx_x="0.44" pfx_z="2.21" px="0.307" pz="2.276" x0="-2.555" y0="50.0" z0="5.231" vx0="7.433" vy0="-134.097" vz0="-2.529" ax="0.794" ay="28.573" az="-28.076" break_y="23.8" break_angle="-4.5" break_length="6.4" pitch_type="FC" type_confidence=".911" zone="6"  spin_dir="169.036" spin_rate="451.604" cc="" mt=""/>
              <runner id="455077" start="1B" end="" event="Home Run" score="T" rbi="T" earned="T"/>
              <runner id="489413" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
          </atbat>
            <action b="1" s="1" o="1" des="Coaching visit to mound. " event="Game Advisory" tfs="223144" tfs_zulu="2011-08-14T02:31:44Z" player="408036" pitch="3"/>
          <atbat num="10" b="1" s="3" o="2" start_tfs="223223" start_tfs_zulu="2011-08-14T02:32:23Z" batter="408036" stand="L" b_height="6-3" pitcher="277417" p_throws="R" des="Josh Bard called out on strikes. " event="Strikeout">
              <pitch des="Ball" id="80" type="B" tfs="223229" tfs_zulu="2011-08-14T02:32:29Z" x="146.78" y="132.11" sv_id="110813_193232"  end_speed="85.0" sz_top="3.29" sz_bot="1.54" pfx_x="-7.03" pfx_z="6.19" px="-1.41" pz="3.065" x0="-2.578" y0="50.0" z0="5.4" vx0="5.578" vy0="-136.461" vz0="-2.432" ax="-13.118" ay="32.879" az="-20.555" break_y="23.7" break_angle="29.2" break_length="5.3" pitch_type="FF" type_confidence=".891" zone="11"  spin_dir="228.467" spin_rate="1863.038" cc="" mt=""/>
              <pitch des="Called Strike" id="81" type="S" tfs="223243" tfs_zulu="2011-08-14T02:32:43Z" x="132.19" y="140.74" sv_id="110813_193246"  end_speed="81.2" sz_top="3.41" sz_bot="1.59" pfx_x="-10.18" pfx_z="-1.11" px="-0.876" pz="2.787" x0="-2.399" y0="50.0" z0="5.448" vx0="7.259" vy0="-129.706" vz0="-0.138" ax="-17.212" ay="29.122" az="-33.977" break_y="23.8" break_angle="24.7" break_length="9.0" pitch_type="CH" type_confidence=".899" zone="11"  spin_dir="275.980" spin_rate="1935.723" cc="" mt=""/>
              <pitch des="Foul" id="82" type="S" tfs="223303" tfs_zulu="2011-08-14T02:33:03Z" x="86.70" y="121.75" sv_id="110813_193306"  end_speed="82.9" sz_top="3.29" sz_bot="1.54" pfx_x="-0.27" pfx_z="0.97" px="0.216" pz="3.528" x0="-2.481" y0="50.0" z0="5.415" vx0="7.121" vy0="-132.432" vz0="0.909" ax="-0.471" ay="30.145" az="-30.387" break_y="23.8" break_angle="-2.1" break_length="7.0" pitch_type="FC" type_confidence=".909" zone="12"  spin_dir="194.764" spin_rate="202.450" cc="" mt=""/>
              <pitch des="Called Strike" id="83" type="S" tfs="223329" tfs_zulu="2011-08-14T02:33:29Z" x="83.26" y="146.79" sv_id="110813_193332"  end_speed="71.5" sz_top="3.3" sz_bot="1.45" pfx_x="8.25" pfx_z="-12.05" px="0.365" pz="2.376" x0="-2.267" y0="50.0" z0="5.61" vx0="3.502" vy0="-114.4" vz0="3.425" ax="10.696" ay="25.373" az="-47.725" break_y="23.8" break_angle="-13.5" break_length="15.2" pitch_type="CU" type_confidence=".881" zone="6"  spin_dir="34.519" spin_rate="2393.571" cc="" mt=""/>
          </atbat>
          <atbat num="11" b="2" s="1" o="3" start_tfs="223349" start_tfs_zulu="2011-08-14T02:33:49Z" batter="425904" stand="L" b_height="5-9" pitcher="277417" p_throws="R" des="Luis Rodriguez grounds out softly, pitcher Josh Beckett to first baseman Adrian Gonzalez. " event="Groundout">
              <pitch des="Ball" id="87" type="B" tfs="223402" tfs_zulu="2011-08-14T02:34:02Z" x="96.14" y="102.75" sv_id="110813_193405"  end_speed="85.3" sz_top="3.13" sz_bot="1.52" pfx_x="-6.66" pfx_z="4.83" px="0.049" pz="4.188" x0="-2.506" y0="50.0" z0="5.358" vx0="9.214" vy0="-137.03" vz0="1.115" ax="-12.548" ay="32.915" az="-22.993" break_y="23.7" break_angle="24.5" break_length="5.4" pitch_type="FF" type_confidence=".908" zone="12"  spin_dir="233.807" spin_rate="1646.128" cc="" mt=""/>
              <pitch des="Foul" id="88" type="S" tfs="223421" tfs_zulu="2011-08-14T02:34:21Z" x="85.84" y="151.97" sv_id="110813_193424"  end_speed="85.1" sz_top="3.13" sz_bot="1.52" pfx_x="-6.48" pfx_z="6.53" px="0.549" pz="2.336" x0="-2.281" y0="50.0" z0="5.312" vx0="9.805" vy0="-135.376" vz0="-4.203" ax="-12.007" ay="30.066" az="-19.998" break_y="23.8" break_angle="25.3" break_length="5.1" pitch_type="FF" type_confidence=".907" zone="6"  spin_dir="224.599" spin_rate="1832.594" cc="Josh Beckett is trying to tie up Luis Rodriguez with fastballs inside, where Luis Rodriguez hits .111." mt=""/>
              <pitch des="Ball" id="89" type="B" tfs="223458" tfs_zulu="2011-08-14T02:34:58Z" x="104.72" y="167.51" sv_id="110813_193501"  end_speed="85.4" sz_top="3.32" sz_bot="1.61" pfx_x="-6.92" pfx_z="5.98" px="-0.094" pz="1.707" x0="-2.325" y0="50.0" z0="5.231" vx0="8.404" vy0="-136.408" vz0="-5.571" ax="-12.954" ay="31.857" az="-20.909" break_y="23.8" break_angle="26.5" break_length="5.4" pitch_type="FF" type_confidence=".902" zone="8"  spin_dir="228.988" spin_rate="1825.816" cc="" mt=""/>
              <pitch des="In play, out(s)" id="90" type="X" tfs="223518" tfs_zulu="2011-08-14T02:35:18Z" x="117.60" y="149.38" sv_id="110813_193521"  end_speed="81.9" sz_top="3.13" sz_bot="1.52" pfx_x="-8.57" pfx_z="2.53" px="-0.527" pz="2.34" x0="-2.518" y0="50.0" z0="5.273" vx0="7.991" vy0="-130.778" vz0="-2.164" ax="-14.746" ay="29.31" az="-27.747" break_y="23.8" break_angle="24.8" break_length="7.3" pitch_type="CH" type_confidence=".895" zone="4"  spin_dir="253.289" spin_rate="1707.973" cc="Josh Beckett is getting a generous strike zone this inning from home plate ump Mark Ripperger." mt=""/>
          </atbat>
        </bottom>
      </inning>
    </game>
  }

  def fetchInningScores(date: Date, team: String, gid: String = null) = {
    <scores away_team="bos" home_team="sea">
      <score inn="1" atbat_num="4" top_inning="N" home="1" away="0" pbp="Ichiro Suzuki homers (2) on a line drive to right field. ">
        <atbat num="4" b="0" s="0" o="0" start_tfs="221601" start_tfs_zulu="2011-08-14T02:16:01Z" batter="400085" stand="L" b_height="5-11" pitcher="277417" p_throws="R" des="Ichiro Suzuki homers (2) on a line drive to right field. " event="Home Run" score="T" home_team_runs="1" away_team_runs="0">
            <pitch des="In play, run(s)" id="25" type="X" tfs="221643" tfs_zulu="2011-08-14T02:16:43Z" x="93.56" y="147.65" sv_id="110813_191646"  end_speed="84.6" sz_top="3.48" sz_bot="1.48" pfx_x="-6.78" pfx_z="5.21" px="0.108" pz="2.431" x0="-2.246" y0="50.0" z0="5.38" vx0="8.633" vy0="-136.078" vz0="-3.672" ax="-12.535" ay="33.732" az="-22.465" break_y="23.7" break_angle="24.1" break_length="5.6" pitch_type="FF" type_confidence=".906" zone="5"  spin_dir="232.240" spin_rate="1690.398" cc="" mt=""/>
            <runner id="400085" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
        </atbat>
      </score>
      <score inn="1" atbat_num="7" top_inning="N" home="3" away="0" pbp="Mike Carp singles on a ground ball to center fielder Jacoby Ellsbury. Franklin Gutierrez scores. Dustin Ackley scores. ">
        <atbat num="7" b="0" s="0" o="0" start_tfs="222321" start_tfs_zulu="2011-08-14T02:23:21Z" batter="455077" stand="L" b_height="6-2" pitcher="277417" p_throws="R" des="Mike Carp singles on a ground ball to center fielder Jacoby Ellsbury. Franklin Gutierrez scores. Dustin Ackley scores. " event="Single" score="T" home_team_runs="3" away_team_runs="0">
            <pitch des="In play, run(s)" id="49" type="X" tfs="222404" tfs_zulu="2011-08-14T02:24:04Z" x="84.98" y="152.83" on_2b="554429" on_3b="429711" sv_id="110813_192406"  end_speed="73.1" sz_top="3.33" sz_bot="1.45" pfx_x="5.93" pfx_z="-10.73" px="0.425" pz="2.138" x0="-2.145" y0="50.0" z0="5.666" vx0="4.111" vy0="-116.338" vz0="2.151" ax="8.005" ay="24.88" az="-46.58" break_y="23.8" break_angle="-10.7" break_length="14.1" pitch_type="CU" type_confidence=".854" zone="6"  spin_dir="29.058" spin_rate="2055.208" cc="" mt=""/>
            <runner id="554429" start="2B" end="" event="Single" score="T" rbi="T" earned="T"/>
            <runner id="429711" start="3B" end="" event="Single" score="T" rbi="T" earned="T"/>
            <runner id="455077" start="" end="1B" event="Single"/>
        </atbat>
      </score>
      <score inn="1" atbat_num="9" top_inning="N" home="5" away="0" pbp="Casper Wells homers (6) on a fly ball to left center field. Mike Carp scores. ">
        <atbat num="9" b="1" s="1" o="1" start_tfs="222947" start_tfs_zulu="2011-08-14T02:29:47Z" batter="489413" stand="R" b_height="6-2" pitcher="277417" p_throws="R" des="Casper Wells homers (6) on a fly ball to left center field. Mike Carp scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="0">
            <pitch des="Swinging Strike" id="70" type="S" tfs="223019" tfs_zulu="2011-08-14T02:30:19Z" x="113.30" y="160.60" on_1b="455077" sv_id="110813_193022"  end_speed="86.7" sz_top="3.54" sz_bot="1.64" pfx_x="-7.88" pfx_z="1.72" px="-0.499" pz="1.946" x0="-2.257" y0="50.0" z0="5.278" vx0="7.566" vy0="-137.895" vz0="-3.77" ax="-15.146" ay="31.267" az="-28.792" break_y="23.8" break_angle="24.5" break_length="6.9" pitch_type="FF" type_confidence=".676" zone="7"  spin_dir="257.412" spin_rate="1632.741" cc="" mt=""/>
            <pitch des="Ball" id="71" type="B" tfs="223045" tfs_zulu="2011-08-14T02:30:45Z" x="71.24" y="157.15" on_1b="455077" sv_id="110813_193048"  end_speed="84.8" sz_top="3.54" sz_bot="1.64" pfx_x="-0.42" pfx_z="0.42" px="0.796" pz="2.047" x0="-2.286" y0="50.0" z0="5.339" vx0="8.303" vy0="-133.921" vz0="-2.796" ax="-0.765" ay="28.213" az="-31.334" break_y="23.8" break_angle="-1.5" break_length="7.1" pitch_type="FC" type_confidence=".905" zone="14"  spin_dir="222.324" spin_rate="123.080" cc="" mt=""/>
            <pitch des="In play, run(s)" id="72" type="X" tfs="223108" tfs_zulu="2011-08-14T02:31:08Z" x="87.55" y="151.97" on_1b="455077" sv_id="110813_193111"  end_speed="84.7" sz_top="3.54" sz_bot="1.64" pfx_x="0.44" pfx_z="2.21" px="0.307" pz="2.276" x0="-2.555" y0="50.0" z0="5.231" vx0="7.433" vy0="-134.097" vz0="-2.529" ax="0.794" ay="28.573" az="-28.076" break_y="23.8" break_angle="-4.5" break_length="6.4" pitch_type="FC" type_confidence=".911" zone="6"  spin_dir="169.036" spin_rate="451.604" cc="" mt=""/>
            <runner id="455077" start="1B" end="" event="Home Run" score="T" rbi="T" earned="T"/>
            <runner id="489413" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
        </atbat>
      </score>
      <score inn="6" atbat_num="42" top_inning="Y" home="5" away="2" pbp="Jacoby Ellsbury homers (20) on a fly ball to right field. Marco Scutaro scores. ">
        <atbat num="42" b="0" s="1" o="0" start_tfs="235647" start_tfs_zulu="2011-08-14T03:56:47Z" batter="453056" stand="L" b_height="6-1" pitcher="433587" p_throws="R" des="Jacoby Ellsbury homers (20) on a fly ball to right field. Marco Scutaro scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="2">
            <pitch des="Called Strike" id="339" type="S" tfs="235649" tfs_zulu="2011-08-14T03:56:49Z" x="116.74" y="139.02" on_3b="340192" sv_id="110813_205651"  end_speed="73.7" sz_top="3.47" sz_bot="1.6" pfx_x="4.39" pfx_z="-10.67" px="-0.408" pz="2.856" x0="-2.322" y0="50.0" z0="6.132" vx0="3.121" vy0="-118.641" vz0="2.534" ax="6.096" ay="28.058" az="-46.929" break_y="23.7" break_angle="-8.3" break_length="13.7" pitch_type="CU" type_confidence=".893" zone="1"  spin_dir="22.446" spin_rate="1952.216" cc="" mt=""/>
            <pitch des="In play, run(s)" id="340" type="X" tfs="235731" tfs_zulu="2011-08-14T03:57:31Z" x="82.40" y="136.43" on_3b="340192" sv_id="110813_205709"  end_speed="86.1" sz_top="3.47" sz_bot="1.6" pfx_x="-8.43" pfx_z="2.28" px="0.489" pz="2.738" x0="-1.649" y0="50.0" z0="5.77" vx0="8.761" vy0="-137.869" vz0="-3.101" ax="-16.068" ay="33.309" az="-27.758" break_y="23.7" break_angle="26.2" break_length="6.8" pitch_type="SI" type_confidence=".946" zone="6"  spin_dir="254.632" spin_rate="1753.514" cc="Felix Hernandez is trying to tie up Jacoby Ellsbury with fastballs inside, where Jacoby Ellsbury hits .371." mt=""/>
            <runner id="340192" start="3B" end="" event="Home Run" score="T" rbi="T" earned="T"/>
            <runner id="453056" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
        </atbat>
      </score>
      <score inn="6" atbat_num="45" top_inning="Y" home="5" away="4" pbp="Dustin Pedroia homers (16) on a fly ball to right center field. Adrian Gonzalez scores. ">
        <atbat num="45" b="2" s="2" o="1" start_tfs="235908" start_tfs_zulu="2011-08-14T03:59:08Z" batter="456030" stand="R" b_height="5-9" pitcher="433587" p_throws="R" des="Dustin Pedroia homers (16) on a fly ball to right center field. Adrian Gonzalez scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="4">
            <pitch des="Called Strike" id="356" type="S" tfs="235922" tfs_zulu="2011-08-14T03:59:22Z" x="76.39" y="158.88" on_1b="408236" sv_id="110813_205925"  end_speed="86.6" sz_top="3.46" sz_bot="1.48" pfx_x="-3.2" pfx_z="3.94" px="0.702" pz="2.126" x0="-1.789" y0="50.0" z0="5.563" vx0="7.859" vy0="-136.525" vz0="-4.74" ax="-6.079" ay="28.056" az="-24.609" break_y="23.8" break_angle="10.1" break_length="5.5" pitch_type="FF" type_confidence=".995" zone="9"  spin_dir="218.783" spin_rate="1031.282" cc="" mt=""/>
            <pitch des="Ball" id="357" type="B" tfs="235940" tfs_zulu="2011-08-14T03:59:40Z" x="68.67" y="163.19" on_1b="408236" sv_id="110813_205942"  end_speed="80.8" sz_top="3.46" sz_bot="1.48" pfx_x="1.33" pfx_z="-4.92" px="0.944" pz="1.667" x0="-1.804" y0="50.0" z0="5.692" vx0="6.476" vy0="-127.392" vz0="-2.129" ax="2.179" ay="26.345" az="-40.182" break_y="23.8" break_angle="-4.7" break_length="10.1" pitch_type="SL" type_confidence=".901" zone="14"  spin_dir="15.220" spin_rate="945.136" cc="" mt=""/>
            <pitch des="Ball" id="358" type="B" tfs="000000" tfs_zulu="2011-08-14T04:00:00Z" x="80.69" y="162.33" on_1b="408236" sv_id="110813_210002"  end_speed="86.9" sz_top="3.16" sz_bot="1.56" pfx_x="-0.88" pfx_z="3.96" px="0.627" pz="1.722" x0="-1.876" y0="50.0" z0="5.434" vx0="7.099" vy0="-137.049" vz0="-5.543" ax="-1.691" ay="28.88" az="-24.522" break_y="23.8" break_angle=".7" break_length="5.4" pitch_type="FC" type_confidence=".938" zone="9"  spin_dir="192.460" spin_rate="829.574" cc="" mt=""/>
            <pitch des="Foul Tip" id="359" type="S" tfs="000022" tfs_zulu="2011-08-14T04:00:22Z" x="82.40" y="136.43" on_1b="408236" sv_id="110813_210025"  end_speed="79.1" sz_top="3.46" sz_bot="1.48" pfx_x="1.95" pfx_z="-3.49" px="0.469" pz="2.858" x0="-1.847" y0="50.0" z0="5.831" vx0="5.102" vy0="-125.245" vz0="0.264" ax="3.087" ay="25.478" az="-37.633" break_y="23.8" break_angle="-6.1" break_length="9.7" pitch_type="SL" type_confidence=".901" zone="3"  spin_dir="29.486" spin_rate="726.449" cc="" mt=""/>
            <pitch des="In play, run(s)" id="360" type="X" tfs="000121" tfs_zulu="2011-08-14T04:01:21Z" x="94.42" y="155.42" on_1b="408236" sv_id="110813_210050"  end_speed="86.8" sz_top="3.46" sz_bot="1.48" pfx_x="-4.73" pfx_z="6.01" px="0.118" pz="2.125" x0="-1.817" y0="50.0" z0="5.501" vx0="6.928" vy0="-137.467" vz0="-5.392" ax="-9.072" ay="29.51" az="-20.569" break_y="23.8" break_angle="19.4" break_length="4.9" pitch_type="FF" type_confidence=".908" zone="8"  spin_dir="218.015" spin_rate="1554.572" cc="" mt=""/>
            <runner id="408236" start="1B" end="" event="Home Run" score="T" rbi="T" earned="T"/>
            <runner id="456030" start="" end="" event="Home Run" score="T" rbi="T" earned="T"/>
        </atbat>
      </score>
    </scores>
  }

  def fetchGameEvents(date: Date, team: String, gid: String = null) = {
    <game>
      <inning num="1">
        <top>
            <atbat num="1" o="1" start_tfs="220954" start_tfs_zulu="2011-08-14T02:09:54Z" batter="453056" pitcher="433587" des="Jacoby Ellsbury pops out to shortstop Jack Wilson. " event="Pop Out" b1="" b2="" b3=""/>
            <atbat num="2" o="2" start_tfs="221134" start_tfs_zulu="2011-08-14T02:11:34Z" batter="408307" pitcher="433587" des="Carl Crawford grounds out, second baseman Dustin Ackley to first baseman Mike Carp. " event="Groundout" b1="" b2="" b3=""/>
            <atbat num="3" o="3" start_tfs="221227" start_tfs_zulu="2011-08-14T02:12:27Z" batter="408236" pitcher="433587" des="Adrian Gonzalez lines out to center fielder Franklin Gutierrez. " event="Lineout" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <atbat num="4" o="0" start_tfs="221601" start_tfs_zulu="2011-08-14T02:16:01Z" batter="400085" pitcher="277417" des="Ichiro Suzuki homers (2) on a line drive to right field. " event="Home Run" score="T" home_team_runs="1" away_team_runs="0" b1="" b2="" b3="" rbi="1"/>
            <atbat num="5" o="0" start_tfs="221712" start_tfs_zulu="2011-08-14T02:17:12Z" batter="429711" pitcher="277417" des="Franklin Gutierrez singles on a ground ball to center fielder Jacoby Ellsbury. " event="Single" b1="429711" b2="" b3=""/>
            <atbat num="6" o="0" start_tfs="221925" start_tfs_zulu="2011-08-14T02:19:25Z" batter="554429" pitcher="277417" des="Dustin Ackley doubles (11) on a line drive to right fielder Josh Reddick. Franklin Gutierrez to 3rd. " event="Double" b1="" b2="554429" b3="429711"/>
            <atbat num="7" o="0" start_tfs="222321" start_tfs_zulu="2011-08-14T02:23:21Z" batter="455077" pitcher="277417" des="Mike Carp singles on a ground ball to center fielder Jacoby Ellsbury. Franklin Gutierrez scores. Dustin Ackley scores. " event="Single" score="T" home_team_runs="3" away_team_runs="0" b1="455077" b2="" b3="" rbi="2"/>
            <atbat num="8" o="1" start_tfs="222432" start_tfs_zulu="2011-08-14T02:24:32Z" batter="276377" pitcher="277417" des="Wily Mo Pena flies out to center fielder Jacoby Ellsbury. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="9" o="1" start_tfs="222947" start_tfs_zulu="2011-08-14T02:29:47Z" batter="489413" pitcher="277417" des="Casper Wells homers (6) on a fly ball to left center field. Mike Carp scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="0" b1="" b2="" b3="" rbi="2"/>
            <action o="1" des="Coaching visit to mound. " event="Game Advisory" tfs="223144" tfs_zulu="2011-08-14T02:31:44Z" player="408036" pitch="3"/>
            <atbat num="10" o="2" start_tfs="223223" start_tfs_zulu="2011-08-14T02:32:23Z" batter="408036" pitcher="277417" des="Josh Bard called out on strikes. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="11" o="3" start_tfs="223349" start_tfs_zulu="2011-08-14T02:33:49Z" batter="425904" pitcher="277417" des="Luis Rodriguez grounds out softly, pitcher Josh Beckett to first baseman Adrian Gonzalez. " event="Groundout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="2">
        <top>
            <atbat num="12" o="1" start_tfs="223701" start_tfs_zulu="2011-08-14T02:37:01Z" batter="456030" pitcher="433587" des="Dustin Pedroia pops out to first baseman Mike Carp in foul territory. " event="Pop Out" b1="" b2="" b3=""/>
            <atbat num="13" o="2" start_tfs="223823" start_tfs_zulu="2011-08-14T02:38:23Z" batter="120074" pitcher="433587" des="David Ortiz flies out to left fielder Casper Wells. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="14" o="3" start_tfs="223936" start_tfs_zulu="2011-08-14T02:39:36Z" batter="502210" pitcher="433587" des="Josh Reddick grounds out, shortstop Jack Wilson to first baseman Mike Carp. " event="Groundout" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <atbat num="15" o="0" start_tfs="224258" start_tfs_zulu="2011-08-14T02:42:58Z" batter="333292" pitcher="277417" des="Jack Wilson singles on a soft line drive to right fielder Josh Reddick. " event="Single" b1="333292" b2="" b3=""/>
            <atbat num="16" o="2" start_tfs="224605" start_tfs_zulu="2011-08-14T02:46:05Z" batter="400085" pitcher="277417" des="Ichiro Suzuki grounds into double play, first baseman Adrian Gonzalez to shortstop Marco Scutaro to first baseman Adrian Gonzalez. Jack Wilson out at 2nd. " event="Grounded Into DP" b1="" b2="" b3=""/>
            <atbat num="17" o="3" start_tfs="224744" start_tfs_zulu="2011-08-14T02:47:44Z" batter="429711" pitcher="277417" des="Franklin Gutierrez grounds out, shortstop Marco Scutaro to first baseman Adrian Gonzalez. " event="Groundout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="3">
        <top>
            <atbat num="18" o="0" start_tfs="225207" start_tfs_zulu="2011-08-14T02:52:07Z" batter="449107" pitcher="433587" des="Mike Aviles singles on a soft ground ball to third baseman Luis Rodriguez. " event="Single" b1="449107" b2="" b3=""/>
            <atbat num="19" o="1" start_tfs="225415" start_tfs_zulu="2011-08-14T02:54:15Z" batter="123660" pitcher="433587" des="Jason Varitek grounds into a force out, first baseman Mike Carp to shortstop Jack Wilson. Mike Aviles out at 2nd. Jason Varitek to 1st. " event="Forceout" b1="123660" b2="" b3=""/>
            <atbat num="20" o="3" start_tfs="225552" start_tfs_zulu="2011-08-14T02:55:52Z" batter="340192" pitcher="433587" des="Marco Scutaro grounds into double play, second baseman Dustin Ackley to shortstop Jack Wilson to first baseman Mike Carp. Jason Varitek out at 2nd. " event="Grounded Into DP" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <atbat num="21" o="1" start_tfs="225847" start_tfs_zulu="2011-08-14T02:58:47Z" batter="554429" pitcher="277417" des="Dustin Ackley grounds out, first baseman Adrian Gonzalez to pitcher Josh Beckett. " event="Groundout" b1="" b2="" b3=""/>
            <atbat num="22" o="2" start_tfs="230018" start_tfs_zulu="2011-08-14T03:00:18Z" batter="455077" pitcher="277417" des="Mike Carp strikes out on foul tip. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="23" o="3" start_tfs="230201" start_tfs_zulu="2011-08-14T03:02:01Z" batter="276377" pitcher="277417" des="Wily Mo Pena grounds out, shortstop Marco Scutaro to first baseman Adrian Gonzalez. " event="Groundout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="4">
        <top>
            <atbat num="24" o="0" start_tfs="230451" start_tfs_zulu="2011-08-14T03:04:51Z" batter="453056" pitcher="433587" des="Jacoby Ellsbury walks. " event="Walk" b1="453056" b2="" b3=""/>
            <action o="0" des="With Carl Crawford batting, missed catch error by Mike Carp on the pickoff attempt, Jacoby Ellsbury to 2nd. " event="Pickoff Error 1B" tfs="230824" tfs_zulu="2011-08-14T03:08:24Z" player="453056" pitch="0"/>
            <atbat num="25" o="0" start_tfs="230731" start_tfs_zulu="2011-08-14T03:07:31Z" batter="408307" pitcher="433587" des="Carl Crawford singles on a ground ball to pitcher Felix Hernandez. Jacoby Ellsbury to 3rd. " event="Single" b1="408307" b2="453056" b3="453056"/>
            <atbat num="26" o="1" start_tfs="230916" start_tfs_zulu="2011-08-14T03:09:16Z" batter="408236" pitcher="433587" des="Adrian Gonzalez grounds out softly, first baseman Mike Carp to pitcher Felix Hernandez. Carl Crawford to 2nd. " event="Groundout" b1="" b2="408307" b3=""/>
            <atbat num="27" o="3" start_tfs="231041" start_tfs_zulu="2011-08-14T03:10:41Z" batter="456030" pitcher="433587" des="Dustin Pedroia flies into double play, right fielder Ichiro Suzuki to catcher Josh Bard. Jacoby Ellsbury out at home on the throw. " event="Double Play" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <action o="0" des="Injury Delay. " event="Game Advisory" tfs="231421" tfs_zulu="2011-08-14T03:14:21Z" player="489413" pitch="5"/>
            <action o="0" des="Boston Red Sox Manager Terry Francona ejected by HP umpire Mark Ripperger. " event="Ejection" tfs="231741" tfs_zulu="2011-08-14T03:17:41Z" player="114378" pitch="5"/>
            <atbat num="28" o="1" start_tfs="231803" start_tfs_zulu="2011-08-14T03:18:03Z" batter="489413" pitcher="277417" des="Casper Wells called out on strikes. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="29" o="2" start_tfs="231901" start_tfs_zulu="2011-08-14T03:19:01Z" batter="408036" pitcher="277417" des="Josh Bard flies out to right fielder Josh Reddick. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="30" o="3" start_tfs="232036" start_tfs_zulu="2011-08-14T03:20:36Z" batter="425904" pitcher="277417" des="Luis Rodriguez grounds out to first baseman Adrian Gonzalez. " event="Groundout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="5">
        <top>
            <atbat num="31" o="0" start_tfs="232319" start_tfs_zulu="2011-08-14T03:23:19Z" batter="120074" pitcher="433587" des="David Ortiz walks. " event="Walk" b1="120074" b2="" b3=""/>
            <atbat num="32" o="1" start_tfs="232506" start_tfs_zulu="2011-08-14T03:25:06Z" batter="502210" pitcher="433587" des="Josh Reddick flies out to left fielder Casper Wells. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="33" o="2" start_tfs="232716" start_tfs_zulu="2011-08-14T03:27:16Z" batter="449107" pitcher="433587" des="Mike Aviles strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="34" o="3" start_tfs="232844" start_tfs_zulu="2011-08-14T03:28:44Z" batter="123660" pitcher="433587" des="Jason Varitek grounds out softly, first baseman Mike Carp to pitcher Felix Hernandez. " event="Groundout" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <atbat num="35" o="0" start_tfs="233146" start_tfs_zulu="2011-08-14T03:31:46Z" batter="333292" pitcher="277417" des="Jack Wilson doubles (8) on a ground ball to left fielder Carl Crawford, deflected by third baseman Mike Aviles. " event="Double" b1="" b2="333292" b3=""/>
            <atbat num="36" o="1" start_tfs="233452" start_tfs_zulu="2011-08-14T03:34:52Z" batter="400085" pitcher="277417" des="Ichiro Suzuki strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="37" o="1" start_tfs="233729" start_tfs_zulu="2011-08-14T03:37:29Z" batter="429711" pitcher="277417" des="Franklin Gutierrez singles on a ground ball to third baseman Mike Aviles. Jack Wilson to 3rd. " event="Single" b1="429711" b2="" b3="333292"/>
            <atbat num="38" o="2" start_tfs="233927" start_tfs_zulu="2011-08-14T03:39:27Z" batter="554429" pitcher="277417" des="Dustin Ackley strikes out on foul tip. Franklin Gutierrez steals (11) 2nd base. " event="Strikeout" event2="Stolen Base 2B" b1="" b2="429711" b3=""/>
            <atbat num="39" o="2" start_tfs="234457" start_tfs_zulu="2011-08-14T03:44:57Z" batter="455077" pitcher="277417" des="Mike Carp walks. " event="Walk" b1="455077" b2="" b3=""/>
            <atbat num="40" o="3" start_tfs="234846" start_tfs_zulu="2011-08-14T03:48:46Z" batter="276377" pitcher="277417" des="Wily Mo Pena strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="6">
        <top>
            <atbat num="41" o="0" start_tfs="235326" start_tfs_zulu="2011-08-14T03:53:26Z" batter="340192" pitcher="433587" des="Marco Scutaro triples (1) on a fly ball to center fielder Franklin Gutierrez. " event="Triple" b1="" b2="" b3="340192"/>
            <atbat num="42" o="0" start_tfs="235647" start_tfs_zulu="2011-08-14T03:56:47Z" batter="453056" pitcher="433587" des="Jacoby Ellsbury homers (20) on a fly ball to right field. Marco Scutaro scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="2" b1="" b2="" b3="" rbi="2"/>
            <atbat num="43" o="1" start_tfs="235738" start_tfs_zulu="2011-08-14T03:57:38Z" batter="408307" pitcher="433587" des="Carl Crawford flies out to center fielder Franklin Gutierrez. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="44" o="1" start_tfs="235829" start_tfs_zulu="2011-08-14T03:58:29Z" batter="408236" pitcher="433587" des="Adrian Gonzalez singles on a bunt ground ball to third baseman Luis Rodriguez. " event="Single" b1="408236" b2="" b3=""/>
            <atbat num="45" o="1" start_tfs="235908" start_tfs_zulu="2011-08-14T03:59:08Z" batter="456030" pitcher="433587" des="Dustin Pedroia homers (16) on a fly ball to right center field. Adrian Gonzalez scores. " event="Home Run" score="T" home_team_runs="5" away_team_runs="4" b1="" b2="" b3="" rbi="2"/>
            <action o="1" des="Coaching visit to mound. " event="Game Advisory" tfs="000137" tfs_zulu="2011-08-14T04:01:37Z" player="120074" pitch="5"/>
            <atbat num="46" o="1" start_tfs="000156" start_tfs_zulu="2011-08-14T04:01:56Z" batter="120074" pitcher="433587" des="David Ortiz singles on a line drive to right fielder Ichiro Suzuki, deflected by first baseman Mike Carp. " event="Single" b1="120074" b2="" b3=""/>
            <atbat num="47" o="2" start_tfs="000227" start_tfs_zulu="2011-08-14T04:02:27Z" batter="502210" pitcher="433587" des="Josh Reddick strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="48" o="2" start_tfs="000402" start_tfs_zulu="2011-08-14T04:04:02Z" batter="449107" pitcher="433587" des="Mike Aviles singles on a line drive to left fielder Casper Wells. David Ortiz to 2nd. " event="Single" b1="449107" b2="120074" b3=""/>
            <atbat num="49" o="3" start_tfs="000458" start_tfs_zulu="2011-08-14T04:04:58Z" batter="123660" pitcher="433587" des="Jason Varitek lines out to second baseman Dustin Ackley. " event="Lineout" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <action o="0" des="Pitcher Change: Matt Albers replaces Josh Beckett. " event="Pitching Substitution" tfs="000802" tfs_zulu="2011-08-14T04:08:02Z" player="458006" pitch="1"/>
            <atbat num="50" o="0" start_tfs="000830" start_tfs_zulu="2011-08-14T04:08:30Z" batter="489413" pitcher="458006" des="Casper Wells singles on a ground ball to third baseman Mike Aviles. " event="Single" b1="489413" b2="" b3=""/>
            <atbat num="51" o="1" start_tfs="001101" start_tfs_zulu="2011-08-14T04:11:01Z" batter="408036" pitcher="458006" des="Josh Bard flies out to left fielder Carl Crawford. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="52" o="2" start_tfs="001310" start_tfs_zulu="2011-08-14T04:13:10Z" batter="425904" pitcher="458006" des="Luis Rodriguez flies out to center fielder Jacoby Ellsbury. " event="Flyout" b1="" b2="" b3=""/>
            <atbat num="53" o="3" start_tfs="001459" start_tfs_zulu="2011-08-14T04:14:59Z" batter="333292" pitcher="458006" des="Jack Wilson strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="7">
        <top>
            <atbat num="54" o="1" start_tfs="002122" start_tfs_zulu="2011-08-14T04:21:22Z" batter="340192" pitcher="433587" des="Marco Scutaro pops out to second baseman Dustin Ackley. " event="Pop Out" b1="" b2="" b3=""/>
            <atbat num="55" o="1" start_tfs="002351" start_tfs_zulu="2011-08-14T04:23:51Z" batter="453056" pitcher="433587" des="Jacoby Ellsbury singles on a line drive to left fielder Casper Wells. " event="Single" b1="453056" b2="" b3=""/>
            <atbat num="56" o="3" start_tfs="002533" start_tfs_zulu="2011-08-14T04:25:33Z" batter="408307" pitcher="433587" des="Carl Crawford grounds into double play, second baseman Dustin Ackley to first baseman Mike Carp. Jacoby Ellsbury out at 2nd. " event="Grounded Into DP" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <atbat num="57" o="1" start_tfs="003120" start_tfs_zulu="2011-08-14T04:31:20Z" batter="400085" pitcher="458006" des="Ichiro Suzuki strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="58" o="2" start_tfs="003329" start_tfs_zulu="2011-08-14T04:33:29Z" batter="429711" pitcher="458006" des="Franklin Gutierrez strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <action o="2" des="Pitcher Change: Franklin Morales replaces Matt Albers. " event="Pitching Substitution" tfs="003651" tfs_zulu="2011-08-14T04:36:51Z" player="462985" pitch="4"/>
            <action o="2" des="Coaching visit to mound. " event="Game Advisory" tfs="003535" tfs_zulu="2011-08-14T04:35:35Z" player="554429" pitch="4"/>
            <atbat num="59" o="3" start_tfs="003812" start_tfs_zulu="2011-08-14T04:38:12Z" batter="554429" pitcher="462985" des="Dustin Ackley called out on strikes. " event="Strikeout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="8">
        <top>
            <action o="0" des="Pitcher Change: Jamey Wright replaces Felix Hernandez. " event="Pitching Substitution" tfs="004151" tfs_zulu="2011-08-14T04:41:51Z" player="124604" pitch="4"/>
            <atbat num="60" o="0" start_tfs="004228" start_tfs_zulu="2011-08-14T04:42:28Z" batter="408236" pitcher="124604" des="Adrian Gonzalez singles on a line drive to center fielder Franklin Gutierrez. " event="Single" b1="408236" b2="" b3=""/>
            <atbat num="61" o="2" start_tfs="004432" start_tfs_zulu="2011-08-14T04:44:32Z" batter="456030" pitcher="124604" des="Dustin Pedroia grounds into double play, pitcher Jamey Wright to shortstop Jack Wilson to first baseman Mike Carp. Adrian Gonzalez out at 2nd. " event="Grounded Into DP" b1="" b2="" b3=""/>
            <atbat num="62" o="2" start_tfs="004733" start_tfs_zulu="2011-08-14T04:47:33Z" batter="120074" pitcher="124604" des="David Ortiz walks. " event="Walk" b1="120074" b2="" b3=""/>
            <action o="2" des="Offensive Substitution: Pinch runner Darnell McDonald replaces David Ortiz. " event="Offensive sub" tfs="005121" tfs_zulu="2011-08-14T04:51:21Z" player="150021" pitch="7"/>
            <action o="3" des="With Josh Reddick batting, Darnell McDonald caught stealing 2nd base, catcher Josh Bard to shortstop Jack Wilson. " event="Caught Stealing 2B" tfs="005425" tfs_zulu="2011-08-14T04:54:25Z" player="150021" pitch="3"/>
            <atbat num="63" o="3" start_tfs="005129" start_tfs_zulu="2011-08-14T04:51:29Z" batter="502210" pitcher="124604" des="With Josh Reddick batting, Darnell McDonald caught stealing 2nd base, catcher Josh Bard to shortstop Jack Wilson. " event="Runner Out" b1="" b2="" b3=""/>
        </top>
        <bottom>
            <action o="0" des="Darnell McDonald remains in the game as the designated hitter. " event="Defensive Switch" tfs="005626" tfs_zulu="2011-08-14T04:56:26Z" player="150021" pitch="3"/>
            <atbat num="64" o="1" start_tfs="005642" start_tfs_zulu="2011-08-14T04:56:42Z" batter="455077" pitcher="462985" des="Mike Carp flies out to center fielder Jacoby Ellsbury. " event="Flyout" b1="" b2="" b3=""/>
            <action o="1" des="Pitcher Change: Alfredo Aceves replaces Franklin Morales. " event="Pitching Substitution" tfs="005846" tfs_zulu="2011-08-14T04:58:46Z" player="469686" pitch="2"/>
            <action o="1" des="Coaching visit to mound. " event="Game Advisory" tfs="005801" tfs_zulu="2011-08-14T04:58:01Z" player="276377" pitch="2"/>
            <atbat num="65" o="2" start_tfs="010015" start_tfs_zulu="2011-08-14T05:00:15Z" batter="276377" pitcher="469686" des="Wily Mo Pena strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="66" o="3" start_tfs="010229" start_tfs_zulu="2011-08-14T05:02:29Z" batter="489413" pitcher="469686" des="Casper Wells strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
        </bottom>
      </inning>
      <inning num="9">
        <top>
            <action o="0" des="Pitcher Change: Brandon League replaces Jamey Wright. " event="Pitching Substitution" tfs="010647" tfs_zulu="2011-08-14T05:06:47Z" player="434181" pitch="6"/>
            <atbat num="67" o="1" start_tfs="010743" start_tfs_zulu="2011-08-14T05:07:43Z" batter="502210" pitcher="434181" des="Josh Reddick strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <action o="1" des="Offensive Substitution: Pinch hitter Jed Lowrie replaces Mike Aviles. " event="Offensive sub" tfs="010959" tfs_zulu="2011-08-14T05:09:59Z" player="476704" pitch="5"/>
            <atbat num="68" o="2" start_tfs="011003" start_tfs_zulu="2011-08-14T05:10:03Z" batter="476704" pitcher="434181" des="Jed Lowrie strikes out swinging. " event="Strikeout" b1="" b2="" b3=""/>
            <atbat num="69" o="3" start_tfs="011143" start_tfs_zulu="2011-08-14T05:11:43Z" batter="123660" pitcher="434181" des="Jason Varitek grounds out, pitcher Brandon League to first baseman Mike Carp. " event="Groundout" b1="" b2="" b3=""/>
        </top>
          <bottom/>
      </inning>
        <atBat pid="123660"/>
        <deck pid="340192"/>
        <hole pid="453056"/>
    </game>
  }
}