@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package dev.tonholo.resume.util.definitions.typescript.i18n

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

typealias ReadCallback = (err: dynamic /* Error? | String? */, data: dynamic /* ResourceKey? | Boolean? */) -> Unit

typealias MultiReadCallback = (err: dynamic /* Error? | String? */, data: Resource?) -> Unit

typealias Callback = (error: Any, t: dynamic) -> Unit