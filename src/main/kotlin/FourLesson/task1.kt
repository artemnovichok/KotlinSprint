package org.example.FourLesson
const val MAX_CAPACITY_TABLES:Byte = 13
fun main()
{
    val todayBooked = 13
    val tomorrowBooked = 9

    println("Доступность столиков на сегодня: ${todayBooked < MAX_CAPACITY_TABLES}")
    println("Доступность столиков на завтра: ${tomorrowBooked < MAX_CAPACITY_TABLES}")
}