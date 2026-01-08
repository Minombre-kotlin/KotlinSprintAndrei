package org.example.lesson2

fun main() {
    val crystallineOre: Int = 7
    val metalOre: Int = 11
    val buff: Double = 1.2
    val crystallineOreBuff: Int = (crystallineOre * buff).toInt()
    val metalOreBuff: Int = (metalOre * buff).toInt()
    val numberOfBonusCrystallineOre: Int = crystallineOreBuff - crystallineOre
    val numberOfBonusMetalOre: Int = metalOreBuff - metalOre
    println("Количество бонусных материалов кристаллической руды:$numberOfBonusCrystallineOre")
    println("Количество бонусных материалов железной руды: $numberOfBonusMetalOre")
}