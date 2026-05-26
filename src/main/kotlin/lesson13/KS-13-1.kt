package org.example.lesson13

class TelephoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val contact1 = TelephoneDirectory("Анна", 89501234567, "Аэрофлот")
    val contact2 = TelephoneDirectory("Тимофей", 89511234567, null)
}