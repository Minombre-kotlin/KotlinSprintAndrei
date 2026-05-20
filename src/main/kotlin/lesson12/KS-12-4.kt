package org.example.lesson12

class Weather2(dayKelvin: Int, nightKelvin: Int) {

    companion object {
        private const val KELVIN_TO_CELSIUS = 273
    }

    val dayTemp: Int = dayKelvin - KELVIN_TO_CELSIUS
    val nightTemp: Int = nightKelvin - KELVIN_TO_CELSIUS

    fun printInfo() {
        println("День: $dayTemp°C, Ночь: $nightTemp°C")
    }

    init {
        printInfo()
    }

}

fun main() {
    val weather = Weather2(300, 290)
}