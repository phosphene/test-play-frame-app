import sbt._
import Keys._
import play.Project._


object ApplicationBuild extends Build {

  val appName         = "test-play-frame-app"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.escalatesoft.subcut" %% "subcut" % "2.0",
    "org.mockito" % "mockito-core" % "1.9.5" % "test",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
