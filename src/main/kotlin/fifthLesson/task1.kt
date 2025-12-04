package org.example.fifthLesson

fun main()
{
    var answer: Int? = null
    while(answer == null)
    {
        println("Проверка на робота. Ответьте 2 x 2 =")
        answer = readln().toIntOrNull()
        if(answer == null || answer != 4)
        {
            answer = null
            println("Доступ запрещен.")
        }
    }

    println("Добро пожаловать!")
}