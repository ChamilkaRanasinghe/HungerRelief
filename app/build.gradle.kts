plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.hungerrelief"  // Set the namespace to match your package
    compileSdk = 35  // Update this to SDK version 35

    defaultConfig {
        applicationId = "com.example.hungerrelief"  // Ensure it matches your package
        minSdk = 23
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.firebase.auth.ktx.v2211)
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v190)
    implementation(libs.androidx.constraintlayout.v214)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.firebase.auth.ktx) // Firebase Authentication
    implementation(libs.firebase.firestore.ktx) // Firestorm (if needed)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)



    implementation(libs.androidx.core.ktx)  // Core KTX library
    implementation(libs.firebase.auth)  // Firebase Authentication
    implementation(libs.androidx.appcompat)  // AppCompat for backward compatibility
    implementation(libs.material)  // Material Design components
    implementation(libs.androidx.activity)  // Activity components
    implementation(libs.androidx.constraintlayout)  // ConstraintLayout for UI design
    implementation(libs.androidx.window)  // Window Manager (if used)
    implementation(libs.firebase.auth)  // Firebase Authentication
 //   implementation(libs.androidx.test.ext.junit)  // JUnit Test library
    implementation(libs.androidx.espresso.core)  // Espresso for UI testing
    testImplementation(libs.junit)  // Unit testing library
    androidTestImplementation(libs.androidx.junit)  // JUnit for Android testing
    androidTestImplementation(libs.androidx.espresso.core)  // Espresso for Android testing
}
