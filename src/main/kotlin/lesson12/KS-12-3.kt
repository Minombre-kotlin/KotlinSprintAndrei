package org.example.lesson12

class Weather2(dayKelvin: Int, nightKelvin: Int) {
    var dayTemp: Int
    var nightTemp: Int

    init {
        dayTemp = dayKelvin - 273
        nightTemp = nightKelvin - 273
    }

    fun printInfo() {
        println("День: $dayTemp°C, Ночь: $nightTemp°C")
    }
}

fun main() {
    val weather = Weather2(300, 290)
    weather.printInfo()
}