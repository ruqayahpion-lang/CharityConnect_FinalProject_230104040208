plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "id.antasari.charityconnect"
    compileSdk = 36

    defaultConfig {
        applicationId = "id.antasari.charityconnect"
        minSdk = 24
        targetSdk = 36
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

    // ✅ Java 17 (WAJIB)
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {

        implementation("androidx.core:core-ktx:1.13.1")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")

        implementation("androidx.activity:activity-compose:1.9.3")

        implementation(platform("androidx.compose:compose-bom:2024.11.00"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")

        implementation("androidx.navigation:navigation-compose:2.8.5")
        // icons lengkap (WAJIB untuk History, ReceiptLong, Security, dll)
        implementation("androidx.compose.material:material-icons-extended")

    debugImplementation("androidx.compose.ui:ui-tooling")
    }

