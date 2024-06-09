plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
  //  id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.check2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.check2"
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("androidx.core:core:1.9.0");
    implementation("androidx.appcompat:appcompat:1.6.1");
    implementation("androidx.lifecycle:lifecycle-process:2.7.0");
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.android.gms:play-services-ads-identifier:18.0.1")
    implementation("com.google.firebase:firebase-messaging:24.0.0")
    implementation(moengage.inapp)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(moengage.core)
    implementation(moengage.cardsUi)
    implementation(moengage.inboxUi)
    // optionally add this to use the cards feature
//    implementation(moengage.cardsUi)
//    // optionally add this if you are using the core module of cards
//    implementation(moengage.cardsCore)
//    // optionally add this to use the geofence feature
//    implementation(moengage.geofence)
//    // optionally add this to use the Huaewi PushKit feature
//    implementation(moengage.pushKit)
//    // optionally add this to use the Inbox UI feature
//    implementation(moengage.inboxUi)
//    // optionally add this if you are using the core module of Inbox
//    implementation(moengage.inboxCore)
//    // optionally add this to use the Push Templates feature
//    implementation(moengage.richNotification)
//    // optionally add this to use the Device Trigger feature
//    implementation(moengage.deviceTrigger)
//    // optionally add this to use the Push Amp feature
//    implementation(moengage.pushAmp)
//    // optionally add this to use the InApp feature
//    implementation(moengage.inapp)
}

