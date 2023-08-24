package dev.tonholo.resume.util.definitions.typescript.i18next_browser_languagedetector

import dev.tonholo.resume.util.definitions.typescript.i18next.InitOptions
import dev.tonholo.resume.util.definitions.typescript.i18next.LanguageDetectorModule
import dev.tonholo.resume.util.definitions.typescript.i18next.Services
import kotlin.js.*
import org.w3c.dom.*

external interface CookieOptions {
    var maxAge: Number?
        get() = definedExternally
        set(value) = definedExternally
    var expires: Date?
        get() = definedExternally
        set(value) = definedExternally
    var httpOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var domain: String?
        get() = definedExternally
        set(value) = definedExternally
    var secure: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sameSite: dynamic /* Boolean? | "lax" | "strict" | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DetectorOptions {
    var order: Array<String? /* "querystring" | "cookie" | "sessionStorage" | "localStorage" | "navigator" | "htmlTag" | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var lookupQuerystring: String?
        get() = definedExternally
        set(value) = definedExternally
    var lookupCookie: String?
        get() = definedExternally
        set(value) = definedExternally
    var lookupSessionStorage: String?
        get() = definedExternally
        set(value) = definedExternally
    var lookupLocalStorage: String?
        get() = definedExternally
        set(value) = definedExternally
    var lookupFromPathIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lookupFromSubdomainIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var caches: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeCacheFor: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var cookieMinutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cookieDomain: String?
        get() = definedExternally
        set(value) = definedExternally
    var cookieOptions: CookieOptions?
        get() = definedExternally
        set(value) = definedExternally
    var htmlTag: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    var convertDetectedLanguage: dynamic /* "Iso15897" | ((lng: String) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomDetector {
    var name: String
    val cacheUserLanguage: ((lng: String, options: DetectorOptions) -> Unit)?
    fun lookup(options: DetectorOptions): dynamic /* String? | Array<String>? */
}

open external class I18nextBrowserLanguageDetector(
    services: Any = definedExternally,
    options: DetectorOptions = definedExternally
) : LanguageDetectorModule {
    open fun addDetector(detector: CustomDetector): I18nextBrowserLanguageDetector
    open fun init(services: Any = definedExternally, options: DetectorOptions = definedExternally)
    open fun detect(detectionOrder: Array<String /* "querystring" | "cookie" | "sessionStorage" | "localStorage" | "navigator" | "htmlTag" | String */> = definedExternally): dynamic /* String? | Array<String>? */
    open fun cacheUserLanguage(lng: String, caches: Array<String> = definedExternally)
    override var type: String /* "languageDetector" */
    override val init: ((services: Services, detectorOptions: Any?, i18nextOptions: InitOptions) -> Unit)?
        get() = definedExternally

    override fun detect(): dynamic {
        definedExternally
    }

    override val cacheUserLanguage: ((lng: String) -> Unit)?
        get() = definedExternally
    open var detectors: Json
    open var services: Any
    open var i18nOptions: Any
}