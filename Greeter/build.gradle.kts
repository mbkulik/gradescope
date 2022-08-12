repositories {
  mavenCentral()
}

plugins {
  java
  id("com.adarshr.test-logger") version "3.1.0"
}

testlogger {
  showStandardStreams = true
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

dependencies {
  implementation("org.apache.commons:commons-lang3:3.12.0")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
  testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
  testImplementation("com.google.code.gson:gson:2.9.1")
}

tasks.getByName<Test>("test") {
  useJUnitPlatform()
}

sourceSets {
  main {
    java {
      setSrcDirs(listOf("src/main"))
    }
  }
  test {
    java {
      setSrcDirs(listOf("src/test"))
    }
  }
}