package org.example.lesson7

fun main() {
    val codeRange = 1000..9999
    val authorizationCodeSMS = codeRange.random()
    val correctCode: Boolean = true

    println("Авторизуйтесь в программе с помощью кода из смс. Ваш код: $authorizationCodeSMS")

    while (correctCode) {
        println("Пожалуйста, введите его в поле ниже:")
        val userCode = readln().toInt()

        if (userCode != authorizationCodeSMS) {
            println("Введенный код неверный. Повторите попытку авторизации с помощью кода из смс.")
        } else {
            println("Поздравляем! Вы успешно авторизовались в программе!")
            break
        }
    }
}