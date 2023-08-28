package dev.tonholo.website.components

import csstype.*
import dev.tonholo.website.util.WindowBreakpoints
import emotion.react.css
import react.*
import react.dom.html.ReactHTML.div



val FlexBox = FC<PropsWithChildren> { props ->
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center

            WindowBreakpoints.TABLET.mediaQuery {
                flexDirection = FlexDirection.row
                alignItems = AlignItems.start
            }
        }

        +props.children
    }
}
