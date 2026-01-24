package org.example.lesson3

fun main() {
    val name: String = "Евгений"
    var helloMorning: String = "Доброе утро, $name!"

    println(helloMorning)

    helloMorning = "Добрый день, $name!"
    println(helloMorning)
}