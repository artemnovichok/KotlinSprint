package org.example.fifthLesson

fun main()
{
    val hp = 5
    val b = if (hp < 0) hp else hp
    val c = when
    {
        hp < 0 -> 0
        hp > 0 -> hp
        else -> hp
    }
    when (hp)
    {
        0 -> println("test")
        1 -> println("test2")
        else -> println("test3")
    }
}