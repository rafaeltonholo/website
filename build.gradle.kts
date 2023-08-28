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
    js(IR) {
        moduleName = "website"
        binaries.executable()
        useCommonJs()
        browser {
            webpackTask(Action {
                mainOutputFileName.set("main.bundle.js")
                output.libraryTarget = "commonjs2"
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
                implementation(libs.org.jetbrains.kotlin.wrappers.kotlin.react)
                implementation(libs.org.jetbrains.kotlin.wrappers.kotlin.react.dom)
                implementation(libs.org.jetbrains.kotlin.wrappers.kotlin.emotion)

                implementation(npm(name = "i18next", version = "^23.4.5"))
                implementation(npm(name = "i18next-browser-languagedetector", version = "^7.1.0"))
                implementation(npm(name = "react-i18next", version = "^13.2.0"))
                implementation(npm(name = "react-icons", version = "^4.10.1"))

                // webpack
                implementation(devNpm("html-webpack-plugin", "5.5.0"))
                implementation(devNpm("uglifyjs-webpack-plugin", "2.2.0"))
                implementation(devNpm("terser-webpack-plugin", "5.3.1"))
                implementation(devNpm("copy-webpack-plugin", "9.1.0" )) // newer versions don't work correctly with npm and Yarn
                implementation(devNpm("node-json-minify", "3.0.0"))

                implementation(devNpm("dukat", "0.5.8-rc.4"))
            }
        }
        val jsTest by getting
    }
}
