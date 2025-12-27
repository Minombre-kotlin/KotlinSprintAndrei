package org.example.lesson2

fun main() {
    val salaryOfPermanentEmployees: Int = 30000 * 50
    val generalExpensesAfterTheArrivalOfInterns: Int = salaryOfPermanentEmployees + 20000 * 30
    val averageSalaryPerEmployeeAfterPlacementOfInterns: Int =
        (salaryOfPermanentEmployees + generalExpensesAfterTheArrivalOfInterns) / 80

    println(salaryOfPermanentEmployees)
    println(generalExpensesAfterTheArrivalOfInterns)
    println(averageSalaryPerEmployeeAfterPlacementOfInterns)
}