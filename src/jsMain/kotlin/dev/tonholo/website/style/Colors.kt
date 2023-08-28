package dev.tonholo.website.style

import csstype.Color

data object Colors : AppColor {
    override val primary: Color = Color("#32333d")
    override val secondary: Color = Color("#27272f")
    val accents = object : AppColor.Accents {
        override val primary = Color("#1EB980")
        override val dark = Color("#045D56")
        override val orange = Color("#FF6859")
        override val yellow = Color("#FFCF44")
        override val purple = Color("#B15DFF")
        override val blue = Color("#72DEFF")
        override val gray = Color("#686871")
        override val border = Color("#2c2c2f")
    }
    val text = object : AppColor.Text {
        override val primary = Color("#FFFFFF")
        override val secondary = Color("#c7c7c7")
    }
}

sealed interface AppColor {
    val primary: Color
    val secondary: Color

    interface Accents {
        val primary: Color
        val dark: Color
        val orange: Color
        val yellow: Color
        val purple: Color
        val blue: Color
        val gray: Color
        val border: Color
    }

    interface Text : AppColor
}
