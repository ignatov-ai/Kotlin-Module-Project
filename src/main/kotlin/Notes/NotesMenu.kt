package Notes

import Menu.Menu
import java.util.Scanner

class NotesMenu : Menu() {
    override val menuName: String = "\nМеню \"ЗАМЕТКИ\""

    val notesMenu: MutableList<Notes> = mutableListOf(
        Notes("Создать заметку", ""),
        Notes("К списку архивов", "")
    )

    fun noteAdd(){
        println("\nВведите название")
        val noteName = Scanner(System.`in`).nextLine()
        println("Введите текст")
        val noteText = Scanner(System.`in`).nextLine()
        notesMenu.add(Notes(noteName, noteText))
    }

    //
    fun menuWorkerNotes(){
        if (notesMenu.size == 0){
            println("Нет заметок")
        }
        while(true){
            ShowMenu(notesMenu)
            val choise = choiseInput()

            when(choise){
                0 -> noteAdd()
                1 -> return
                else -> {
                    println("\nИмя заметки: ${notesMenu[choise].noteName}")
                    println("Текст заметки: ${notesMenu[choise].noteText}")
                }
            }
        }
    }
}