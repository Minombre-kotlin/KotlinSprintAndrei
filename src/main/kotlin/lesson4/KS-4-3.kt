package org.example.lesson4

fun main() {
    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "Winter"
    val favorableConditions = sunnyWeather && openAwning && (airHumidity == 20) && (timeOfYear == "Winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}