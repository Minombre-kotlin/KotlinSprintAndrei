package org.example.lesson7

fun main() {
    val numbers = '0'..'9'
    val smallLetters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val allSymbols = numbers + smallLetters + capitalLetters

    val minPasswordLength = 6
    println("Введите длину пароля (не менее $minPasswordLength):")
    val passwordLength = readln().toInt()

    if (passwordLength < minPasswordLength) {
        println("Длина пароля должна быть не менее $minPasswordLength")
        return
    }

    val random = kotlin.random.Random
    val passwordSymbols = mutableListOf<Char>()

    passwordSymbols += numbers.random()
    passwordSymbols += smallLetters.random()
    passwordSymbols += capitalLetters.random()

    for (i in 3 until passwordLength) {
        passwordSymbols += allSymbols.random()
    }
    passwordSymbols.shuffle()
    val password = passwordSymbols.joinToString("")
    println("Сгенерированный пароль: $password")
}
