package org.example.lesson13

class Contact(
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
    val contact1 = Contact("Анна", 89501234567, "Аэрофлот")
    val contact2 = Contact("Тимофей", 89511234567, null)
    val contact3 = Contact("Иван", 89123456789)

    contact1.printContact()
    contact2.printContact()
    contact3.printContact()
}