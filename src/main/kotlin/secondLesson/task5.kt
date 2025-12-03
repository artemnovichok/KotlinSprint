package org.example.secondLesson

import kotlin.math.pow

const val PERCENT = 16.7
fun main()
{
    val contribution: Int = 70_000
    val years: Byte = 20
    println(threeChars(contribution * (1 + PERCENT * 0.01).toDouble().pow(years.toDouble())))
}


fun threeChars(number: Double):String
{
    return "%.3f".format(number)
}