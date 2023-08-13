package Notes

import Menu.Menu
import java.util.Scanner

class NotesMenu : Menu() {
    override val menuName: String = "\nМеню \"ЗАМЕТКИ\""

    fun noteAdd(notesMenu: MutableList<Notes>) {
        println("\nВведите название")
        val noteName = Scanner(System.`in`).nextLine()
        if (noteName == "") {
            println("Ошибка: пустой ввод")
        } else {
            println("Введите текст")

            val noteText = Scanner(System.`in`).nextLine()
            if (noteText == "") {
                println("Ошибка: пустой ввод")
            } else {
                notesMenu.add(notesMenu.size, Notes(noteName, noteText))
            }
        }
    }

    fun menuWorkerNotes(notesMenu: MutableList<Notes>) {
        if (notesMenu.size == 0) {
            notesMenu.add(Notes("Создать заметку", ""))
            notesMenu.add(Notes("К списку архивов", ""))
        }
        while (true) {
            ShowMenu(notesMenu)
            //доработна проверка ввода
            val choise = choiseInput(notesMenu.size)

            when (choise) {
                0 -> noteAdd(notesMenu)
                1 -> return
                else -> {
                    println("\nИмя заметки: ${notesMenu[choise].noteName}")
                    println("Текст заметки: ${notesMenu[choise].noteText}")
                }
            }
        }
    }
}