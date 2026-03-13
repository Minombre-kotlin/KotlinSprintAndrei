package org.example.lesson9

fun main() {
    val ingredients = mutableSetOf<String>()

    println("Введите 5 ингредиентов для рецепта по одному в строку: ")
    while (ingredients.size < 5) {
        val userIngredients = readln()
        if (userIngredients in ingredients) {
            println("Вы уже вводили ингредиент $userIngredients. Пожалуйста, введите другой ингредиент для рецепта")
        } else {
            ingredients.add(userIngredients)
        }
    }
    val sortedIngredients = ingredients.sorted()
    val sortedIngredientsMutable = sortedIngredients.toMutableList()
    sortedIngredientsMutable[0] = sortedIngredientsMutable[0].replaceFirstChar { it.uppercase() }
    println("Ваш список ингредиентов: ${sortedIngredientsMutable.joinToString(", ")} ")
}