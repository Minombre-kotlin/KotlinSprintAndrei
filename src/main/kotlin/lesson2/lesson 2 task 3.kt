package org.example.lesson2

const val oneHourInMinutes: Int = 60

fun main() {
    val timeStartHours: Int = 9
    val timeStartMinutes: Int = 39
    val timeSumHoursAndMinutesInMinutes: Int = timeStartHours * oneHourInMinutes + timeStartMinutes

    val timeTravel: Int = 457

    val timeArrivalInMinutes: Int = timeSumHoursAndMinutesInMinutes + timeTravel
    val timeArrivalHours: Int = timeArrivalInMinutes / oneHourInMinutes
    val timeArrivalMinutes: Int = timeArrivalInMinutes % oneHourInMinutes
    val timeArrivalInHoursCorrectFormat = String.format("%02d:%02d", timeArrivalHours, timeArrivalMinutes)

    println(timeArrivalInHoursCorrectFormat)
}