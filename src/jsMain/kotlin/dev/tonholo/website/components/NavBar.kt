package dev.tonholo.website.components

import csstype.*
import dev.tonholo.website.style.Colors
import dev.tonholo.website.util.WindowBreakpoints
import dev.tonholo.website.util.definitions.typescript.react_i18next.useTranslation
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul

val NavBar = FC<Props> {
    val (t) = useTranslation()

    nav {
        ul {
            css {
                transitionProperty = TransitionProperty.all
                transitionTimingFunction = TransitionTimingFunction.ease
                transitionDuration = 0.4.s

                WindowBreakpoints.TABLET.mediaQuery {
                    marginLeft = 3.vw
                    marginRight = 3.vw
                }
                listStyle = None.none
                display = Display.flex
                gap = 1.em

                li {
                    display = Display.flex
                    padding = .5.em

                    a {
                        color = Colors.text.primary
                        textDecoration = None.none
                        padding = .5.em
                        hover {
                            background = Colors.primary
                            borderRadius = 8.px
                        }
                    }

                    "&.current a" {
                        background = Colors.primary
                        borderRadius = 8.px
                    }
                }
            }
            li {
                className = ClassName("current")
                a {
                    +t("navbar.home")
                    href = "#"
                }
            }
            li {
                a {
                    +t("navbar.articles")
                    href = "#"
                }
            }
            li {
                a {
                    +t("navbar.resume")
                    href = "#"
                }
            }
        }
    }
}
