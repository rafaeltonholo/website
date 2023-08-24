@file:JsModule("react-i18next")

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package dev.tonholo.resume.util.definitions.typescript.react_i18next

import dev.tonholo.resume.util.definitions.typescript.i18next.Module
import dev.tonholo.resume.util.definitions.typescript.i18next.i18n


external interface ThirdPartyModule : Module {
    override var type: String /* "3rdParty" */
    fun init(i18next: i18n)
}

external var initReactI18next: ThirdPartyModule = definedExternally