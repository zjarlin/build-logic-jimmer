
import org.gradle.kotlin.dsl.the
import org.gradle.kotlin.dsl.dependencies

plugins {
    id("com.google.devtools.ksp")
//    id("site.addzero.gradle.plugin.kspplugin-convention")
    id("site.addzero.gradle.plugin.kotlin-convention")

}


ksp {
    arg("KOIN_DEFAULT_MODULE", "true")
}

dependencies {
    ksp("io.insert-koin:koin-ksp-compiler:2.3.2-Beta1")
    implementation(platform("io.insert-koin:koin-bom:4.2.0-beta2"))
    implementation("io.insert-koin:koin-core:4.2.0-beta2")
    implementation("io.insert-koin:koin-annotations:2.3.2-Beta1")
    implementation("site.addzero:tool-koin:2025.12.29")
}