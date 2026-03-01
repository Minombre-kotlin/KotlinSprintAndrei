package org.example.lesson8

fun main() {
    val saladIngredients = arrayOf("банан", "клубника", "киви", "ананас", "апельсин", "йогурт")
    println("Введите название ингредиента, который хотите найти")
    val ingredientSearch = readln()

    for (ingredient in saladIngredients) {
        if (ingredient == ingredientSearch) {
            println("Ингредиент $ingredientSearch в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
        }
    }
}