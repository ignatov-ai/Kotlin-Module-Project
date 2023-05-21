package Menu

import Archive.Archive
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

    fun ShowMenu (menuList: MutableList<Archive>){
        println(menuName)
        var i: Int = 0
        menuList.forEach{
            println("$i.) ${it.archiveName}")
            i++
        }
    }
}