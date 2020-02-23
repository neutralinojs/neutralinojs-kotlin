package neutralino.core

external class WindowData {

    var width: Int

    var height: Int

    var fullscreen: Boolean
}

external class SettingsData {

    var appname: String

    var appport: Int

    var mode: String

    var window: WindowData
}

external interface Settings {

    fun getSettings(s: Success<SettingsData?>, e: Error)
}