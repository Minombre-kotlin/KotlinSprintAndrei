package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTES = 60

fun main() {

    val totalNumberOfSeconds = 6480
    val numberOfWholeHours = totalNumberOfSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterConversionToHours = totalNumberOfSeconds % SECONDS_IN_HOUR
    val numberOfWholeMinutes = remainingSecondsAfterConversionToHours / SECONDS_IN_MINUTES
    val remainingSecondsAfterConversionToMinutes = totalNumberOfSeconds % SECONDS_IN_MINUTES
    println("%02d:%02d:%02d".format(numberOfWholeHours, numberOfWholeMinutes, remainingSecondsAfterConversionToMinutes))
}