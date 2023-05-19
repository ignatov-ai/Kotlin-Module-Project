import java.util.Scanner

fun main(args: Array<String>) {

    val archiveSelectLevel: MutableList<String> = mutableListOf("1. Выбрать архив","2. Создать архив", "3. Выйти из приложения")
    val archiveOpenLevel: MutableList<String> = mutableListOf("1. Выбрать заметку","2. Создать заметку", "3. Вернуться к архивам")
    val noteOpenLevel: MutableList<String> = mutableListOf("1. Посмотреть заметку","2. Вернуться к заметкам")

    val menu = Menu(archiveSelectLevel)
    menu.showMenuLevel()
}

class Menu(val menuList: MutableList<Pair<String,()->Unit>>){

    fun showMenuLevel(){
        println("Выберите пункт меню:")
        menuList.forEach{println(it)}
    }

    fun choiseMenuLevel(choise: Int): Boolean{
        if (choise < 1 || choise > menuList.size){
            println("Нет такого пункта в меню")
            return false
        }
        val selectedMenu = menuList[choise]
        selectedMenu.second.invoke()
        return true
    }
}