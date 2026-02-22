package org.example.lesson7

fun main() {
    println("Здравствуйте. Введите число, до которого будет вестись отсчёт")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2){
        println(i)
    }
}