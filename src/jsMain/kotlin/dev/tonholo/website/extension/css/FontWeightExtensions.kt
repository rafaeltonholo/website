package dev.tonholo.website.extension.css

import csstype.FontWeight

object FontWeightExtensions {
    val Int.weight: FontWeight
        get() = this.unsafeCast<FontWeight>()
}