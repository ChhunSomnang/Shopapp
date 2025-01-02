// Root-level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()  // This is necessary for Kotlin plugin
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")  // Kotlin plugin classpath
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()  // Ensure that all modules can use these repositories
    }
}

