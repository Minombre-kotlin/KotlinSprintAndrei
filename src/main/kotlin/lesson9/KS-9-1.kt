package org.example.lesson9

fun main() {
    val listOfIngredients = listOf("морковь", "лук", "макароны", "котлеты на пару", "приправа \"итальянские травы\" ")

    println("В рецепте есть следующие ингредиенты:")

    listOfIngredients.forEach {
        println(it)
    }
}