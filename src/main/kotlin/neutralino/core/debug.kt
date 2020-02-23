package neutralino.core

object LogType {

    const val INFO = "INFO"

    const val ERROR = "ERROR"

    const val WARN = "WARN"
}

external class LogData {

    var message: String
}

external interface Debug {

    fun log(type: String, message: String, s: Success<LogData?>, e: Error)
}