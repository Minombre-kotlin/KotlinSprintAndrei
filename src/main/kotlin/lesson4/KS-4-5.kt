package org.example.lesson4

const val ACCEPTABLE_PRESENCE_OF_DAMAGE_TO_THE_CASE: Boolean = false
const val MIN_CREW_COMPOSITION: Int = 55
const val MAX_CREW_COMPOSITION: Int = 70
const val MIN_NUMBER_OF_BOXES_WITH_PROVISIONS_ON_BOARD: Int = 50
const val FAVORABLE_WEATHER_CONDITIONS: Boolean = true

fun main() {

    println("Введите параметры для отправления корабля")
    println("Наличие повреждений (true или false):")
    var currentPresenceOfDamageToTheCase: Boolean = readln().toBoolean()
    println("Текущий состав экипажа (Например,55):")
    var currentCrewComposition: Int = readln().toInt()
    println("Текущее количество ящиков с провизией на борту (Например, 50):")
    var currentNumberOfBoxesWithProvisionsOnBoard: Int = readln().toInt()
    println("Текущие погодные условия (true или false):")
    var currentFavorableWeatherConditions: Boolean = readln().toBoolean()

    val shipDepartureAllowed =
        (currentPresenceOfDamageToTheCase == ACCEPTABLE_PRESENCE_OF_DAMAGE_TO_THE_CASE) && (currentCrewComposition >= MIN_CREW_COMPOSITION) && (currentCrewComposition <= MAX_CREW_COMPOSITION) && (currentNumberOfBoxesWithProvisionsOnBoard >= MIN_NUMBER_OF_BOXES_WITH_PROVISIONS_ON_BOARD) && (currentFavorableWeatherConditions == FAVORABLE_WEATHER_CONDITIONS)
    println(shipDepartureAllowed)
}