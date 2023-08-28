package dev.tonholo.website.extension.css

import csstype.ListStyle

object ListStyleExtensions {
    val ListStyle.Companion.disc
        get() = "disc".unsafeCast<ListStyle>()
}