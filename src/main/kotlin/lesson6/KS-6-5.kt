package org.example.lesson6

fun main() {
    var remainingAttempts = 3

    do {
        var number1 = (1..9).random()
        var number2 = (1..9).random()
        println("Для входа в приложение докажите, что вы не бот. Для этого решите пример и напишите ответ: $number1 + $number2")
        val userSum = readln().toInt()
        if (userSum == number1 + number2) {
            println("Добро пожаловать!")
            return
        } else {
            remainingAttempts--
            if (remainingAttempts > 0) {
                println("Доступ запрещён. Оставшееся число попыток: $remainingAttempts")
            }
        }
    } while (remainingAttempts > 0)
    println("Попытки закончились")
}