package org.example.lesson7

fun main() {
    val numbers = "0123456789"
    val smallLetters = "abcdefghijklmnopqrstuvwxyz"
    val capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val allSymbols = numbers + smallLetters + capitalLetters

    val minPasswordLength = 6
    println("Введите длину пароля (не менее $minPasswordLength):")
    val passwordLength = readln().toInt()

    if (passwordLength < minPasswordLength) {
        println("Длина пароля должна быть не менее $minPasswordLength")
        return
    }

    var password = ""

    val random = kotlin.random.Random

    for (i in 1..passwordLength) {
        val index = random.nextInt(allSymbols.length)
        password += allSymbols[index]
    }

    println("Сгенерированный пароль: $password")
}
