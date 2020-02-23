package neutralino.core

external class ExitData {

    var message: String
}

external interface App {

    fun exit(s: Success<ExitData?>, e: Error)
}