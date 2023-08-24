@file:JsModule("i18next")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package dev.tonholo.resume.util.definitions.typescript.i18n

import kotlin.js.Promise

external interface Interpolator {
    fun init(options: InterpolationOptions, reset: Boolean): Nothing?
    fun reset(): Nothing?
    fun resetRegExp(): Nothing?
    fun interpolate(str: String, data: Any?, lng: String, options: InterpolationOptions): String
    fun nest(str: String, fc: (args: Any) -> Any, options: InterpolationOptions): String
}

open external class ResourceStore(data: Resource, options: InitOptions<dynamic>) {
    open var data: Any
    open var options: Any
    open fun on(event: String /* "added" | "removed" */, callback: (lng: String, ns: String) -> Unit)
    open fun off(event: String /* "added" | "removed" */, callback: (lng: String, ns: String) -> Unit = definedExternally)
}

external interface Formatter {
    fun init(services: Services, i18nextOptions: InitOptions<dynamic>)
    fun add(name: String, fc: (value: Any, lng: String?, options: Any) -> String)
    fun addCached(name: String, fc: (lng: String?, options: Any) -> (value: Any) -> String)
    var format: Any
}

external interface Services {
    var backendConnector: Any
    var i18nFormat: Any
    var interpolator: Interpolator
    var languageDetector: Any
    var languageUtils: Any
    var logger: Any
    var pluralResolver: Any
    var resourceStore: ResourceStore
    var formatter: Formatter?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Module {
    var type: String /* "backend" | "logger" | "languageDetector" | "postProcessor" | "i18nFormat" | "formatter" | "3rdParty" */
}

external interface BackendModule<TOptions> : Module {
    override var type: String /* "backend" */
    fun init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions<dynamic>)
    fun read(language: String, namespace: String, callback: ReadCallback)
    val create: ((languages: Array<String>, namespace: String, key: String, fallbackValue: String) -> Unit)?
    val readMulti: ((languages: Array<String>, namespaces: Array<String>, callback: MultiReadCallback) -> Unit)?
    val save: ((language: String, namespace: String, data: ResourceLanguage) -> Unit)?
}

external interface BackendModule__0 : BackendModule<Any?>

external interface LanguageDetectorModule : Module {
    override var type: String /* "languageDetector" */
    val init: ((services: Services, detectorOptions: Any?, i18nextOptions: InitOptions<dynamic>) -> Unit)?
    fun detect(): dynamic /* String? | Array<String>? */
    val cacheUserLanguage: ((lng: String) -> Unit)?
}

external interface LanguageDetectorAsyncModule : Module {
    override var type: String /* "languageDetector" */
    var async: Boolean
    val init: ((services: Services, detectorOptions: Any?, i18nextOptions: InitOptions<dynamic>) -> Unit)?
    fun detect(callback: (lng: Any? /* String? | Array<String>? */) -> Unit?): dynamic /* Unit | Promise<dynamic /* String? | Array<String>? */> */
    val cacheUserLanguage: ((lng: String) -> dynamic)?
}

external interface PostProcessorModule : Module {
    var name: String
    override var type: String /* "postProcessor" */
    fun process(value: String, key: String, options: TOptionsBase, translator: Any): String
    fun process(value: String, key: Array<String>, options: TOptionsBase, translator: Any): String
}

external interface LoggerModule : Module {
    override var type: String /* "logger" */
    fun log(vararg args: Any)
    fun warn(vararg args: Any)
    fun error(vararg args: Any)
}

external interface I18nFormatModule : Module {
    override var type: String /* "i18nFormat" */
}

external interface FormatterModule : Module, Formatter {
    override var type: String /* "formatter" */
}

external interface ThirdPartyModule : Module {
    override var type: String /* "3rdParty" */
    fun init(i18next: i18n)
}

