package org.example.lesson13

class TelephoneDirectoryNew(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,

) {
    fun printContact() {
        val companyDisplay = company ?: "<не указано>"
        println("Имя: $name, Номер: $phoneNumber, Компания: $companyDisplay")
    }
}

fun main() {
    val contact1 = TelephoneDirectoryNew("Анна", 89501234567, "Аэрофлот")
    val contact2 = TelephoneDirectoryNew("Тимофей", 89511234567, null)
    val contact3 = TelephoneDirectoryNew("Иван", 89123456789)

    contact1.printContact()
    contact2.printContact()
    contact3.printContact()
}