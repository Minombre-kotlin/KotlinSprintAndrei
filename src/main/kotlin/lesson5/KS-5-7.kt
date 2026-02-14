package org.example.lesson5

const val CONSTANT: Int = 100

fun main() {
    println(
        """
        Здравствуйте! Для расчета количества необходимого топлива и итоговой стоимости поездки нам необходимо ввести несколько значений. 
        Для начала введите, пожалуйста, расстояние планируемой поездки (в км)
        
        """.trimIndent()
    )
    val distance = readln().toDouble()
    println("Отлично. Также введите расход топлива на 100 км (в литрах)")
    val fuelConsumption = readln().toDouble()
    println("Хорошо. А теперь введите текущую цену за литр топлива")
    val fuelPrice = readln().toDouble()

    val totalFuelConsumption = (distance * fuelConsumption) / CONSTANT

    val totalCostFuel = totalFuelConsumption * fuelPrice

    println("Общее количество необходимого топлива: %.2f литров".format(totalFuelConsumption))
    println("Итоговая стоимость поездки: %.2f рублей".format(totalCostFuel))
}