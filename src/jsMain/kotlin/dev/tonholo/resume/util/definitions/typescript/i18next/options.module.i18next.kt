package dev.tonholo.resume.util.definitions.typescript.i18next

import kotlin.js.Json

external interface InitOptions {
    var debug: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resources: Resource?
        get() = definedExternally
        set(value) = definedExternally
    var fallbackLng: dynamic /* Boolean? | String? | Array<String>? | FallbackLngObjList? | ((code: String) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: InterpolationOptions?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InterpolationOptions {
    var escapeValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class ResourceLanguage
inline operator fun ResourceLanguage.get(namespace: String): dynamic /* String? | Json? */ = asDynamic()[namespace]
inline operator fun ResourceLanguage.set(namespace: String, value: String) {
    asDynamic()[namespace] = value
}
inline operator fun ResourceLanguage.set(namespace: String, value: Json) {
    asDynamic()[namespace] = value
}


external class Resource
inline operator fun Resource.get(language: String): ResourceLanguage = asDynamic()[language] as ResourceLanguage
inline operator fun Resource.set(language: String, value: ResourceLanguage) {
    asDynamic()[language] = value
}
