package org.example.lesson10

const val LENGTH: Int = 4

fun main() {
    println("Придумайте логин: ")
    val userLogin = readln()

    println("Придумайте пароль: ")
    val userPassword = readln()

    val isValidation = dataValidation(userLogin, userPassword)

    if (isValidation) {
        println(
            """
            Ваши данные:
            Логин: $userLogin
            Пароль: $userPassword
        """.trimIndent()
        )
    } else {
        println("Ошибка: логин или пароль не соответствуют длине")
    }
}

fun dataValidation(userLogin: String?, userPassword: String?): Boolean {
    if (userLogin == null || userPassword == null
        || userLogin.isEmpty() || userPassword.isEmpty()
    ) {
        return false
    } else if (userLogin.length < LENGTH || userPassword.length < LENGTH) {
        println("Логин или пароль недостаточно длинные")
        return false
    } else {
        return true
    }
}