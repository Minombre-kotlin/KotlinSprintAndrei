package org.example.lesson9

fun main() {
    val listOfIngredients = mutableListOf("молоко", "хлопья", "мёд")

    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString(", ")}. Желаете добавить ещё? ")
    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()

        listOfIngredients.add(userIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}Н")
    } else {
        println("Добавление ингредиентов приостановлено")
        return
    }
}