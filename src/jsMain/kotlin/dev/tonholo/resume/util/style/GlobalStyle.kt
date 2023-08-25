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
  @import url('https://fonts.googleapis.com/css2?family=Eczar:wght@400;500;600&display=swap');
  @import url('https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,400;0,700;1,400;1,700&display=swap');
                    
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
""".trimMargin()
            )
        }
    }
}
