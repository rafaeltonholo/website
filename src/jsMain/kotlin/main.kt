import dev.tonholo.resume.App
import dev.tonholo.resume.util.style.globalStyle
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    globalStyle()
    document.body?.apply {
        val container = document.createElement("div")
        appendChild(container)
        createRoot(container).render(App.create())
    }
}
