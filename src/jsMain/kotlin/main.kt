import dev.tonholo.website.App
import dev.tonholo.website.locale.English
import dev.tonholo.website.locale.Portuguese
import dev.tonholo.website.util.definitions.typescript.i18next.*
import dev.tonholo.website.util.definitions.typescript.i18next_browser_languagedetector.LanguageDetectorModule
import dev.tonholo.website.util.definitions.typescript.react_i18next.initReactI18next
import dev.tonholo.website.util.style.globalStyle
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    i18next
        .use(initReactI18next)
        .use(LanguageDetectorModule)
        .init(
            InitOptions().apply {
                debug = true
                resources = Resource().apply {
                    set(
                        "en",
                        ResourceLanguage().apply {
                            set(
                                "translation",
                                English.toJson(),
                            )
                        },
                    )
                    set(
                        "pt",
                        ResourceLanguage().apply {
                            set(
                                "translation",
                                Portuguese.toJson(),
                            )
                        },
                    )
                }
                interpolation = InterpolationOptions().apply {
                    escapeValue = false
                }
            }
        )
        .then {
            globalStyle()
            document.body?.apply {
                val container = document.createElement("div")
                container.id = "root"
                appendChild(document.createElement("noscript").apply {
                    textContent = "You need to enable JavaScript to run this app."
                })
                appendChild(container)
                createRoot(container).render(App.create())
            }
        }
}
