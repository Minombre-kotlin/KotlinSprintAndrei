package org.example.lesson2


fun main() {
    val initialDepositAmount = 70000
    val interestRate = 16.7 / 100
    val numbeOfYears = 20

    val finalDepositAmount = initialDepositAmount * Math.pow(1 + interestRate, numbeOfYears.toDouble())
    println("%.3f".format(finalDepositAmount))
}