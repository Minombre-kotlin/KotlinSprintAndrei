package org.example.Lesson11

data class Category(
    val name: String,
    val description: String,
    val subcategory: MutableList<String>,
)

data class Recipe(
    val name: String,
    val ingredients: MutableList<Ingredient>,
    var portions: Int,
    val cookingMethod: String,
)

data class Ingredient(
    val productName: String,
    val quantity: Int,
    val unit: String,
)

fun main() {
    val categoryBurgers = Category(
        name = "Бургеры",
        description = "Рецепты всех популярных видов бургеров",
        subcategory = mutableListOf("Чизбургер", "Классический гамбургер", "Бургер с грибами и сыром"),
    )
    val categoryDesserts = Category(
        name = "Десерты",
        description = "Самые вкусные рецепты десертов специально для вас",
        subcategory = mutableListOf(),
    )
    val categoryPizza = Category(
        name = "Пицца",
        description = "Пицца на любой вкус и цвет. Лучшая подборка для тебя",
        subcategory = mutableListOf(),
    )
    val categoryFish = Category(
        name = "Рыба",
        description = "Печеная, жареная, сушеная, любая рыба на твой вкус",
        subcategory = mutableListOf(),
    )
    val recipeBurgerWithMushrooms = Recipe(
        name = "Бургер с грибами и сыром",
        ingredients = mutableListOf(
            Ingredient(productName = "Творог", quantity = 350, unit = "грамм"),
            Ingredient(productName = "Куриное яйцо", quantity = 2, unit = "штук"),
            Ingredient(productName = "Пшеничная мука", quantity = 6, unit = "столовых ложек"),
            Ingredient(productName = "Подсолнечное масло", quantity = 2, unit = "столовых ложек"),
            Ingredient(productName = "Сахар", quantity = 2, unit = "столовых ложек"),
        ),
        portions = 3,
        cookingMethod = """
            1. В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и
            сформируйте котлеты.
            2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или
            до желаемой степени прожарки.
            3. В то время как котлеты готовятся, подготовьте булочки. Разрешьте их пополам и обжарьте на сковороде до
            золотистой корочки.
            4. Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца
            помидора и закройте верхней половинкой булочки.
            5. Подавайте бургеры горячими с картофельными чипсами или картофельным пюре.            
        """.trimIndent()
    )
}



