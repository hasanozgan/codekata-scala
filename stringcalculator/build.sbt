organization := "com.hasanozgan.codekata.stringcalculator"

name :="stringcalculator"

scalaVersion :="2.10.1"

version :="1.0"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "2.2" % "test",
    "org.scala-sbt" % "command" % "0.12.0"
)

resolvers ++= Seq(
    "Maven" at "http://central.maven.org/maven2/",
    "sonatype-public" at "https://oss.sonatype.org/content/groups/public",
    "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Snaps Repo" at "http://repo.typesafe.com/typesafe/snapshots/",
    "OSS Sonatype" at "http://oss.sonatype.org/content/repositories/releases/",
    "OSS Sonatype Snaps" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

org.scalastyle.sbt.ScalastylePlugin.Settings
