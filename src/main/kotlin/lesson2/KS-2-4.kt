package org.example.lesson2

fun main() {
    val crystallineOre: Int = 7
    val metalOre: Int = 11
    val percentOffBuff: Int = 20
    val fullPercent: Int = 100
    val buffCrystallineOre: Int = percentOffBuff * crystallineOre / fullPercent
    val buffMetalOre: Int = percentOffBuff * metalOre / fullPercent

    println("Количество бонусных материалов кристаллической руды:$buffCrystallineOre")
    println("Количество бонусных материалов железной руды: $buffMetalOre")
}