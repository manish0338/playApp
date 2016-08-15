name := "my-app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  "org.springframework" % "spring-context" % "4.3.2.RELEASE",
  "org.springframework" % "spring-test" % "4.3.2.RELEASE"
)     

play.Project.playJavaSettings
