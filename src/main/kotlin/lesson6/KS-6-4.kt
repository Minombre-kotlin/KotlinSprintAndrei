package org.example.lesson6

fun main() {
    println("Отгадай число от 1 до 9. На это даётся 5 попыток.")
    val correctNumber = (1..9).random()
    var remainingAttempts = 5

    do {
        println("Введи число. Осталось $remainingAttempts попыток")
        val userNumber = readln().toInt()

        if (userNumber == correctNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            remainingAttempts--
            if (remainingAttempts > 0) {
                println("К сожалению, ты не отгадал число. Оставшееся число попыток : $remainingAttempts")
            }
        }
    } while (remainingAttempts > 0)


    println("Попытки закончились. Было загадано число $correctNumber")
}