package dev.tonholo.website.util.definitions.typescript.i18next_browser_languagedetector


@JsModule("i18next-browser-languagedetector")
@JsName("default")
external val i18NextBrowserLanguageDetector: dynamic

val LanguageDetectorModule: I18nextBrowserLanguageDetector =
    i18NextBrowserLanguageDetector.default.unsafeCast<I18nextBrowserLanguageDetector>()
