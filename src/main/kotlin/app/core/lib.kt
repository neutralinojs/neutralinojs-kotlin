package app.core

import neutralino.Neutralino
import kotlin.browser.window

class AppLib {

    fun showSettings() {
        Neutralino.settings.getSettings({
            window.alert(JSON.stringify(it))
        }, {

        })
    }
}