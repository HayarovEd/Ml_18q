plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("com.huawei.agconnect")
}

android {
    namespace = "trust.ggameforsame.online"
    compileSdk = 34

    defaultConfig {
        applicationId = "trust.ggameforsame.online"
        minSdk = 21
        targetSdk = 34
        versionCode = 2
        versionName = "2.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    /*signingConfigs {
        getByName("debug") {
            storeFile = file("GM_id_16.keystore")
            keyAlias = "mypass"
            storePassword = "trust.gameforsame.online"
            keyPassword = "trust.gameforsame.online"
        }
        create("release") {
            keyAlias = "mypass"
            keyPassword = "trust.gameforsame.online"
            storeFile = file("GM_id_16.keystore")
            storePassword = "trust.gameforsame.online"
            enableV2Signing = true
        }
    }*/

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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //Dagger
    implementation ("com.google.dagger:hilt-android:2.47")
    annotationProcessor ("com.google.dagger:hilt-compiler:2.47")
    kapt ("com.google.dagger:hilt-compiler:2.47")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")

    //retrofit
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")



    //AppMetrica
    implementation ("com.yandex.android:mobmetricalib:5.3.0")

    //MyTracker
    implementation ("com.my.tracker:mytracker-sdk:3.1.1")

    //Appsflyer
    implementation ("com.appsflyer:af-android-sdk:6.12.2")


    //HMS
    implementation ("com.huawei.hms:push:6.11.0.300")
    implementation ("com.huawei.hms:hmscoreinstaller:6.7.0.300")
    implementation ("com.huawei.hms:ads-identifier:3.4.62.300")
    implementation ("com.huawei.hms:ads-installreferrer:3.4.62.300")

    implementation(files("libs\\UserX-4.2.2.aar"))
}


kapt{
    correctErrorTypes = true
}