package org.example.Lesson_3

fun main() {
    val number: Int = 2
    var factor: Int = 1
    val table = """
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
        $number * ${factor++} = ${number * (factor - 1)}
    """.trimIndent()
    println(table)
}