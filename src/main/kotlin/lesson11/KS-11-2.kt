package org.example.lesson11

class User2(
    val id: Int,
    var login: String,
    var password: String,
    var mail: String,
    var bio: String = "Отсутствует",
) {

    fun displayUserInformation() {

        println("Данные пользователя $login:")
        println()
        println("ИД: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Почта: $mail")
        println("Информация о себе: $bio")
        println()

    }

    fun readingTextFromTheConsole() {

        println("Пожалуйста, введите информацию о пользователе $login. Например: \"Мужчина в самом расцвете сил\"")
        bio = readln()

    }

    fun changePassword() {

        println("Пожалуйста, замените пароль у пользователя $login. Для этого сначала введите старый пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            println("Верно! Введите новый пароль: ")

            val newPassword = readln()
            password = newPassword

            println("Ваш пароль успешно изменён!")
        } else {
            println("Ваш старый пароль введен не верно! Пароль остался прежним.")
        }
    }
}

fun main() {
    val user1 = User2(1, "Alexandr", "12345", "alexandr@gmail.com")
    val user2 = User2(2, "Dmitriy", "54321", "dmitriy@gmail.com")


    user1.displayUserInformation()
    user2.displayUserInformation()

    user1.changePassword()
    println()
    user2.changePassword()

    val user3 = User2(3, "Petr", "12345", "petr@gmail.com")
    user3.displayUserInformation()
    println()
    user3.readingTextFromTheConsole()
    println()
    user3.changePassword()
    println()
    user3.displayUserInformation()

}