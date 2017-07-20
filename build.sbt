name := "Databricks-Scala-Client"

version := "1.0"

scalaVersion := "2.11.8"

val typesafeVersion = "1.3.1"
val akkaVersion = "10.0.9"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" %  typesafeVersion,
  "com.typesafe.akka" %% "akka-http" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion % Test
)

        