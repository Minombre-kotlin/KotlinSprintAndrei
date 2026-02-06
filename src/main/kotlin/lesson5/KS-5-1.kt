package org.example.lesson5

fun main() {
    val humanOrBot: String = "Пожалуйста, подтвердите, что вы не бот. Для этого напишите, сколько будет 2 + 2"
    val correctAnswer: Int = 4
    val successfulLogin: String = "Добро пожаловать!"
    val accessDenied: String = "Доступ запрещен."

    println(humanOrBot)
    val answer = readln().toIntOrNull()

    if (answer == correctAnswer) {
        println(successfulLogin)
    } else {
        println(accessDenied)
    }
}