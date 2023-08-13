package Menu

import java.util.Scanner

abstract class Menu {
    abstract val menuName: String

    //добавит обработчик выхода за границы массива данных
    fun choiseInput(maxLength: Int): Int {
        while (true) {
            print("\nВведите номер пункта: ")
            val choiseInput = Scanner(System.`in`).nextLine()

            try {
                var choise = choiseInput.toIntOrNull()
                if (choise != null) {
                    if (choise > maxLength - 1) {
                        println("Ошибка: нет такого пункта меню")
                    } else {
                        return choise
                    }
                } else {
                    println("Ошибка: введено не число")
                }
            } catch (e: Exception) {
                println("Ошибка: ${e.message}")
            }

        }
    }

    //Добавил параметризацию для разных типов данных (архивы, заметки)
    fun <T : linkToString> ShowMenu(menuList: MutableList<T>) {
        println(menuName)

        //Поменял тип цикла для более удобного вывода данных
        for (i in 0..menuList.size - 1) {
            println("$i.) ${menuList[i].textData}")
        }
    }
}

//интерфейс для отображения названий пунктов меню в виде строки, а не ссылки
interface linkToString {
    val textData: String
}
