package dev.tonholo.website.components

import csstype.em
import csstype.pct
import csstype.px
import dev.tonholo.website.style.Colors
import emotion.react.css
import react.ChildrenBuilder
import react.dom.html.ReactHTML.div

fun ChildrenBuilder.contentSeparator() {
    div {
        css {
            height = 2.px
            background = Colors.accents.border
            width = 100.pct
            margin = 1.em
            borderRadius = 100.pct
        }
    }
}