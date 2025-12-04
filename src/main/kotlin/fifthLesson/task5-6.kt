package org.example.fifthLesson

import kotlin.math.pow

fun main() {
    val userWeight: Double = readln().toDouble()
    val userHeight: Float = readln().toFloat()

    val imt = userWeight / (userHeight / 100).pow(2)

    val res = when {
        (imt < 18.5) -> "Недостаточная масса тела"
        (imt < 25) -> "Нормальная масса тела"
        (imt < 30) -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("$res. ИМС: ${String.format("%.2f", imt)}")
}