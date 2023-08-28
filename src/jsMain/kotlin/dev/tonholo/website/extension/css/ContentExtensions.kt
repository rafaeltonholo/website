package dev.tonholo.website.extension.css

import csstype.Content

object ContentExtensions {
    fun String.asContent(): Content = "'$this'".unsafeCast<Content>()
}
