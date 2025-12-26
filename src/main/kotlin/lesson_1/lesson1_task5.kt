package org.example.lesson_1

fun main() {

    val totalNumberOfSeconds = 6480
    const val numberOfWholeHours = totalNumberOfSeconds / 3600
    val remainingSecondsAfterСonversionToHours = totalNumberOfSeconds % 3600
    const val numberOfWholeMinutes = remainingSecondsAfterСonversionToHours / 60

    val remainingSecondsAfterСonversionToMinutes = totalNumberOfSeconds % 60

    println("%02d:%02d:02d".format(numberOfWholeHours, numberOfWholeMinutes, remainingSecondsAfterСonversionToMinutes))
}