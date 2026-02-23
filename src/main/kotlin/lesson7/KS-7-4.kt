package org.example.lesson7

fun main() {
    println("Введите количество секунд, которые нужно засечь: ")
    val userNumberSeconds = readln().toInt()

    for (i in userNumberSeconds downTo 0) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
}