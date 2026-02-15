package org.example.lesson6

import kotlin.random.Random

fun main() {
    var number1 = Random.nextInt(1, 10)
    var number2 = Random.nextInt(1, 10)
    val sum: Int = number1 + number2
    var isGuessed: Boolean = false
    var userAttempt: Int = 3

    println("Для входа в приложение докажите, что вы не бот. Для этого решите пример:$number1 + $number2")

    while (userAttempt > 0 && !isGuessed) {
        println("Попытка №${4 - userAttempt} ")

        var userSum = readln().toInt()
        userAttempt--

        if (userSum == sum) {
            println("Добро пожаловать!")
            isGuessed = true
        }
    }
    if (!isGuessed) {
        println("Доступ запрещён")
    }
}