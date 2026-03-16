package org.example.lesson9

fun main() {
    println("Введите 5 ингредиентов для рецепта через запятую в строку: ")
    val userIngredients = readln()
    val dividedUserIngredients = userIngredients.split(", ").sorted()

    println(dividedUserIngredients)
}