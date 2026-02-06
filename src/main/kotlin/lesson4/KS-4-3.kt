package org.example.lesson4

const val SUNNY_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "Winter"

fun main() {
    var сurrentAirHumidity: Int = 20
    var currentTimeOfYear: String = "Winter"
    var currentWeather: Boolean = true
    var currentPositionOfTheAwning: Boolean = true
    var favorableConditions =
        (SUNNY_WEATHER == currentWeather) && (OPEN_AWNING == currentPositionOfTheAwning) && (сurrentAirHumidity == AIR_HUMIDITY) && (currentTimeOfYear == TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}