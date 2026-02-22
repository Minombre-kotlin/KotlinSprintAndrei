package org.example.lesson7

fun main() {
    val minNumber = 0
    val maxNumber = 6
    var numers = 0..9
    var letters = 'a'..'z'
    val password = StringBuilder()

    for (i in minNumber until maxNumber) {
        if (i % 2 == 0) {
            val randomNumber = numers.random()
            password.append(randomNumber)
        } else {
            val randomLetter = letters.random()
            password.append(randomLetter)
        }
    }
    println(password.toString())
}