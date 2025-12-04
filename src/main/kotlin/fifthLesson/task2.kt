package org.example.fifthLesson

import java.time.Year

const val AGE_OF_ADULT = 18

fun main() {
    val currentYear: Year = java.time.Year.now()
    val currentYearInt: Int = currentYear.toString().toInt();

    var userYear: Int? = null

    while (userYear == null) {
        println("Введите Ваш год рождения:")
        userYear = readln().toInt()
        if (userYear == null) {
            println("Ошибка. Введите только число")
        }
    }

    val userAge: Int = currentYearInt - userYear
    if (userAge >= AGE_OF_ADULT) {
        println("Показать экран со скрытым контентом")
    }

}