package org.example.lesson3

fun main() {
    var whereFrom: String = "E2"
    var whereTo: String = "E4"
    var moveNumber: Int = 1
    var lineToSend: String = "[$whereFrom-$whereTo;${moveNumber++}]"

    println(lineToSend)

    whereFrom = "D2"
    whereTo = "D3"
    lineToSend = "[$whereFrom-$whereTo;${moveNumber++}]"

    println(lineToSend)

}