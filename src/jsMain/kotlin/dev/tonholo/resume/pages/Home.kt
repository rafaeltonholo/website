package dev.tonholo.resume.pages

import Welcome
import csstype.*
import dev.tonholo.resume.components.FlexBox
import dev.tonholo.resume.util.WindowBreakpoints
import emotion.css.css
import emotion.react.css
import react.FC
import react.Props
import react.PropsWithClassName
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p

private inline fun PropsWithClassName.transitionCss(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css {
        transitionProperty = TransitionProperty.all
        transitionTimingFunction = TransitionTimingFunction.ease
        transitionDuration = 0.4.s
        block()
    }
}

val Home = FC<Props> {

    div {
        transitionCss { }

        FlexBox {
            div {
                transitionCss {
                    WindowBreakpoints.TABLET.mediaQuery {
                        val size = WindowBreakpoints.TABLET.size
                        maxWidth = (size / 2).px
                        minWidth = (size / 4).px
                    }
                    WindowBreakpoints.TABLET_XL.mediaQuery {
                        maxWidth = 400.px
                        minWidth = 200.px
                    }
                    WindowBreakpoints.DESKTOP.mediaQuery {
                        val size = WindowBreakpoints.DESKTOP.size
                        maxWidth = (size / 2).px
                        minWidth = (size / 4).px
                    }
                }
            }

            div {
                css {
                    width = 100.pct
                }
            }
        }
    }
}
