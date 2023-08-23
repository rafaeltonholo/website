import kotlinx.browser.document
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.h1
import kotlinx.html.p

fun main() {
    document.body?.append?.div {
        h1 {
            +"Welcome to Kotlin/JS"
        }
        p {
            + "Fancy joining this yea's"
            a("https://kotlinconf.com/") {
                + "KotlinConf"
            }
            + "? Did it work? Like magic?"
        }
    }
}
