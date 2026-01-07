package org.example.lesson2

fun main() {
    val numberOfPermanentEmployees: Int = 50
    val salaryOfPermanentEmployees: Int = 30000
    val totalSalaryOfPermanentEmployees: Int = numberOfPermanentEmployees * salaryOfPermanentEmployees
    val numberOfInterns: Int = 30
    val salaryOfInterns: Int = 20000
    val totalSalaryOfInterns: Int = numberOfInterns * salaryOfInterns
    val totalExpensesAfterTheArrivalOfInterns: Int = salaryOfPermanentEmployees + totalSalaryOfInterns
    val totalNumberOfAllEmployeesTogether: Int = numberOfPermanentEmployees + numberOfInterns
    val averageSalaryPerEmployeeAfterPlacementOfInterns: Int =
        (salaryOfPermanentEmployees + totalExpensesAfterTheArrivalOfInterns) / totalNumberOfAllEmployeesTogether

    println(totalSalaryOfPermanentEmployees)
    println(totalExpensesAfterTheArrivalOfInterns)
    println(averageSalaryPerEmployeeAfterPlacementOfInterns)
}