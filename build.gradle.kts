plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("site.addzero:gradle-apt-buddy:2025.12.23")
    implementation("site.addzero:kotlin-convention:2025.12.19")
    implementation("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:2.2.0+")

}