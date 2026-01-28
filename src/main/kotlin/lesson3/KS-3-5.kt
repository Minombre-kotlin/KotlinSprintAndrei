package org.example.lesson3

fun main() {
    val stepPlayer: String = "D2-D4;0"
    val parseMoveAndMoveNumber = stepPlayer.split(";")
    val parseMoveFromTo = parseMoveAndMoveNumber[0].split("-")

    val whereFrom = parseMoveFromTo[0]
    val whereTo = parseMoveFromTo[1]
    val moveNumber = parseMoveAndMoveNumber[1]
    val moveNumberInt = moveNumber.toInt()

    println(whereFrom)
    println(whereTo)
    println(moveNumberInt)

}