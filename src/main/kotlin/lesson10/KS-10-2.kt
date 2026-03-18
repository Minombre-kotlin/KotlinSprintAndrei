package org.example.lesson10

fun main() {
    println("Придумайте логин: ")
    val userLogin = readln()

    println("Придумайте пароль: ")
    val userPassword = readln()

    dataValidation(userLogin, userPassword)
}

fun dataValidation(userLogin: String?, userPassword: String?) {
    if (userLogin == null || userPassword == null
        || userLogin.isEmpty() || userPassword.isEmpty()
    ) {
        println("Ввод прерван. Попробуйте ввести снова")
        return
    } else if (userLogin.length < 4 || userPassword.length < 4) {
        println("Логин или пароль недостаточно длинные")
        return
    } else {
        println(
            """
            Ваши данные:
            Логин: $userLogin
            Пароль: $userPassword
        """.trimIndent()
        )
    }
    return
}