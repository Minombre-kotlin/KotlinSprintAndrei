package org.example.lesson3

fun main() {
    var whereFrom: String = "E2"
    var whereTo: String = "E4"
    var moveNumber: String = "№1"
    var lineToSend: String = """
Игрок сделал ход из $whereFrom в $whereTo $moveNumber
"""

    println(lineToSend)

    whereFrom = "D2"
    whereTo = "D3"
    moveNumber = "№2"
    lineToSend = """
Следующий ход белых. Игрок сделал ход из $whereFrom в $whereTo $moveNumber
"""
    println(lineToSend)

}