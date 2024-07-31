plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
dependencies {
    implementation(project(":domain"))
    implementation(libs.squareup.retrofit2)

    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
}
