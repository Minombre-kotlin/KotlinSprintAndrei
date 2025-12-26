package org.example.lesson1_tasks

fun main(){
    //объявляю общее время в секундах. В задаче показано время 1:30:09
    val totalNumberOfSeconds = 5409

    //перевожу общее количество секунд в количество целых часов
    val numberOfWholeHours = totalNumberOfSeconds /3600

    //вычисляю остаток секунд после перевода в часы
    val remainingSecondsAfterСonversionToHours = totalNumberOfSeconds % 3600

    //перевожу общее количество секунд в количество целых минут
    val numberOfWholeMinutes = remainingSecondsAfterСonversionToHours /60

    //вычисляю остаток секунд после перевода в минуты
    val remainingSecondsAfterСonversionToMinutes = totalNumberOfSeconds % 60

    println(totalNumberOfSeconds)
    println(numberOfWholeHours)
    println(remainingSecondsAfterСonversionToHours)
    println(numberOfWholeMinutes)
    println(remainingSecondsAfterСonversionToMinutes)

    //Вывожу в консоль время, проведенное в космосе в формате [часы:минуты:секунды]
    println(String.format("%02d:%02d:%02d", numberOfWholeHours, numberOfWholeMinutes, remainingSecondsAfterСonversionToMinutes))
}