@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package dev.tonholo.resume.util.definitions.typescript.i18n

import kotlin.js.*

external interface `$Dictionary`<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}

typealias `$OmitArrayKeys`<Arr> = Any

typealias `$PreservedValue`<Value, Fallback> = Any