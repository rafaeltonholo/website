package dev.tonholo.resume.components

import csstype.*
import dev.tonholo.resume.extension.css.ContentExtensions.asContent
import dev.tonholo.resume.style.Colors
import dev.tonholo.resume.util.definitions.typescript.i18next.i18next
import emotion.react.css
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div

private fun PropsWithClassName.languageButtonCss() {
    css {
        border = None.none
        background = NamedColor.transparent
        color = Colors.accents.primary
        padding = 0.5.em
        cursor = Cursor.pointer
        marginLeft = 0.2.em

        hover {
            color = Colors.accents.dark
        }

        firstChild {
            marginRight = 1.em
            after {
                content = "|".asContent()
                position = Position.relative
                left = 1.em
                top = (-1).px
            }
        }
    }
}

private fun handleClick(language: String) {
    i18next.changeLanguage(language).then {
        console.log("Language changed to $language")
    }
}

val LanguageChanger = FC<Props> {
    div {
        button {
            languageButtonCss()

            onClick = {
                handleClick("en")
            }
            +"EN"
        }
        button {
            languageButtonCss()

            onClick = {
                handleClick("pt")
            }
            +"PT-BR"
        }
    }
}
