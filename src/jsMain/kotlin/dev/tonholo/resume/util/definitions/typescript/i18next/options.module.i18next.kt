@file:OptIn(ExperimentalJsExport::class)

package dev.tonholo.resume.util.definitions.typescript.i18next

import kotlin.js.Json

@JsExport
class InitOptions {
    var debug: Boolean? = false
    var resources: Resource? = Resource()
    var fallbackLng: dynamic /* Boolean? | String? | Array<String>? | FallbackLngObjList? | ((code: String) -> dynamic)? */
        = "en"
    var interpolation: InterpolationOptions? = InterpolationOptions()
}

@JsExport
class InterpolationOptions {
    var escapeValue: Boolean? = false
}

class ResourceLanguage
operator fun ResourceLanguage.get(namespace: String): dynamic /* String? | Json? */ = asDynamic()[namespace]
operator fun ResourceLanguage.set(namespace: String, value: String) {
    asDynamic()[namespace] = value
}
operator fun ResourceLanguage.set(namespace: String, value: Json) {
    asDynamic()[namespace] = value
}


@JsExport
class Resource
operator fun Resource.get(language: String): ResourceLanguage = asDynamic()[language] as ResourceLanguage
operator fun Resource.set(language: String, value: ResourceLanguage) {
    asDynamic()[language] = value
}