external interface Modules {
    var backend: BackendModule__0?
        get() = definedExternally
        set(value) = definedExternally
    var logger: LoggerModule?
        get() = definedExternally
        set(value) = definedExternally
    var languageDetector: dynamic /* LanguageDetectorModule? | LanguageDetectorAsyncModule? */
        get() = definedExternally
        set(value) = definedExternally
    var i18nFormat: I18nFormatModule?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: FormatterModule?
        get() = definedExternally
        set(value) = definedExternally
    var external: Array<ThirdPartyModule>
}

external interface Newable<T>

external interface NewableModule<T : Module> : Newable<T> {
    var type: Any
}

external interface ExistsFunction<TKeys : String, TInterpolationMap : Any?> {
    @nativeInvoke
    operator fun invoke(key: TKeys, options: TOptionsBase = definedExternally): Boolean
    @nativeInvoke
    operator fun invoke(key: TKeys): Boolean
    @nativeInvoke
    operator fun invoke(key: Array<TKeys>, options: TOptionsBase = definedExternally): Boolean
    @nativeInvoke
    operator fun invoke(key: Array<TKeys>): Boolean
}

external interface ExistsFunction__0 : ExistsFunction<String, `$Dictionary`<dynamic>>

external interface CloneOptions : InitOptions<dynamic> {
    var forkResourceStore: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): `T$0`?
    @nativeSetter
    operator fun set(key: String, value: `T$0`)
}

external interface LoadedNamespaceOptions {
    var lng: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var precheck: (i18n: i18n, loadNotPending: (lng: dynamic /* String | Array<String> */, ns: dynamic /* String | Array<String> */) -> Boolean) -> Boolean
}

external interface `T$3` {
    @nativeGetter
    operator fun get(namespace: String): Boolean?
    @nativeSetter
    operator fun set(namespace: String, value: Boolean)
}

external interface `T$4` {
    @nativeGetter
    operator fun get(language: String): `T$3`?
    @nativeSetter
    operator fun set(language: String, value: `T$3`)
}

