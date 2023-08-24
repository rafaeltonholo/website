import dev.tonholo.resume.App
import dev.tonholo.resume.locale.en
import dev.tonholo.resume.locale.pt
import dev.tonholo.resume.util.definitions.typescript.i18next.*
import dev.tonholo.resume.util.definitions.typescript.i18next_browser_languagedetector.LanguageDetectorModule
import dev.tonholo.resume.util.definitions.typescript.react_i18next.initReactI18next
import dev.tonholo.resume.util.style.globalStyle
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
                                en,
                            )
                        },
                    )
                    set(
                        "pt",
                        ResourceLanguage().apply {
                            set(
                                "translation",
                                pt,
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
                appendChild(container)
                createRoot(container).render(App.create())
            }
        }
}
