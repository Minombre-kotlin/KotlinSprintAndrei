package org.example.lesson13

data class PhoneBookEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val contacts = mutableListOf<PhoneBookEntry>()
    while (true) {
        println("Введите имя:")
        val name = readln()
        if (name.isEmpty())
            break
        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Номер не указан или введён не верно")
            continue
        }
        println("Введите название компании:")
        val company = readln().ifEmpty { null }
        contacts.add(PhoneBookEntry(name, phoneNumber, company))
    }
    println(contacts)
}