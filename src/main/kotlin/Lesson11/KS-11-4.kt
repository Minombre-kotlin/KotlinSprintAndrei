package org.example.Lesson11

data class Category(
    val name: String,
    val description: String,
    val imageUrl: String,
    val listOfRecipe: List<Recipe>,
)

data class Recipe(
    val name: String,
    val ingredients: List<Ingredient>,
    val portions: Int,
    val cookingMethod: List<String>,
    val imageUrl: String,
)

data class Ingredient(
    val productName: String,
    val quantity: Double,
    val unit: String,
)

fun main() {

}