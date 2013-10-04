scala-gameday-api
=================

scala-gameday-api is a Scala interface to the live data made available from MLB.com. This same data powers the Gameday
application that MLB.com provides.

This library is currently under active development, and is not yet a full representaion of the data available.

Documentation and examples are available in the [project wiki](https://github.com/ecopony/scala-gameday-api/wiki).

Example Usage
=============

NOTE: This library is in active development and the API may change at any time without warning.

Prerequisites: git, Scala 2.9, Maven

To build:
---------

    git clone git@github.com:ecopony/scala-gameday-api.git
    cd scala-gameday-api
    mvn scala:console

Example console session:
------------------------

    > import com.xenopsconsulting.gamedayapi._
    > import java.text.SimpleDateFormat
    > var date = new SimpleDateFormat("yyy-MM-dd").parse("2011-08-15")
    > var team = "sea"
    > var game = Game(date, team)
    > game.homeTeamNameFull # res1: String = Seattle Mariners

Typing 'game.' and then tabbing for tab-completion will show all methods available on a game instance.

See the [project wiki](https://github.com/ecopony/scala-gameday-api/wiki) for more information.


Usage Restriction
=================

All documents fetched by this API clearly state: Copyright 2011 MLB Advanced Media, L.P. Use of any content on this page
acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt

Which furthermore states: "The accounts, descriptions, data and presentation in the referring page (the “Materials”) are
proprietary content of MLB Advanced Media, L.P (“MLBAM”). Only individual, non-commercial, non-bulk use of the Materials
is permitted and any other use of the Materials is prohibited without prior written authorization from MLBAM. Authorized
users of the Materials are prohibited from using the Materials in any commercial manner other than as
expressly authorized by MLBAM."

Naturally, these terms are passed on to any who use this API. It is your responsibility to abide by them.

