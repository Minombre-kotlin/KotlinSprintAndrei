package org.example.lesson4

fun main() {
    var trainingDay: Int = 5
    val notEvenDay = trainingDay % 2 != 0

    println(
        """
        Упражнения для рук: $notEvenDay
        Упражнения для ног: ${!notEvenDay}
        Упражнения для спины: ${!notEvenDay}
        Упражнения для пресса: $notEvenDay
    """.trimIndent()
    )
}