package dev.tonholo.resume.features.home.components

import csstype.*
import dev.tonholo.resume.components.contentSeparator
import dev.tonholo.resume.extension.css.ListStyleExtensions.disc
import dev.tonholo.resume.features.home.components.history.HistoryCard
import dev.tonholo.resume.locale.Locale
import dev.tonholo.resume.style.Colors
import dev.tonholo.resume.util.WindowBreakpoints
import dev.tonholo.resume.util.definitions.typescript.react_i18next.useTranslation
import dev.tonholo.resume.util.definitions.typescript.react_i18next.useTranslationWithOptions
import emotion.react.css
import kotlinx.js.jso
import react.ChildrenBuilder
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import kotlin.js.Date

private fun ChildrenBuilder.title(title: String) {
    h2 {
        css {
            textAlign = TextAlign.center
            WindowBreakpoints.TABLET.mediaQuery {
                textAlign = TextAlign.left
            }
        }
        +title
    }
}

val History = FC<Props> {
    val (t) = useTranslation()
    val (tWithOptions) = useTranslationWithOptions()

    div {
        css {
            marginTop = 1.em
            background = Colors.primary
            padding = Padding(
                vertical = 2.em,
                horizontal = 1.em,
            )
            WindowBreakpoints.TABLET.mediaQuery {
                marginTop = 0.em
                marginLeft = 1.em
                flex = "1".unsafeCast<Flex>()
            }

            ul {
                listStyle = None.none
                paddingTop = 1.em

                li {
                    marginBottom = 1.em

                    lastChild {
                        paddingBottom = 0.em
                    }
                }

                "&#work" {
                    "ul.bullet-points" {
                        listStyle = ListStyle.disc
                        marginLeft = 2.em
                    }
                }
            }
        }

        title(t("screens.home.history.work.title"))

        ul {
            id = "work"
            for (index in Locale.Default.screens.home.historySection.work.experiences.indices) {
                HistoryCard {
                    company = t("screens.home.history.work.experiences.${index}.name")
                    descriptionKey = "screens.home.history.work.experiences.${index}.description"
                    title = t("screens.home.history.work.experiences.${index}.title")
                    starting = Date(t("screens.home.history.work.experiences.${index}.starting"))
                    val endingKey = "screens.home.history.work.experiences.${index}.ending"
                    val endingDate = t(endingKey).let {
                        if (it == endingKey) {
                            null
                        } else {
                            Date(it)
                        }
                    }
                    ending = endingDate
                    technologies = tWithOptions(
                        "screens.home.history.work.experiences.${index}.technologies",
                        jso {
                            joinArrays = "+"
                        },
                    ).split("+")
                }
            }
        }

        contentSeparator()

        title(t("screens.home.history.educational.title"))

        ul {
            id = "educational"
            id = "work"
            for (index in Locale.Default.screens.home.historySection.educational.experiences.indices) {
                HistoryCard {
                    company = t("screens.home.history.educational.experiences.${index}.name")
                    description = t("screens.home.history.educational.experiences.${index}.description")
                    title = t("screens.home.history.educational.experiences.${index}.title")
                    starting = Date(t("screens.home.history.educational.experiences.${index}.starting"))
                    val endingKey = "screens.home.history.educational.experiences.${index}.ending"
                    val endingDate = t(endingKey).let {
                        if (it == endingKey) {
                            null
                        } else {
                            Date(it)
                        }
                    }
                    ending = endingDate
                }
            }
        }
    }
}
