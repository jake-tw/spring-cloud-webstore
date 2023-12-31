import org.springframework.boot.gradle.plugin.ResolveMainClassName
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
}

version = "1.0-SNAPSHOT"

tasks {
    named<BootJar>("bootJar") {
        enabled = false
    }
    named<ResolveMainClassName>("resolveMainClassName") {
        enabled = false
    }
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}