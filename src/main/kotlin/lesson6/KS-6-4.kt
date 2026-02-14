package org.example.lesson6

import kotlin.random.Random

fun main() {
    println("Отгадай число от 1 до 9. Есть 5 попыток")
    var userNumber: Int
    val correctNumber = Random.nextInt(1, 10)
    var remainingAttempts: Int = 5
    var isGuessed = false

    while (remainingAttempts > 0 && !isGuessed) {
        println("Попытка №${6 - remainingAttempts}: ")

        userNumber = readln().toInt()
        remainingAttempts--

        if (userNumber == correctNumber) {
            println("Это была великолепная игра!")
            isGuessed = true
        } else
            println("К сожалению, вы не угадали число. Оставшееся число попыток: $remainingAttempts")

    }

    if (!isGuessed) {
        println("Было загадано число $correctNumber")
    }
}
