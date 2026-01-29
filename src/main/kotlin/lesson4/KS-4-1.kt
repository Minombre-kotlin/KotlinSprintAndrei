package org.example.lesson4

fun main() {
    var numberOfTablesInTheRestaurant = 13
    var numberOfReservedTables: Int = 13
    var tableAvailability: Boolean = numberOfTablesInTheRestaurant > numberOfReservedTables

    println("Доступность столиков на сегодня: $tableAvailability")

    numberOfReservedTables = 9
    tableAvailability = numberOfTablesInTheRestaurant > numberOfReservedTables

    println("Доступность столиков на сегодня: $tableAvailability")
}