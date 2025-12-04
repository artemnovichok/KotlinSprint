package org.example.fifthLesson

const val FIRST_WIN_NUM = 10
const val SECOND_WIN_NUM = 15

const val MIN_NUM = 0
const val MAX_NUM = 42

const val ERROR_MESSAGE = "Введите корректное число"

fun main()
{
    var userInputFirst: Int? = null
    var userInputSecond: Int? = null

    println("Добро пожаловать в лоторею!")

    while (userInputFirst == null)
    {
        println("Введите первое число(0-42)")
        userInputFirst = readln().toIntOrNull()
        if(userInputFirst == null || userInputFirst !in MIN_NUM..MAX_NUM)
        {
            userInputFirst = null
            println(ERROR_MESSAGE)
        }
    }

    println("Спасибо!")

    while (userInputSecond == null)
    {
        println("Введите второе число(0-42)")
        userInputSecond = readln().toIntOrNull()
        if(userInputSecond == null || userInputSecond !in MIN_NUM..MAX_NUM) {
            userInputSecond = null
            println(ERROR_MESSAGE)
        }
    }

    println("Спасибо")

    val matches:Int = (if (userInputFirst == FIRST_WIN_NUM || userInputFirst == SECOND_WIN_NUM) 1 else 0) + (if (userInputSecond == SECOND_WIN_NUM || userInputSecond == FIRST_WIN_NUM) 1 else 0)

    when(matches)
    {
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        else -> println("Unsuspecting number")
    }
}