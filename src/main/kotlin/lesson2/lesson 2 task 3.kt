package org.example.lesson2

const val ONE_HOUR_IN_MINUTES: Int = 60

fun main() {
    val timeStartHours: Int = 9
    val timeStartMinutes: Int = 39
    val timeSumHoursAndMinutesInMinutes: Int = timeStartHours * ONE_HOUR_IN_MINUTES + timeStartMinutes

    val timeTravel: Int = 457

    val timeArrivalInMinutes: Int = timeSumHoursAndMinutesInMinutes + timeTravel
    val timeArrivalHours: Int = timeArrivalInMinutes / ONE_HOUR_IN_MINUTES
    val timeArrivalMinutes: Int = timeArrivalInMinutes % ONE_HOUR_IN_MINUTES
    val timeArrivalInHoursCorrectFormat = String.format("%02d:%02d", timeArrivalHours, timeArrivalMinutes)

    println(timeArrivalInHoursCorrectFormat)
}