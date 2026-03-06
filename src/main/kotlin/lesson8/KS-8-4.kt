package org.example.lesson8

fun main() {
    var saladIngredients = arrayOf("банан", "клубника", "киви", "ананас", "апельсин", "йогурт")
    println(
        """
        Список ингредиентов для салата: ${saladIngredients.joinToString(", ")}.
        Замените любой ингредиент в рецепте на свой для улучшения рецепта.
        Для этого введите название ингредиента, который есть в рецепте:
    """.trimIndent()
    )
    val userIngredient = readln()
    val indexUserIngredient = saladIngredients.indexOf(userIngredient)

    if (indexUserIngredient == -1) {
        println("Данного ингредиента нет в рецепте. Введите название ингредиента, который есть в рецепте")
    } else {
        println("Отлично. А теперь введите название ингредиента, который вы хотели бы добавить в рецепт")
        val newUserIngredient = readln()
        saladIngredients[indexUserIngredient] = newUserIngredient

        println("Готово! Вы сохранили следующий список: ${saladIngredients.joinToString(", ")}.")
    }
}