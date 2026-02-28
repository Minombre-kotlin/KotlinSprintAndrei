package org.example

fun main() {
    val dayCounts: Int = 7
    val countViewsPerDay = IntArray(dayCounts)

    countViewsPerDay[0] = 5
    countViewsPerDay[1] = 10
    countViewsPerDay[2] = 15
    countViewsPerDay[3] = 20
    countViewsPerDay[4] = 25
    countViewsPerDay[5] = 30
    countViewsPerDay[6] = 35

    println("Количество просмотров рекламы за каждый день недели: ${countViewsPerDay.contentToString()}")

    val totalCountViews = countViewsPerDay.sum()

    println("Количество просмотров за всю неделю: $totalCountViews")
}