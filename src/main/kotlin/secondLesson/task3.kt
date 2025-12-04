package org.example.secondLesson

const val MINUTES_IN_HOUR: Byte = 60

fun main()
{
    val trainLeftHour: Byte = 9 //for devs: 24 hours format here
    val trainLeftMinute: Byte = 39
    val trainPathMinutes: Short = 457

    val trainArrivalTimeInDayMinutes: Int = trainLeftHour * MINUTES_IN_HOUR + trainLeftMinute + trainPathMinutes
    val trainDateArrivalInHours: Int = trainArrivalTimeInDayMinutes / MINUTES_IN_HOUR
    val trainDateArrivalInMinutes: Int = trainArrivalTimeInDayMinutes - trainDateArrivalInHours * MINUTES_IN_HOUR

    println("%2d:%2d".format(trainDateArrivalInHours,trainDateArrivalInMinutes))
}

