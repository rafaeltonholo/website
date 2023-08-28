package dev.tonholo.website.features.home

import csstype.*
import dev.tonholo.website.components.FlexBox
import dev.tonholo.website.features.home.components.History
import dev.tonholo.website.features.home.components.Profile
import dev.tonholo.website.features.home.components.Skills
import dev.tonholo.website.util.WindowBreakpoints
import emotion.react.css
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.ReactHTML.div

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
        transitionCss {
            WindowBreakpoints.TABLET.mediaQuery {
                height = 90.vh
                margin = Margin(
                    top = 1.vh,
                    bottom = 3.vh,
                    left = 3.vw,
                    right = 3.vw,
                )
            }
        }

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

                Profile()

                Skills()
            }

            div {
                css {
                    width = 100.pct
                }
                History()
            }
        }
    }
}
