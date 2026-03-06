package org.example.lesson8

fun main() {
    println("Для создания рецепта салата введите количество планируемых ингредиентов: ")
    val userQuantityIngredients = readln().toInt()

    println("Отлично. А теперь введите названия ингредиентов, которые потребуются для салата. Ввести нужно по одному ингредиенту $userQuantityIngredients раз(а): ")
    val userIngredients = Array(userQuantityIngredients) { readln() }

    println("Введённые ингредиенты: ${userIngredients.joinToString(", ")}")
}