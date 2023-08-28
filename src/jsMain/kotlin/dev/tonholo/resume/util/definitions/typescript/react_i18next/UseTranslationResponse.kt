package dev.tonholo.resume.util.definitions.typescript.react_i18next

import dev.tonholo.resume.util.definitions.typescript.i18next.i18n

typealias TFunction = (key: String/*, defaultValue: String?, options: dynamic*/) -> String
typealias TFunctionWithOptions = (key: String, options: TOptions) -> String

@Suppress("NOTHING_TO_INLINE")
class UseTranslationResponse private constructor() {
    inline val t: TFunction
        get() = asDynamic()[0].unsafeCast<TFunction>()
    inline val i18n: i18n
        get() = asDynamic()[1].unsafeCast<i18n>()
    inline val ready: Boolean
        get() = asDynamic()[2].unsafeCast<Boolean>()

    inline operator fun component1(): TFunction = t
    inline operator fun component2(): i18n = i18n
    inline operator fun component3(): Boolean = ready
}

@Suppress("NOTHING_TO_INLINE")
class UseTranslationResponseWithOptions private constructor() {
    inline val t: TFunctionWithOptions
        get() = asDynamic()[0].unsafeCast<TFunctionWithOptions>()
    inline val i18n: i18n
        get() = asDynamic()[1].unsafeCast<i18n>()
    inline val ready: Boolean
        get() = asDynamic()[2].unsafeCast<Boolean>()

    inline operator fun component1(): TFunctionWithOptions = t
    inline operator fun component2(): i18n = i18n
    inline operator fun component3(): Boolean = ready
}