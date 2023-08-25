package dev.tonholo.resume.features.home.components.skills

import csstype.*
import dev.tonholo.resume.style.Colors
import emotion.react.css
import kotlinx.js.jso
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import kotlin.math.round

external interface ListItemProps : Props {
    var name: String
    var value: Int
}

val ListItem = FC<ListItemProps> { props ->
    div {
        css {
            paddingTop = 1.em

            ".skills" {
                display = Display.flex
                justifyContent = JustifyContent.spaceBetween
            }

            ".progress-bar" {
                width = 100.pct
                height = 5.px
                display = Display.block
                position = Position.relative
                marginTop = 0.2.em
                marginBottom = 1.em

                "&__content" {
                    position = Position.absolute
                    background = Colors.accents.primary
                }
                "&__background" {
                    position = Position.absolute
                    background = Colors.accents.border
                }
            }
        }

        div {
            className = ClassName("skills")
            span {
                +"${props.name}:"
            }
            span {
                +"${round(props.value.toFloat())}%"
            }
        }
        div {
            className = ClassName("progress-bar")
            span {
                className = ClassName("progress-bar progress-bar__background")
            }
            span {
                className = ClassName("progress-bar progress-bar__content")
                style = jso {
                    width = props.value.pct
                }
            }
        }

    }
}
