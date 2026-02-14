package org.example.lesson6

fun main() {
    println("Для создания таймера введите, пожалуйста, количество секунд, которые необходимо засечь")
    var numberOfSeconds = readln().toIntOrNull()

    if (numberOfSeconds == null) {
        println("Для таймера необходимо ввести число")
    } else
        while (numberOfSeconds > 0) {
            println("Осталось ${numberOfSeconds--} секунд")
            Thread.sleep(1000)
        }
    println("Время вышло")
}