package org.example.thirdLesson

fun main()
{
    val userName: String = "Artem"
    var helloText: String

    //day

    helloText = """
            Good day, $userName!
                Wait a moment.
    """.trimIndent()

    println(helloText)

    helloText = """
            Good evening, $userName!
                Wait a moment.
    """.trimIndent()

    println(helloText)
}