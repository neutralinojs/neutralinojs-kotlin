package neutralino.core

object FileType {

    const val DIRECTORY = "directory"

    const val FILE = "file"
}

external class FileData {

    var name: String

    var type: String
}

external class DirectoryData {

    var files: Array<FileData>
}

external class FilesystemData {

    var stdout: String
}

external interface Filesystem {

    fun createDirectory(dirName: String, s: Success<FilesystemData?>, e: Error)

    fun removeDirectory(dirName: String, s: Success<FilesystemData?>, e: Error)

    fun readDirectory(path: String, s: Success<DirectoryData?>, e: Error)

    fun writeFile(fileName: String, content: String, s: Success<FilesystemData?>, e: Error)

    fun readFile(fileName: String, s: Success<FilesystemData?>, e: Error)

    fun removeFile(fileName: String, s: Success<FilesystemData?>, e: Error)
}