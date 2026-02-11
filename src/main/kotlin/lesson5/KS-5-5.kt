package org.example.lesson5

import kotlin.random.Random

fun main() {
    println(
        """
        Здравствуйте! По правилам лотереи необходимо ввести 3 числа в диапазоне от 0 до 42.
        Данные числа будут сопоставлены с тремя случайно сгенерированными числами.
        Выигрывает тот, кто отгадает все 3 числа.
        Для начала игры введите, пожалуйста, первое число.
       
    """.trimIndent()
    )
    val userNumber1: Int = readln().toInt()
    println("Введите второе число")
    val userNumber2: Int = readln().toInt()
    println("Введите третье число")
    val userNumber3: Int = readln().toInt()
    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)
    println("Введённый пользователем список: $userNumbers")

    val randomNumbers = List(3) { Random.nextInt(0, 43) }
    println("Случайно сгенерированный список: $randomNumbers")

    val comparisonOfTwoLists = userNumbers.intersect(randomNumbers)
    val sizeOfResultingCollection = comparisonOfTwoLists.size
    println("Количество совпадений: $sizeOfResultingCollection")

    val sizeCollection = when (sizeOfResultingCollection) {
        3 -> "Поздравляем вас! Угаданы все числа и выигран джекпот!"
        2 -> "Это успех! Вы угадали два числа и получаете крупный приз!"
        1 -> "Угадано одно число. Вы получаете утешительный приз"
        else -> "К сожалению, вы не отгадали ни одно число. Но не отчаивайтесь, ведь вы можете попробовать снова"
    }
    println(sizeCollection)

    println("Выигрышные числа (совпавшие числа): $comparisonOfTwoLists")
}