fun main() {
    println("Давайте сыграем в игру. Для этого бросьте кости. Выигрывает тот, у кого выпадет большее значение")

    var playerWins = 0
    var userAnswer = "Да"

    while (userAnswer == "Да") {
        val playerMove = throwTheDice()
        println("Ход игрока: $playerMove")
        Thread.sleep(1000)

        val computerMove = throwTheDice()
        println("Ход компьютера: $computerMove")
        Thread.sleep(1000)

        if (playerMove > computerMove) {
            println("Победило человечество")
            playerWins++
        } else if (playerMove < computerMove) {
            println("Победила машина")
        } else {
            println("Победила дружба")
        }

        userAnswer = roundConducting()
    }

    println("Игра завершена")
    println("Количество выигранных партий игрока: $playerWins")
}

fun throwTheDice(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

fun roundConducting(): String {
    println("Хотите бросить кости ещё раз? Введите Да или Нет")
    var userAnswer: String = readln()
    return userAnswer
}