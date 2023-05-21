package Archive

import Menu.linkToString
import Notes.Notes

class Archive (
    val archiveName: String,
    val notesList: MutableList<Notes>) : linkToString {
    override val textData: String
        get() = archiveName
}