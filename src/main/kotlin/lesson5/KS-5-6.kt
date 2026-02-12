package org.example.lesson5

fun main() {
    println("Здравствуйте, введите, пожалуйста, ваш вес (в кг)")
    val weight = readln().toDouble()

    println("А теперь введите ваш рост (в см)")
    val height = readln().toDouble()

    val oneMeter: Double = 100.0
    val heightInMeters = height / oneMeter

    val bodyMassIndex = weight / (heightInMeters * heightInMeters)

    val insufficientMass: Double = 18.5
    val maxNormalWeight: Double = 25.0
    val obesity: Double = 30.0

    val bodyMassIndexCalculation = when {
        bodyMassIndex < insufficientMass -> "К сожалению, у вас недостаточная масса тела. Вам нужно работать над увеличением массы тела"
        bodyMassIndex >= insufficientMass && bodyMassIndex < maxNormalWeight -> "Отлично. У вас нормальная масса тела"
        bodyMassIndex >= maxNormalWeight && bodyMassIndex < obesity -> "К сожалению, у вас избыточная масса тела. Рекомендуем снизить массу тела"
        else -> "К сожалению, у вас ожирение. Пожалуйста, обратитесь к специалисту для нормализации массы тела"
    }
    println(bodyMassIndexCalculation)

    println("Индекс вашей массы тела: %.2f".format(bodyMassIndex))
}