import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "me.nail"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC2")

}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}