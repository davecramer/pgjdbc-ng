package org.postgresql.ng.tools

import com.google.testing.compile.CompilationSubject.assertThat
import com.google.testing.compile.Compiler.javac
import com.google.testing.compile.JavaFileObjects
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test


class SettingsProcessorTest {

  @Test
  @Disabled
  fun testCompile() {

    val result = javac()
       .withProcessors(SettingsProcessor())
       .compile(JavaFileObjects.forResource("MySettingsTest.java"))

    assertThat(result).succeeded()
    assertThat(result)
       .generatedSourceFile("org.postgresql.ng.jdbc.AbstractGeneratedDataSource")
  }

}
