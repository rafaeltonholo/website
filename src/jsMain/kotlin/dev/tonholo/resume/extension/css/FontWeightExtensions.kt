package dev.tonholo.resume.extension.css

import csstype.FontWeight

object FontWeightExtensions {
    val Int.weight: FontWeight
        get() = this.unsafeCast<FontWeight>()
}