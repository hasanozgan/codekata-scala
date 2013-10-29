addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0-SNAPSHOT")

resolvers ++= Seq(
    "Maven" at "http://central.maven.org/maven2/",
    "sonatype-public" at "https://oss.sonatype.org/content/groups/public",
    "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Snaps Repo" at "http://repo.typesafe.com/typesafe/snapshots/",
    "OSS Sonatype" at "http://oss.sonatype.org/content/repositories/releases/",
    "OSS Sonatype Snaps" at "http://oss.sonatype.org/content/repositories/snapshots/"
)
