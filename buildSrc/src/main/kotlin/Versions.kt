import org.gradle.api.JavaVersion

object Versions {

  /**
   * Source
   */
  val javaTarget = JavaVersion.VERSION_1_8
  const val kotlin = "1.9.10"

  /**
   * Required Libraries
   */
  const val netty = "4.1.130.Final"

  /**
   * Tooling Libraries
   */
  const val javaPoet = "1.13.0"
  const val argParser = "2.0.7"
  const val asciidoctorJ = "2.5.13"

  /**
   * Testing dependencies
   */
  const val junit = "5.11.4"
  const val junitClassic = "4.13.2"
  const val guava = "33.4.0-jre"
  const val compilerTesting = "0.21.0"
  const val checkstyle = "6.18"

  /**
   * Plugin dependencies
   */
  const val kotlinPlugin = kotlin
  const val shadowPlugin = "7.0.0"
  const val dockerComposePlugin = "0.17.12"
  const val asciiDoctorPlugin = "4.0.4"
  const val gitPublishPlugin = "3.0.0"
  const val testLoggerPlugin = "4.0.0"
  const val githubReleasePlugin = "2.2.12"

}
