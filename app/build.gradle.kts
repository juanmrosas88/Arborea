plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.juanrosasdev.arborea"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.juanrosasdev.arborea"
        minSdk = 26
        targetSdk = 33
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

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Fragment
    implementation ("androidx.fragment:fragment-ktx:1.6.2")
    // Activity
    implementation("androidx.activity:activity-ktx:1.3.0")
    implementation("androidx.activity:activity:1.3.0")
    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    //Corrutinas
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4")

    //Ubicacion
    implementation ("com.google.android.gms:play-services-location:21.0.1")

    //Imagenes
    implementation ("com.github.bumptech.glide:glide:4.12.0")



    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}