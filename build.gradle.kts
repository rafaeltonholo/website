import org.gradle.kotlin.dsl.support.compileKotlinScriptModuleTo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.org.jetbrains.kotlin.multiplatform)
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

kotlin {
    js {
        moduleName = "resume"
        binaries.executable()
        browser {
            webpackTask(Action {
                mainOutputFileName.set("main.bundle.js")
                output.library = "commonjs2"
                sourceMaps = true
            })
        }
        generateTypeScriptDefinitions()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }
        val commonTest by getting
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(libs.org.jetbrains.kotlinx.html.js)

                // webpack
                implementation(devNpm("html-webpack-plugin", "5.5.0"))
                implementation(devNpm("uglifyjs-webpack-plugin", "2.2.0"))
                implementation(devNpm("terser-webpack-plugin", "5.3.1"))
                implementation(devNpm("copy-webpack-plugin", "9.1.0" )) // newer versions don't work correctly with npm and Yarn
                implementation(devNpm("node-json-minify", "3.0.0"))
            }
        }
        val jsTest by getting
    }
}
