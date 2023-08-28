@file:JsModule("react-i18next")

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS", "unused"
)

package dev.tonholo.resume.util.definitions.typescript.react_i18next

import dev.tonholo.resume.util.definitions.typescript.i18next.Module
import dev.tonholo.resume.util.definitions.typescript.i18next.i18n
import react.FC
import react.PropsWithChildren

external interface ThirdPartyModule : Module {
    override var type: String /* "3rdParty" */
    fun init(i18next: i18n)
}

external var initReactI18next: ThirdPartyModule = definedExternally

external interface TransProps : PropsWithChildren {
    var t: dynamic
    var i18nKey: String
}

external val Trans: FC<TransProps>

external interface UseTranslationOptions<KPrefix> {
    var i18n: i18n?
        get() = definedExternally
        set(value) = definedExternally
    var useSuspense: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keyPrefix: KPrefix?
        get() = definedExternally
        set(value) = definedExternally
    var bindI18n: dynamic /* String? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var nsMode: String? /* "fallback" | "default" */
        get() = definedExternally
        set(value) = definedExternally
    var lng: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TOptions {
    var defaultValue: Any?
    var returnObjects: Boolean?
    var joinArrays: String?
}

external fun useTranslation(
    ns: dynamic = definedExternally,
    options: UseTranslationOptions<Any> = definedExternally
): UseTranslationResponse /* JsTuple<t, TFunction<FallbackNs<Ns>, KPrefix>, i18n, i18n, ready, Boolean> */


@JsName("useTranslation")
external fun useTranslationWithOptions(
    ns: dynamic = definedExternally,
    options: UseTranslationOptions<Any> = definedExternally
): UseTranslationResponseWithOptions /* JsTuple<t, TFunction<FallbackNs<Ns>, KPrefix>, i18n, i18n, ready, Boolean> */
