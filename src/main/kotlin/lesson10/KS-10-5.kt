package org.example.lesson10

const val CORRECT_LOGIN = "Buyer"
const val CORRECT_PASSWORD = "12345"

fun main() {
    println("Для авторизации в магазине, пожалуйста, введите свои данные. Введите логин: ")
    val userLogin: String? = readln()

    println("Введите пароль: ")
    val userPassword: String? = readln()

    val token = acceptLoginAndPassword(userLogin, userPassword)

    if (token != null) {
        val cart = getCart(token)
        println("Содержимое вашей корзины: ${cart.joinToString(", ")}")
    } else {
        println("Неудачная попытка авторизации")
    }
}

fun acceptLoginAndPassword(userLogin: String?, userPassword: String?): String? {
    var token: String? = ""

    if (userLogin == CORRECT_LOGIN && userPassword == CORRECT_PASSWORD) {
        for (i in 0 until 32) {
            val randomSymbol = ("01234567abcdefghijklmnopqrstuvwxyz").random()
            token += randomSymbol
        }
    } else {
        token = null
    }
    return token
}

fun getCart(token: String): List<String> {
    val cart = listOf("Телевизор", "ТВ приставка", "Пульт")
    return cart
}