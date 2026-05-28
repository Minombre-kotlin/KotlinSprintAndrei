package org.example.lesson13

class CompanyContacts(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        val companyDisplay = company ?: "<не указано>"
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:$companyDisplay")
    }
}

fun main() {
    val contacts = mutableListOf(
        CompanyContacts("Анна", 89501234567, "Аэрофлот"),
        CompanyContacts("Тимофей", 89511234567, null),
        CompanyContacts("Иван", 89123456789),
        CompanyContacts("Ольга", 89511234451, "ОАО Оазис-Телеком"),
        CompanyContacts("Сергей", 89511234541, "null"),
    )

    contacts
        .filter { it.company != null }
        .forEach { println(it.company) }
}