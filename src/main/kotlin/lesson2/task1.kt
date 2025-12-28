package org.example.lesson2

fun main() {
    val numberOfSchoolchildren: Int = 4
    val totalPointsInEnglish: Int = 3 + 4 + 3 + 5
    val averageEnglishPointsFloat: Float = totalPointsInEnglish.toFloat() / numberOfSchoolchildren
    println(averageEnglishPointsFloat)
}