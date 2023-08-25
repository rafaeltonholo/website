package dev.tonholo.resume.features.home.components

import csstype.*
import dev.tonholo.resume.style.Colors
import dev.tonholo.resume.util.WindowBreakpoints
import dev.tonholo.resume.util.definitions.typescript.react_i18next.Trans
import dev.tonholo.resume.util.definitions.typescript.react_i18next.useTranslation
import dev.tonholo.resume.util.definitions.typescript.react_icons.MdFileDownload
import emotion.react.css
import react.ChildrenBuilder
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p

val Profile = FC<Props> {
    val (t) = useTranslation()
    container {
        img {
            css {
                borderRadius = 100.pct
                height = 150.px
            }
            src = "https://secure.gravatar.com/avatar/9c32dd678349834ba86b53dcbc4612b7?size=150"
            alt = "Profile"
        }
        h1 {
            css {
                fontFamily = string("'Eczar', serif")
                fontWeight = 500.unsafeCast<FontWeight>()
                fontSize = 2.5.em
                WindowBreakpoints.MOBILE_SMALL.mediaQuery {
                    fontSize = 2.3.em
                }
            }
            +"Rafael R. Tonholo"
        }
        p {
            css {
                fontSize = 1.em
                color = Colors.accents.primary
            }

            +t("screens.home.info.jobTitle")
        }
        contentSeparator()

        div {
            css {
                textAlign = TextAlign.justify
                p {
                    paddingBottom = .5.em

                    lastChild {
                        paddingBottom = 0.em
                    }
                }
            }
            Trans {
                this.t = t
                i18nKey = "screens.home.info.about"
                repeat(3) {
                    p {
                        +"placeholder"
                    }
                }
            }
        }

        contentSeparator()

        a {
            css {
                padding = Padding(
                    top = 0.em,
                    right = 0.5.em,
                    bottom = 0.5.em,
                    left = 0.5.em,
                )
                color = Color("#939393")
            }
            href = "mailto:rafael@tonholo.dev"
            +"rafael@tonholo.dev"
        }

        a {
            id = "download"
            css {
                textTransform = TextTransform.uppercase
                padding = Padding(vertical = 0.5.em, horizontal = 1.em)
                background = Colors.accents.dark
                textDecoration = "none".unsafeCast<TextDecoration>()
                textAlign = TextAlign.center
                border = Border(
                    width = 1.px,
                    style = LineStyle.solid,
                    color = Colors.accents.border
                )
                borderRadius = 2.em
                display = Display.flex
                alignItems = AlignItems.center
                color = Colors.text.primary
            }
            +"Download CV "
            div {
                css {
                    display = Display.inlineBlock
                    background = Color("#29292d")
                    borderRadius = 100.pct
                    width = 1.8.em
                    height = 1.8.em
                    position = Position.relative
                    marginLeft = 0.5.em
                }
                MdFileDownload {
                    size = 1.5.em
                    css {
                        position = Position.absolute
                        top = 0.15.em
                        left = 0.135.em
                    }
                }
            }
        }
    }
}

private fun ChildrenBuilder.contentSeparator() {
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

private fun ChildrenBuilder.container(children: ChildrenBuilder.() -> Unit) {
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
            background = Colors.primary
            padding = Padding(vertical = 3.em, horizontal = 1.em)
        }

        children()
    }
}
