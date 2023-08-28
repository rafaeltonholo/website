@file:JsModule("react-icons/md")

package dev.tonholo.website.util.definitions.typescript.react_icons

import org.w3c.dom.svg.SVGElement
import react.FC
import react.dom.svg.SVGAttributes

external interface IconBaseProps : SVGAttributes<SVGElement> {
    var size: dynamic
    var title: String?
}

external val MdFileDownload: FC<IconBaseProps>
