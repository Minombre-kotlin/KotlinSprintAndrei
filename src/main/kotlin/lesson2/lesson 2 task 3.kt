package org.example.lesson2

fun main() {
    val timeStartHours: Int = 9
    val timeStartMinutes: Int = 39
    val timeSumHoursAndMinutesInMinutes: Int = timeStartHours * 60 + timeStartMinutes
    val timeTravel: Int = 457
    val timeArrivalInMinutes: Int = timeSumHoursAndMinutesInMinutes + timeTravel
    val timeArrivalHours: Int = timeArrivalInMinutes / 60
    val timeArrivalMinutes: Int = timeArrivalInMinutes % 60
    val timeArrivalInHoursCorrectFormat = String.format("%02d:%02d", timeArrivalHours, timeArrivalMinutes)
    println(timeArrivalInHoursCorrectFormat)
}