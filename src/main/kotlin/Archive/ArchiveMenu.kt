package Archive

import Menu.Menu
import java.util.Scanner

class ArchiveMenu: Menu() {
    override val menuName: String = "Меню \"АРХИВЫ\""

    val archiveMenu: MutableList<Archive> = mutableListOf(
        Archive("Создать архив"),
        Archive("Выйти"))

    fun arhiveAdd(){
        println("Введите название")
        val archiveName = Scanner(System.`in`).nextLine()
        archiveMenu.add(archiveMenu.size, Archive(archiveName))
    }

    fun menuWorker(){
        while(true){
            ShowMenu(archiveMenu)
            val choise = choiseInput()

            when(choise){
                0 -> arhiveAdd()
                1 -> System.exit(0)
            }
        }
    }
}