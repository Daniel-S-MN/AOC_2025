plugins {
    kotlin("jvm") version "2.2.21"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Use Java 21
    }
}

kotlin {
    jvmToolchain(21) // Match Kotlin to the same version
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

tasks {
    wrapper {
        gradleVersion = "9.2.1"
    }
}
