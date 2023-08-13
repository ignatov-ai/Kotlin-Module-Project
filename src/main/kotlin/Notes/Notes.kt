package Notes

import Menu.linkToString

class Notes(
    val noteName: String,
    val noteText: String
) : linkToString {
    override val textData: String
        get() = noteName
}