external interface `T$5` {
    var keySeparator: String?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface i18n {
    var t: Any
    fun init(callback: Callback = definedExternally): Promise<Any>
    fun init(): Promise<Any>
    fun <T> init(options: InitOptions<dynamic>, callback: Callback = definedExternally): Promise<Any>
    fun <T> init(options: InitOptions<dynamic>): Promise<Any>
    fun loadResources(callback: (err: Any) -> Unit = definedExternally)
    fun <T : Module> use(module: T): i18n /* this */
    fun <T : Module> use(module: NewableModule<T>): i18n /* this */
    fun <T : Module> use(module: Newable<T>): i18n /* this */
    var modules: Modules
    var services: Services
    var store: ResourceStore
    var exists: ExistsFunction__0
    fun getDataByLanguage(lng: String): `T$1`?
    fun getFixedT(vararg args: Any /* JsTuple<lng, Any, Any, Ns, Any, TKPrefix> | JsTuple<lng, Nothing?, ns, Ns, Any, TKPrefix> */): Any
    fun changeLanguage(lng: String = definedExternally, callback: Callback = definedExternally): Promise<Any>
    var language: String
    var languages: Array<String>
    var resolvedLanguage: String?
        get() = definedExternally
        set(value) = definedExternally
    fun hasLoadedNamespace(ns: String, options: LoadedNamespaceOptions = definedExternally): Boolean
    fun hasLoadedNamespace(ns: String): Boolean
    fun hasLoadedNamespace(ns: Array<String>, options: LoadedNamespaceOptions = definedExternally): Boolean
    fun hasLoadedNamespace(ns: Array<String>): Boolean
    fun loadNamespaces(ns: String, callback: Callback = definedExternally): Promise<Unit>
    fun loadNamespaces(ns: String): Promise<Unit>
    fun loadNamespaces(ns: Array<String>, callback: Callback = definedExternally): Promise<Unit>
    fun loadNamespaces(ns: Array<String>): Promise<Unit>
    fun loadLanguages(lngs: String, callback: Callback = definedExternally): Promise<Unit>
    fun loadLanguages(lngs: String): Promise<Unit>
    fun loadLanguages(lngs: Array<String>, callback: Callback = definedExternally): Promise<Unit>
    fun loadLanguages(lngs: Array<String>): Promise<Unit>
    fun reloadResources(lngs: String = definedExternally, ns: String = definedExternally, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(): Promise<Unit>
    fun reloadResources(lngs: String = definedExternally): Promise<Unit>
    fun reloadResources(lngs: String = definedExternally, ns: String = definedExternally): Promise<Unit>
    fun reloadResources(lngs: String = definedExternally, ns: Array<String> = definedExternally, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(lngs: String = definedExternally, ns: Array<String> = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Array<String> = definedExternally, ns: String = definedExternally, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Array<String> = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Array<String> = definedExternally, ns: String = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Array<String> = definedExternally, ns: Array<String> = definedExternally, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Array<String> = definedExternally, ns: Array<String> = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Nothing?, ns: String, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Nothing?, ns: String): Promise<Unit>
    fun reloadResources(lngs: Nothing?, ns: Array<String>, callback: () -> Unit = definedExternally): Promise<Unit>
    fun reloadResources(lngs: Nothing?, ns: Array<String>): Promise<Unit>
    fun setDefaultNamespace(ns: String)
    fun hasLoadedNamespace(ns: String, options: Pick<InitOptions<dynamic>, String /* "fallbackLng" */> = definedExternally): Boolean
    fun dir(lng: String = definedExternally): String /* "ltr" | "rtl" */
    var format: Any
    fun createInstance(options: InitOptions<dynamic> = definedExternally, callback: Callback = definedExternally): i18n
    fun cloneInstance(options: CloneOptions = definedExternally, callback: Callback = definedExternally): i18n
    fun on(event: String /* "initialized" */, callback: (options: InitOptions<dynamic>) -> Unit)
    fun on(event: String /* "loaded" */, callback: (loaded: `T$4`) -> Unit)
    fun on(event: String /* "failedLoading" */, callback: (lng: String, ns: String, msg: String) -> Unit)
    fun on(event: String /* "missingKey" */, callback: (lngs: Array<String>, namespace: String, key: String, res: String) -> Unit)
    fun on(event: String /* "added" | "removed" */, callback: (lng: String, ns: String) -> Unit)
    fun on(event: String /* "languageChanged" */, callback: (lng: String) -> Unit)
    fun on(event: String, listener: (args: Any) -> Unit)
    fun off(event: String, listener: (args: Any) -> Unit = definedExternally)
    fun getResource(lng: String, ns: String, key: String, options: Pick<InitOptions<dynamic>, String /* "keySeparator" | "ignoreJSONStructure" */> = definedExternally): Any
    fun addResource(lng: String, ns: String, key: String, value: String, options: `T$5` = definedExternally): i18n
    fun addResources(lng: String, ns: String, resources: Any): i18n
    fun addResourceBundle(lng: String, ns: String, resources: Any, deep: Boolean = definedExternally, overwrite: Boolean = definedExternally): i18n
    fun hasResourceBundle(lng: String, ns: String): Boolean
    fun getResourceBundle(lng: String, ns: String): Any
    fun removeResourceBundle(lng: String, ns: String): i18n
    var options: Any
    var isInitialized: Boolean
    fun emit(eventName: String, vararg args: Any)
}

@JsName("default")
external var i18next: i18n

external var createInstance: Any

external var dir: Any

external var init: Any

external var loadResources: Any

external var reloadResources: Any

external var use: Any

external var changeLanguage: Any

external var getFixedT: Any

external var t: Any

external var exists: ExistsFunction__0

external var setDefaultNamespace: Any

external var hasLoadedNamespace: Any

external var loadNamespaces: Any

external var loadLanguages: Any