plugins {
    kotlin("jvm") version "1.5.21"
    kotlin("kapt") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

repositories {
    mavenCentral()
    jcenter()
}

group = "isanmases.internship.memento"
version = "0.0.1"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.mapstruct:mapstruct:1.4.2.Final")
    kapt("org.mapstruct:mapstruct-processor:1.4.2.Final")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("io.springfox:springfox-swagger-ui:3.0.0")
    runtimeOnly("com.h2database:h2")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("org.springframework.boot:spring-boot-starter-test")


    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
}

kapt {
    arguments {
        arg("mapstruct.defaultComponentModel", "spring")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}