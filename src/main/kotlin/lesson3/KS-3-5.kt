package org.example.lesson3

fun main() {
    val stepPlayer: String = "D2-D4;0"
    val parseStepPlayer = stepPlayer.split("-", ";")
    val whereFrom = parseStepPlayer[0]
    val whereTo = parseStepPlayer[1]
    val moveNumber = parseStepPlayer[2]

    println(whereFrom)
    println(whereTo)
    println(moveNumber)
}