package org.example.thirdLesson

fun main()
{
    //server logic
    val raw: String = "D2-D4;0"
    val fromField: String = raw.substringBefore("-")
    val toField: String = raw.substringAfter("-").substringBefore(";")
    val stepNumber: Int = raw.substringAfter(";").toInt()

    println(fromField)
    println(toField)
    println(stepNumber)
}