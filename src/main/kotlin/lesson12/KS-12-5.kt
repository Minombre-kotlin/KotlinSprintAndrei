package org.example.lesson12

import kotlin.random.Random

class Weather2(val dayKelvin: Int, val nightKelvin: Int) {

    companion object {
        private const val KELVIN_TO_CELSIUS = 273
    }

    val dayTemp: Int = dayKelvin - KELVIN_TO_CELSIUS
    val nightTemp: Int = nightKelvin - KELVIN_TO_CELSIUS
    val hasRain: Boolean = Random.nextBoolean()

}

fun main() {
    val weatherList = List(30) {
        Weather2(
            Random.nextInt(280, 310),
            Random.nextInt(270, 295)
        )
    }

    val dayTemps = weatherList.map { it.dayTemp }
    val nightTemps = weatherList.map { it.nightTemp }

    val rainyDays = weatherList.count { it.hasRain }

    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()

    println("\n--- Статистика за месяц ---")
    println("Средняя дневная температура: $avgDay°C")
    println("Средняя ночная температура: $avgNight°C")
    println("Дней с осадками: $rainyDays")
}