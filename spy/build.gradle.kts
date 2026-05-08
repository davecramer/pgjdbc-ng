import org.postgresql.ng.spy.tools.SpyGen

plugins {
  `java-library`
  id("com.adarshr.test-logger") version Versions.testLoggerPlugin
}

description = "PostgreSQL JDBC - NG - API Spy"


dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.junit}")
}

val genDir = file("$buildDir/generated")

tasks {

  val genTask = register("generator") {
    description = "Generate SPY relay, listener & trace classes"

    outputs.dir(genDir)

    doLast {
      genDir.mkdirs()
      SpyGen().generateTo(genDir)
    }
  }

  compileJava {
    options.isDeprecation = true
  }

  javadoc {
  }

}

apply {
  from("$rootDir/shared/src/build/compile-java.gradle.kts")
  from("$rootDir/shared/src/build/packaging.gradle.kts")
  from("$rootDir/shared/src/build/publishing.gradle.kts")
}
