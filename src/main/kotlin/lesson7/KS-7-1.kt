package org.example.lesson7

fun main() {
    val minNumber = 0
    val maxNumber = 6

    for (i in minNumber until maxNumber) {
        if (i % 2 == 0) {
            var numers = (0..9).random()
            print(numers)
        } else {
            var letters = ('a'..'z').random()
            print(letters)
        }
    }
}