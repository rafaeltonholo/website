@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package dev.tonholo.resume.util.definitions.typescript.i18n

import kotlin.js.Json

external interface PluginOptions<T> {
    var detection: Any?
        get() = definedExternally
        set(value) = definedExternally
    var backend: T?
        get() = definedExternally
        set(value) = definedExternally
    var cache: Any?
        get() = definedExternally
        set(value) = definedExternally
    var i18nFormat: Any?
        get() = definedExternally
        set(value) = definedExternally
}

typealias FormatFunction = (value: Any, format: String, lng: String, options: InterpolationOptions /* InterpolationOptions & $Dictionary */) -> String

external interface InterpolationOptions {
    var format: FormatFunction?
        get() = definedExternally
        set(value) = definedExternally
    var formatSeparator: String?
        get() = definedExternally
        set(value) = definedExternally
    val escape: ((str: String) -> String)?
    var alwaysFormat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var escapeValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useRawValueToEscape: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var prefixEscaped: String?
        get() = definedExternally
        set(value) = definedExternally
    var suffixEscaped: String?
        get() = definedExternally
        set(value) = definedExternally
    var unescapeSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var unescapePrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var nestingPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var nestingSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var nestingPrefixEscaped: String?
        get() = definedExternally
        set(value) = definedExternally
    var nestingSuffixEscaped: String?
        get() = definedExternally
        set(value) = definedExternally
    var nestingOptionsSeparator: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultVariables: Json?
        get() = definedExternally
        set(value) = definedExternally
    var maxReplaces: Number?
        get() = definedExternally
        set(value) = definedExternally
    var skipOnVariables: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FallbackLngObjList {
    @nativeGetter
    operator fun get(language: String): Array<String>?
    @nativeSetter
    operator fun set(language: String, value: Array<String>)
}

external interface ReactOptions {
    var nsMode: String? /* "default" | "fallback" */
        get() = definedExternally
        set(value) = definedExternally
    var defaultTransParent: String?
        get() = definedExternally
        set(value) = definedExternally
    var bindI18n: dynamic /* String? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var bindI18nStore: dynamic /* String? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var transEmptyNodeValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var useSuspense: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val hashTransKey: ((defaultValue: Any) -> Any)?
    var transSupportBasicHtmlNodes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transKeepBasicHtmlNodesFor: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var transWrapTextNodes: String?
        get() = definedExternally
        set(value) = definedExternally
    var keyPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    val unescape: ((str: String) -> String)?
}

external interface ResourceLanguage {
    @nativeGetter
    operator fun get(namespace: String): dynamic /* String? | Json? */
    @nativeSetter
    operator fun set(namespace: String, value: String)
    @nativeSetter
    operator fun set(namespace: String, value: Json)
}

external interface Resource {
    @nativeGetter
    operator fun get(language: String): ResourceLanguage?
    @nativeSetter
    operator fun set(language: String, value: ResourceLanguage)
}

external interface LocalizeLastUsed {
    var projectId: String
    var apiKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var referenceLng: String?
        get() = definedExternally
        set(value) = definedExternally
    var version: String?
        get() = definedExternally
        set(value) = definedExternally
    var debounceSubmit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var allowedHosts: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InitOptions<T> : PluginOptions<T> {
    var debug: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resources: Resource?
        get() = definedExternally
        set(value) = definedExternally
    var partialBundledLanguages: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lng: String?
        get() = definedExternally
        set(value) = definedExternally
    var fallbackLng: dynamic /* Boolean? | String? | Array<String>? | FallbackLngObjList? | ((code: String) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var supportedLngs: dynamic /* Boolean? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var nonExplicitSupportedLngs: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var load: String? /* "all" | "currentOnly" | "languageOnly" */
        get() = definedExternally
        set(value) = definedExternally
    var preload: dynamic /* Boolean? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var lowerCaseLng: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cleanCode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ns: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var defaultNS: dynamic /* String? | Boolean? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var fallbackNS: dynamic /* Boolean? | String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var saveMissing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var saveMissingPlurals: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updateMissing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var saveMissingTo: String? /* "current" | "all" | "fallback" */
        get() = definedExternally
        set(value) = definedExternally
    var missingKeyNoValueFallbackToKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var missingKeyHandler: dynamic /* Boolean? | ((lngs: Array<String>, ns: String, key: String, fallbackValue: String, updateMissing: Boolean, options: Any) -> Unit)? */
        get() = definedExternally
        set(value) = definedExternally
    val parseMissingKeyHandler: ((key: String, defaultValue: String) -> Any)?
    var appendNamespaceToMissingKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var missingInterpolationHandler: ((text: String, value: Any, options: InitOptions__0) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var simplifyPluralSuffix: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var postProcess: dynamic /* Boolean? | String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var postProcessPassResolved: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnNull: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnEmptyString: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnObjects: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnDetails: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val returnedObjectHandler: ((key: String, value: String, options: Any) -> Unit)?
    var joinArrays: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    val overloadTranslationOptionHandler: ((args: Array<String>) -> TOptionsBase)?
    var interpolation: InterpolationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var react: ReactOptions?
        get() = definedExternally
        set(value) = definedExternally
    var initImmediate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keySeparator: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var nsSeparator: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var pluralSeparator: String?
        get() = definedExternally
        set(value) = definedExternally
    var contextSeparator: String?
        get() = definedExternally
        set(value) = definedExternally
    var appendNamespaceToCIMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var compatibilityJSON: String? /* "v1" | "v2" | "v3" | "v4" */
        get() = definedExternally
        set(value) = definedExternally
    var locizeLastUsed: LocalizeLastUsed?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreJSONStructure: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxParallelReads: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxRetries: Number?
        get() = definedExternally
        set(value) = definedExternally
    var retryTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InitOptions__0 : InitOptions<Any?>

external interface TOptionsBase {
    var defaultValue: Any?
        get() = definedExternally
        set(value) = definedExternally
    var count: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ordinal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var context: Any?
        get() = definedExternally
        set(value) = definedExternally
    var replace: Any?
        get() = definedExternally
        set(value) = definedExternally
    var lng: String?
        get() = definedExternally
        set(value) = definedExternally
    var lngs: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var fallbackLng: dynamic /* String? | Array<String>? | FallbackLngObjList? | ((code: String) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var ns: dynamic /* FlatNamespace? | Array<FlatNamespace>? */
        get() = definedExternally
        set(value) = definedExternally
    var keySeparator: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var nsSeparator: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var returnObjects: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnDetails: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var joinArrays: String?
        get() = definedExternally
        set(value) = definedExternally
    var postProcess: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: InterpolationOptions?
        get() = definedExternally
        set(value) = definedExternally
}
