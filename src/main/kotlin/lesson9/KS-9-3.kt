package org.example.lesson9

fun main() {
    val omeletteIngredients = listOf<Int>(2, 50, 15)
    val chickenEggsQuantity = omeletteIngredients[0]
    val milkQuantity = omeletteIngredients[1]
    val butterQuantity = omeletteIngredients[2]

    println(
        """
        
        Для одной порции омлета требуется:
         
        Яиц: $chickenEggsQuantity шт., 
        Молока: $milkQuantity мл.,
        Сливочного масла $butterQuantity гр. 
        
        Пожалуйста, введите количество порций омлета, которое вам нужно приготовить:
    """.trimIndent()
    )
    val numberOfOmeletServings = readln().toInt()

    println(
        """
        
        На $numberOfOmeletServings порций вам понадобится:
         
        яиц ${chickenEggsQuantity * numberOfOmeletServings} шт.,
        молока ${milkQuantity * numberOfOmeletServings} мл.,
        сливочного масла ${butterQuantity * numberOfOmeletServings} гр.
    """.trimIndent()
    )
}