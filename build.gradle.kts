plugins {
    java
    scala
    jacoco
    application
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
    val junitVersion = "5.9.3"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}
// Enables JUnit Platform (needed for JUnit 5)
tasks.named<Test>("test") {
    useJUnitPlatform()
}

application {
// Define the main class for the application.
    mainClass.set("src.main.java.Sera")
}
tasks.test {
    useJUnitPlatform()
    testLogging {
        events(*org.gradle.api.tasks.testing.logging.TestLogEvent.values())
        showStandardStreams = true
    }
}


