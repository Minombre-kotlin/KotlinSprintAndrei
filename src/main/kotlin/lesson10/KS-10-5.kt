package org.example.lesson10

const val CORRECT_LOGIN = "Buyer"
const val CORRECT_PASSWORD = "12345"

fun main() {
    println("Для авторизации в магазине, пожалуйста, введите свои данные. Введите логин: ")
    val userLogin: String = readln()

    println("Введите пароль: ")
    val userPassword: String = readln()

    val token = authenticateUser(userLogin, userPassword)

    if (token != null) {
        val cart = verifyCredentials(token)
        println("Содержимое вашей корзины: ${cart.joinToString(", ")}")
    } else {
        println("Неудачная попытка авторизации")
    }
}


fun authenticateUser(userLogin: String, userPassword: String): String? {
    var token: String? = null

    if (userLogin == CORRECT_LOGIN && userPassword == CORRECT_PASSWORD) {
        for (i in 0 until 32) {
            val letters = 'A'..'Z'
            val numbers = '0'..'7'
            val randomSymbol = ("$letters + $numbers").random()
            token += randomSymbol
        }
    } else {
        token = null
    }
    return token
}

fun verifyCredentials(token: String): List<String> {
    return listOf("Телевизор", "ТВ приставка", "Пульт")
}