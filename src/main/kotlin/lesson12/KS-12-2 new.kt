package org.example.lesson12

class WeatherInfo(val dayTemp: Double, val nightTemp: Double, val hasRain: Boolean) {

    fun printInfo() {
        println("День: $dayTemp°C, Ночь: $nightTemp°C, Осадки: $hasRain")
    }
}

fun main() {

    val weather = WeatherInfo(20.0, 17.0, false)
    weather.printInfo()

}