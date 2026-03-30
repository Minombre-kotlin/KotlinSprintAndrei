package org.example.lesson11

class User(val id: Int, var login: String, var password: String, var mail: String)

fun main() {
    val user1 = User(1, "Vasilich", "12345", "user1@gmail.com")
    val user2 = User(2, "Petrovich", "54321", "user2@gmail.com")
    println("Данные 1-ого пользователя: ид: ${user1.id}, логин: ${user1.login}, пароль: ${user1.password}, почта: ${user1.mail}")
    println("Данные 2-ого пользователя: ид: ${user2.id}, логин: ${user2.login}, пароль: ${user2.password}, почта: ${user2.mail}")
}