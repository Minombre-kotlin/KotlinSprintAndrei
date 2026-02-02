package org.example.lesson4

fun main() {
    var trainingDay: Int = 5
    val notEvenDay = trainingDay % 2 != 0

    val exerciseForHands = notEvenDay
    val exerciseForFoot = !notEvenDay
    val exerciseForBack = !notEvenDay
    val exerciseForPress = notEvenDay

    println(
        """
        Упражнения для рук: $exerciseForHands
        Упражнения для ног: $exerciseForFoot
        Упражнения для спины: $exerciseForBack
        Упражнения для пресса: $exerciseForPress
    """.trimIndent()
    )
}