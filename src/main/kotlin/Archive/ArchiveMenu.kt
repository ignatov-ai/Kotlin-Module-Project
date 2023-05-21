package Archive

import Menu.Menu
import Notes.Notes
import Notes.NotesMenu
import java.util.Scanner

class ArchiveMenu: Menu() {
    override val menuName: String = "\nМеню \"АРХИВЫ\""

    val archiveMenu: MutableList<Archive> = mutableListOf(
        Archive("Создать архив", mutableListOf()),
        Archive("Выйти", mutableListOf()))

    val notesMenu = NotesMenu()

    fun arhiveAdd(){
        println("Введите название")
        val archiveName = Scanner(System.`in`).nextLine()
        archiveMenu.add(archiveMenu.size, Archive(archiveName, mutableListOf()))
    }

    //добавил отсылку к списку заметок определенного архива
    fun menuWorkerArhives(): MutableList<Notes>{
        while(true){
            ShowMenu(archiveMenu)
            //доработна проверка ввода
            val choise = choiseInput(archiveMenu.size)

            when(choise){
                0 -> arhiveAdd()
                1 -> {
                    println("\nДо новых встреч!")
                    System.exit(0)
                }
                else -> notesMenu.menuWorkerNotes()
            }
        }
    }
}