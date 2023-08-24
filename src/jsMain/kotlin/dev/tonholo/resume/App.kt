package dev.tonholo.resume

import dev.tonholo.resume.pages.Home
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val App = FC<Props> {
    div {
        Home()
    }
}