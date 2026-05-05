package org.example.lesson12

class Weather() {
    var dayTemp = 15.0
    var nightTemp = 10.0
    var hasRain = false

    fun printInfo() {
        println("День: $dayTemp°C, Ночь: $nightTemp°C, Осадки: $hasRain")
    }
}

fun weatherOfDay() {
    val day1 = Weather()
    day1.dayTemp = 20.0
    day1.nightTemp = 15.0
    day1.hasRain = true
    day1.printInfo()

    val day2 = Weather()
    day2.dayTemp = 30.0
    day2.nightTemp = 25.0
    day2.hasRain = false
    day2.printInfo()
}

fun main() {
    weatherOfDay()
}