@file:Suppress("unused")

package dev.tonholo.resume.util.definitions.typescript.i18next

import kotlin.js.Promise

external interface i18n {
    fun init(options: InitOptions): Promise<Any>
    fun <T : Module> use(module: T): i18n /* this */

    /**
     * Changes the language. The callback will be called as soon translations were loaded or an error occurs while loading.
     * HINT: For easy testing - setting lng to 'cimode' will set t function to always return the key.
     */
    fun changeLanguage(lng: String?): Promise<Any>
}

external interface Module {
    var type: String /* "backend" | "logger" | "languageDetector" | "postProcessor" | "i18nFormat" | "formatter" | "3rdParty" */
}

external interface LanguageDetectorModule : Module {
    override var type: String /* "languageDetector" */
    val init: ((services: Services, detectorOptions: Any?, i18nextOptions: InitOptions) -> Unit)?
    fun detect(): dynamic /* String? | Array<String>? */
    val cacheUserLanguage: ((lng: String) -> Unit)?
}

external interface Services {
    var backendConnector: Any
    var i18nFormat: Any
    var languageDetector: Any
    var languageUtils: Any
    var logger: Any
    var pluralResolver: Any
}
