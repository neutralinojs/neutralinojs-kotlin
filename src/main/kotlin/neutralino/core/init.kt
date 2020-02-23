package neutralino.core

import neutralino.NeutralinoJs

class InitOptions {

    var load: (() -> Unit)? = null

    var pingSuccessCallback: (() -> Unit)? = null

    var pingFailCallback: (() -> Unit)? = null
}

inline fun NeutralinoJs.init(options: InitOptions.() -> Unit) {
    init(InitOptions().apply(options))
}