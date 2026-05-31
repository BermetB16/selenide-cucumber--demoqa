plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "com.demoqa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Cucumber
    testImplementation("io.cucumber:cucumber-java:7.15.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.15.0")

    // JUnit 5
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.platform:junit-platform-suite:1.10.0")

    // Selenide
    testImplementation("com.codeborne:selenide:7.2.2")

    // Allure
    testImplementation("io.qameta.allure:allure-cucumber7-jvm:2.25.0")
    testImplementation("io.qameta.allure:allure-junit5:2.25.0")
}

tasks.test {
    useJUnitPlatform()
}