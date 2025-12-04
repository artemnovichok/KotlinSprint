package org.example.thirdLesson

fun main()
{
    val startNumber: Byte = 5
    val table: String = """
        $startNumber x 1 = ${startNumber * 1}
        $startNumber x 2 = ${startNumber * 2}
        $startNumber x 3 = ${startNumber * 3}
        $startNumber x 4 = ${startNumber * 4}
        $startNumber x 5 = ${startNumber * 5}
        $startNumber x 6 = ${startNumber * 6}
        $startNumber x 7 = ${startNumber * 7}
        $startNumber x 8 = ${startNumber * 8}
        $startNumber x 9 = ${startNumber * 9}
    """.trimIndent()

    println(table)
}