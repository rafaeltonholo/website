package dev.tonholo.website.features.home.components

import csstype.*
import dev.tonholo.website.components.contentSeparator
import dev.tonholo.website.features.home.components.skills.ListItem
import dev.tonholo.website.style.Colors
import dev.tonholo.website.util.WindowBreakpoints
import dev.tonholo.website.util.definitions.typescript.react_i18next.useTranslation
import emotion.react.css
import kotlinx.browser.document
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.useState

private val skills = setOf(
    "Android" to 95,
    "Kotlin" to 90,
    "Dagger2/Hilt" to 75,
    "Jetpack Compose" to 60,
    "git" to 100,
    "TypeScript" to 90,
    "JavaScript" to 95,
    "Node.JS" to 75,
    "Java" to 85,
    "Docker" to 60,
    "Unity3D" to 45,
    "Swift" to 40,
)

var seeMoreClass: String? = null

val Skills = FC<Props> {
    val (t) = useTranslation()
    val languages = setOf(
        t("screens.home.skills.languages.en") to 85,
        t("screens.home.skills.languages.pt") to 100,
    )
    var isExpanded by useState(false)

    div {
        css {
            marginTop = 1.em
            background = Colors.primary
            padding = Padding(
                vertical = 2.em,
                horizontal = 1.em,
            )
            width = 100.pct
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center

            "#see-more" {
                "&.expanded" {
                    height = 712.px
                }
            }
        }

        h2 {
            +t("screens.home.skills.languages.title")
        }

        div {
            css { width = 100.pct }
            languages.map { (name, value) ->
                ListItem {
                    this.name = name
                    this.value = value
                }
            }
        }

        contentSeparator()

        h2 {
            +t("screens.home.skills.programingLanguages.title")
        }

        div {
            id = "see-more"

            css(ClassName(if(isExpanded) "expanded" else "")) {
                width = 100.pct
                height = 230.px
                overflow = Overflow.hidden
                transitionProperty = "height".unsafeCast<TransitionProperty>()
                transitionTimingFunction = TransitionTimingFunction.ease
                transitionDuration = 0.4.s
                WindowBreakpoints.DESKTOP.mediaQuery {
                    height = 712.px
                }
            }

            skills.map { (name, value) ->
                ListItem {
                    this.name = name
                    this.value = value
                }
            }
        }

        button {
            css {
                margin = Margin(vertical = 2.em, horizontal = Auto.auto)
                border = Border(
                    width = 1.px,
                    color = Colors.accents.border,
                    style = LineStyle.solid,
                )
                borderRadius = 3.px
                background = NamedColor.transparent
                color = Colors.accents.primary
                padding = 1.em
                WindowBreakpoints.DESKTOP.mediaQuery {
                    display = None.none
                }
            }
            onClick = { _ ->
                isExpanded = !isExpanded
                document.querySelector("#see-more")?.let { seeMore ->
                    if (seeMoreClass == null) {
                        seeMoreClass = seeMore.className
                    }

                    seeMoreClass?.let { className ->
                        seeMore.className = "$className ${if (isExpanded) "isExpanded" else ""}"
                    }
                }
            }
            if (isExpanded) {
                +t("screens.home.skills.programingLanguages.ctaShowLess")
            } else {
                +t("screens.home.skills.programingLanguages.ctaShowMore")
            }
        }
    }
}
