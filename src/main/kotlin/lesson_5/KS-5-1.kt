package org.example.lesson_5

fun main() {
    val firstNumber: Int = 2
    val secondNumber: Int = 2
    val humanOrBot: String = "Пожалуйста, подтвердите, что вы не бот. Для этого напишите, сколько будет $firstNumber + $secondNumber"
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