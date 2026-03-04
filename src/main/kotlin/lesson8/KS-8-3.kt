package org.example.lesson8

fun main() {
    val saladIngredients = arrayOf("банан", "клубника", "киви", "ананас", "апельсин", "йогурт")
    println("Введите название ингредиента, который хотите найти")
    val ingredientSearch = readln()

    if (saladIngredients.contains(ingredientSearch)) {
        println("Ингредиент $ingredientSearch в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}