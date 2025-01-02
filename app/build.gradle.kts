// App-level build.gradle.kts

plugins {
    id("com.android.application")
    id("kotlin-android")  // Apply Kotlin plugin
    id("kotlin-kapt")
}

android {
    namespace = "kh.edu.rupp.ite.ite.shop_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "kh.edu.rupp.ite.ite.shop_app"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")  // Kotlin standard library
    implementation("com.github.bumptech.glide:glide:4.15.1") // Use the latest version
    kapt("com.github.bumptech.glide:compiler:4.15.1")
    implementation ("com.google.code.gson:gson:2.10.1")

}
