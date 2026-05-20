package org.example.lesson12

import kotlin.random.Random

class Weather2(dayKelvin: Int, nightKelvin: Int, hasRain: Boolean) {

    companion object {
        private const val KELVIN_TO_CELSIUS = 273
    }

    val dayTemp: Int = dayKelvin - KELVIN_TO_CELSIUS
    val nightTemp: Int = nightKelvin - KELVIN_TO_CELSIUS
    val hasRain: Boolean = hasRain

    fun printInfo() {
        println("День: $dayTemp°C, Ночь: $nightTemp°C")
    }

    init {
        printInfo()
    }
}

fun main() {
    val weatherList = mutableListOf<Weather2>()

    repeat(30) {
        val randomDay = Random.nextInt(250, 310)
        val randomNight = Random.nextInt(240, 290)
        val randomRain = Random.nextBoolean()

        weatherList.add(Weather2(randomDay, randomNight, randomRain))
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