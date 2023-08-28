package dev.tonholo.website.features.home.components.history

import csstype.*
import dev.tonholo.website.extension.css.FontWeightExtensions.weight
import dev.tonholo.website.style.Colors
import dev.tonholo.website.util.definitions.typescript.react_i18next.Trans
import dev.tonholo.website.util.definitions.typescript.react_i18next.useTranslation
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.b
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.ul
import kotlin.js.Date

external interface HistoryItemProps : Props {
    var company: String
    var descriptionKey: String?
    var description: String?
    var title: String
    var starting: Date
    var ending: Date?
    var technologies: List<String>?
}

val HistoryCard = FC<HistoryItemProps> { props ->
    val (t) = useTranslation()

    li {
        css {
            paddingBottom = 1.em

            "&:not(:last-child)" {
                borderBottom = Border(
                    width = 1.px,
                    color = Colors.accents.border,
                    style = LineStyle.solid,
                )
            }

            ".period" {
                display = Display.inlineBlock
                border = Border(
                    width = 1.px,
                    color = Colors.accents.gray,
                    style = LineStyle.solid,
                )
                borderRadius = 3.px
                color = Colors.accents.gray
                fontSize = 0.8.em
                fontWeight = 700.weight
                padding = 0.3.em

                "&.present" {
                    borderColor = Colors.accents.primary
                    color = Colors.accents.primary
                }
            }
        }

        div {
            className = ClassName("period ${if (props.ending != null) "" else "present"}")
            span {
                val ending = props.ending?.getFullYear() ?: "Present"

                +"${props.starting.getFullYear()} - $ending"
            }
        }

        h3 {
            css {
                marginTop = 0.3.em
            }
            +props.title
        }

        h5 {
            css {
                color = Colors.text.secondary
                paddingTop = 0.2.em
            }
            +props.company
        }

        div {
            css {
                whiteSpace = WhiteSpace.preLine
                color = Colors.text.secondary
                paddingTop = 0.5.em
                fontSize = 0.9.em
                lineHeight = 1.5.em
            }
            props.descriptionKey?.let { descriptionKey ->
                Trans {
                    this.t = t
                    i18nKey = descriptionKey

                    ul {
                        className = ClassName("bullet-points")
                        repeat(10) {
                            li {
                                +"placeholder"
                            }
                        }
                    }
                }
            }
            props.description?.let {
                +it
            }
        }

        div {
            css {
                display = Display.flex
                fontSize = 0.9.em
                flexWrap = FlexWrap.wrap
                alignItems = AlignItems.center

                b {
                    marginRight = 0.5.em
                    marginBottom = 0.5.em
                }

                span {
                    display = Display.inlineBlock
                    border = Border(
                        width = 1.px,
                        color = Colors.accents.dark,
                        style = LineStyle.solid,
                    )
                    borderRadius = 3.px
                    color = Colors.accents.primary
                    fontSize = 0.8.em
                    padding = 0.3.em
                    marginRight = 0.8.em
                    marginBottom = 0.5.em
                }
            }
            props.technologies?.let { techs ->
                b {
                    +t("screens.home.history.work.technologiesUsed")
                }

                for (tech in techs) {
                    span {
                        +tech
                    }
                }
            }
        }
    }
}
