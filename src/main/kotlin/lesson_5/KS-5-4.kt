package org.example.lesson_5

fun main() {
    val userNameCorrect: String = "Zaphod"
    val passwordCorrect: String = "PanGalactic"

    println("Не хотелось бы вас утруждать, но это необходимо уточнить: пользователь зарегистрирован в системе? Введите true или false")
    var registeredOrNot = readln().toBoolean()
    val registered: Boolean = true

    if (registeredOrNot == registered) {
        println("Прекрасно. Введите, пожалуйста, имя пользователя")
        var userName = readln()
        if (userName == userNameCorrect) {
            println("И ещё нужен пароль")
        }
        val password = readln()
        if (password == passwordCorrect) {
            println(
                """
                Ваши данные проверены, и о, чудо, они верны... 
                Пользователь $userNameCorrect, вам разрешено входить на борт корабля "Heart of Gold".
                Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] 
                Надеюсь, вам понравится пребывание здесь больше, чем мне."
            """.trimIndent()
            )
        }
    } else {
        println("Увы, но сначала вам необходимо зарегистрироваться в системе")
    }
}