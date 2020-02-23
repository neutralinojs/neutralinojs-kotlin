import app.core.AppLib
import neutralino.*
import neutralino.core.init
import kotlin.browser.document

var appLib = AppLib()

val myapp = jsObject {
    myfunction = {
        document.getElementById("info")?.innerHTML = """
            $NL_NAME is running on port $NL_PORT inside $NL_OS<br/><br/>
            <span>v$NL_VERSION</span>
        """.trimIndent()
    }
}

fun main() {
    Neutralino.init {
        load = {
            myapp.myfunction()
            appLib.showSettings()
        }
        pingSuccessCallback = {

        }
        pingFailCallback = {

        }
    }
}

inline fun jsObject(init: dynamic.() -> Unit): dynamic {
    val o = js("{}")
    init(o)
    return o
}