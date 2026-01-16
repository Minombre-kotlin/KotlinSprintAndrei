package org.example.lesson2

fun main() {
    val numberOfSchoolchildren: Int = 4
    val pointFirst: Int = 3
    val pointSecond: Int = 4
    val pointThird: Int = 3
    val pointFourth: Int = 5
    val totalPointsInEnglish: Int = pointFirst + pointSecond + pointThird + pointFourth
    val averageEnglishPointsFloat: Float = totalPointsInEnglish.toFloat() / numberOfSchoolchildren
    println(averageEnglishPointsFloat)
}