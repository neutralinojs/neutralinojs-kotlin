package neutralino

import neutralino.core.*

object OS {

    const val WINDOWS = "Windows"

    const val LINUX = "Linux"

    const val MAC_OS = "MacOS(Darwin)"
}

external var NL_OS: String

external var NL_NAME: String

external var NL_PORT: String

external var NL_MODE: String

external var NL_VERSION: String

external interface NeutralinoJs {

    var app: App

    var filesystem: Filesystem

    var settings: Settings

    var os: Os

    var computer: Computer

    var storage: Storage

    fun init(options: InitOptions)

    var debug: Debug
}

external var Neutralino: NeutralinoJs