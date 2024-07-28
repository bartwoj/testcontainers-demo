plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junitVersion = "5.10.3"
val testcontainersVersion = "1.20.0"
val slf4jVersion = "2.0.13"
val logbackVersion = "1.5.6"

dependencies {
    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")

    // Testcontainers
    testImplementation("org.testcontainers:testcontainers:$testcontainersVersion")
    testImplementation("org.testcontainers:junit-jupiter:$testcontainersVersion")
    testImplementation("org.testcontainers:postgresql:$testcontainersVersion")

    // PostgreSQL JDBC Driver
    testImplementation("org.postgresql:postgresql:42.7.2")

    // Logging
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    testImplementation("ch.qos.logback:logback-classic:$logbackVersion")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}