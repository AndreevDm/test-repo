plugins {
    id("java")
}


java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

group = "com.github.andreevdm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}