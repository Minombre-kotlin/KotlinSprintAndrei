package org.example.lesson9

fun main() {
    val omeletteIngredients: Map<String, Int> = mapOf(
        "яиц (шт)" to 2,
        "молока (мл)" to 50,
        "сливочного масла (гр.)" to 15
    )

    println("Введите количество порций омлета, которое вам нужно приготовить")
    val numberOfOmeletServings = readln().toInt()

    println("На $numberOfOmeletServings порций вам понадобится: ")

    val userOmeletteIngredients = omeletteIngredients.mapValues { it.value * numberOfOmeletServings }

    userOmeletteIngredients.forEach { (ingredient, amount) ->

        println("$ingredient: $amount")
    }
}