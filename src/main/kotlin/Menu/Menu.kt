package Menu

import Archive.Archive
import Notes.Notes
import java.util.Scanner

abstract class Menu {
    abstract val menuName: String

    fun choiseInput(): Int{
        while(true){
            print("\nВведите номер пункта: ")
            val choiseInput = Scanner(System.`in`).nextLine()
            try {
                val choise = choiseInput?.toIntOrNull()
                if (choise != null) {
                    return choise
                } else {
                    println("Ошибка: введено не число")
                }
            } catch (e: Exception) {
                println("Ошибка: ${e.message}")
            }
        }
    }

    //Добавил параметризацию для разных типов данных (архивы, заметки)
    fun <T> ShowMenu (menuList: MutableList<T>){
        println(menuName)

        //Поменял тип цикла для более удобного вывода данных
        for(i in 0..menuList.size - 1){
            println("$i.) ${menuList.get(i)}")
        }
    }
}