package org.example.lesson3

fun main() {

    var lastName: String = "Андреева"
    var firstName: String = "Татьяна"
    var patronymic: String = "Сергеевна"
    var age = 20

    println("ФИО до замужества: $lastName, $firstName, $patronymic возраст до замужества: $age лет")

    lastName = "Сидорова"
    age = 22

    println("ФИО после замужества: $lastName, $firstName, $patronymic возраст после замужества: $age лет")
}