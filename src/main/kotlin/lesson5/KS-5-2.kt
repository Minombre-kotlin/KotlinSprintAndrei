package org.example.lesson5

const val AGE_OF_MAJORITY: Int = 18

fun main() {
    val welcome: String = "Пожалуйста, введите год вашего рождения"
    println(welcome)
    val userYear = readln().toIntOrNull()
    var currentYear: Int = 2026

    if (userYear == null) {
        println("Введено недопустимое значение. Год должен быть введен цифрами")
    } else if ((currentYear - userYear) < AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else println("Не показывать экран со скрытым контентом")
}