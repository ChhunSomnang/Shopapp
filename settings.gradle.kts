// settings.gradle.kts

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)  // Prefer repositories defined in settings
    repositories {
        google()       // Google repository
        mavenCentral() // Maven Central repository
    }
}

rootProject.name = "Shop-app"
include(":app")
