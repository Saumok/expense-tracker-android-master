android {
    compileSdkVersion(33)
    defaultConfig {
        applicationId = "com.unique.expensetracker" // Change to a unique package name
        minSdkVersion(21)
        targetSdkVersion(33)
        versionCode = 2
        versionName = "2.0.0" // Update version to differentiate from the original
    }
    buildTypes {
        release {
            minifyEnabled(false)
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.google.firebase:firebase-analytics:19.0.0") // Add Firebase for cloud storage support
    // Add more dependencies as per your feature requirements
}
