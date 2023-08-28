package dev.tonholo.website

import dev.tonholo.website.components.LanguageChanger
import dev.tonholo.website.components.NavBar
import dev.tonholo.website.features.home.Home
import react.FC
import react.Props

val App = FC<Props> {
    LanguageChanger()
    NavBar()
    Home()
}