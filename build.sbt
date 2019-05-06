name := "sbt-github-release"
organization := "com.miodx.sbt.plugins"
version      := "0.4.0"
description := "sbt plugin using github releases api"

sbtPlugin := true
scalaVersion := "2.10.7"
// bucketSuffix := "era7.com"

resolvers += "Github-API" at "http://repo.jenkins-ci.org/public/"
libraryDependencies += "org.kohsuke" % "github-api" % "1.77"

// libraryDependencies += "com.github.xuwei-k" %% "ghscala" % "0.2.14"
//wartremoverErrors in (Compile, compile) --= Seq(Wart.Any, Wart.NonUnitStatements)

// enablePlugins(SbtGithubReleasePlugin)
