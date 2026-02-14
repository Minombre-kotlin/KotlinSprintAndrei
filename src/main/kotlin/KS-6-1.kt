package org.example

fun main() {
    println("Для входа на сайт придумайте логин")
    val login = readln()
    println("Отлично. А теперь придумайте пароль")
    val password = readln()
    var loginAuthentication: String
    var passwordAuthentication: String

    do {
        println("Для авторизации введите, пожалуйста, придуманный логин: ")
        loginAuthentication = readln()
        println("А теперь введите придуманный ранее пароль ")
        passwordAuthentication = readln()

        if (loginAuthentication != login || passwordAuthentication != password) {
            println("Введённый логин или пароль не верны. Пожалуйста, проверьте корректность введенных данных и повторите попытку входа")
        }
    } while (loginAuthentication != login || passwordAuthentication != password)

    println("Успешный вход")
}