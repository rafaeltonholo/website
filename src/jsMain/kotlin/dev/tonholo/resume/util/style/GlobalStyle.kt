package dev.tonholo.resume.util.style

import dev.tonholo.resume.style.Colors
import kotlinx.browser.document
import kotlinx.html.dom.append
import kotlinx.html.js.style
import kotlinx.html.unsafe

fun globalStyle() {
    document.head?.append?.style {
        unsafe {
            raw(
                """
  * {
    margin: 0;
    padding: 0;
    outline: 0;
    box-sizing: border-box;
  }

  body {
    font-family: 'Roboto Condensed', sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    background: ${Colors.secondary};
    color: ${Colors.text.primary};
  }

  html body #root {
    width: 100%;
    height: 100%;
  }       
"""
            )
        }
    }
}
