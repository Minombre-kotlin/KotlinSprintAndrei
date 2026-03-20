package org.example.lesson10

fun main() {
    println("Для создания пароля вам необходимо указать количество символов. Например: 5 ")
    val userPasswordLength = readln()!!.toInt()

    val password = passwordGeneration(userPasswordLength)
    println("Ваш пароль: $password")
}

fun passwordGeneration(userPasswordLength: Int): String {
    val passwordNumbers = 0..9
    val passwordLetters = " !\"#$%&'()*+,-./"
    var password = ""

    for (i in 0 until userPasswordLength) {
        if (i % 2 == 0) {
            password += passwordNumbers.random()
        } else {
            password += passwordLetters.random()
        }
    }
    return password
}