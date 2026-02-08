package org.example.lesson5

const val CORRECT_NUMBER_ONE: Int = 25
const val CORRECT_NUMBER_TWO: Int = 40

fun main() {
    val hello = "Приветствуем вас в лотерее. Вам нужно отгадать 2 числа от 0 до 42. Пожалуйста, введите 2 числа"
    println(hello)

    val answerNumberOne = readln().toInt()
    val answerNumberTwo = readln().toInt()

    if ((answerNumberOne == CORRECT_NUMBER_ONE && answerNumberTwo == CORRECT_NUMBER_TWO) ||
        (answerNumberOne == CORRECT_NUMBER_TWO && answerNumberTwo == CORRECT_NUMBER_ONE)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (answerNumberOne == CORRECT_NUMBER_ONE || answerNumberOne == CORRECT_NUMBER_TWO ||
        answerNumberTwo == CORRECT_NUMBER_ONE || answerNumberTwo == CORRECT_NUMBER_TWO
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}

