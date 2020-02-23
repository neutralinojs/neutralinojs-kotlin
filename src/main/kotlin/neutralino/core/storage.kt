package neutralino.core

class StorageData {

    lateinit var bucket: String

    lateinit var content: Any
}

external interface Storage {

    fun putData(data: StorageData, s: Success<dynamic>, e: Error)

    fun getData(bucket: String, s: Success<Any?>, e: Error)
}

inline fun Storage.putData(init: StorageData.() -> Unit, noinline s: Success<dynamic>, noinline e: Error) {
    putData(StorageData().apply(init), s, e)
}