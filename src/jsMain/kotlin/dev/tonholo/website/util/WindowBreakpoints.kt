package dev.tonholo.website.util

import csstype.Selector

enum class WindowBreakpoints(
    val size: Int,
    val mediaQuery: Selector,
) {
    MOBILE_SMALL(
        size = 320,
        mediaQuery = Selector("@media screen and (max-width: 320px)"),
    ),
    TABLET(
        size = 768,
        mediaQuery = Selector("@media screen and (min-width: 768px)"),
    ),
    TABLET_XL(
        size = 1024,
        mediaQuery = Selector("@media screen and (min-width: 1024px)"),
    ),
    DESKTOP(
        size = 1300,
        mediaQuery = Selector("@media screen and (min-width: 1300px)"),
    ),
}