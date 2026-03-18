package org.example.lesson10

fun main() {
    val playerMove = throwTheDice()
    println("Ход игрока: $playerMove")
    Thread.sleep(1000)

    val computerMove = throwTheDice()
    println("Ход компьютера: $computerMove")
    Thread.sleep(1000)

    if (playerMove > computerMove) {
        println("Победило человечество")
    } else if (playerMove < computerMove) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
}

fun throwTheDice(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}