package org.example.fifthLesson

import kotlin.random.Random

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main()
{
    val numbers = List(3) { Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1) }
    val userInput = List(3) { readln().toInt() }
    val result = numbers intersect userInput.toSet()
    when(result.count())
    {
        0 -> println("Вы ни разу не угадали")
        1-> println("Утешительный приз. Угадали 1 число")
        2-> println("Крупный приз! Угадали 2 числа")
        3-> println("Джекпот! Угадали 3 числа")
        else -> println("Error")
    }

    println("Загаданные числа были: $numbers")
}