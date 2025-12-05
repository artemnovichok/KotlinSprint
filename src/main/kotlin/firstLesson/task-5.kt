package org.example.firstLesson

const val SECOND_IN_MINUTE: Int = 60;
const val MINUTE_IN_HOUR: Int = 60;

fun main()
{
    val totalSeconds = 6000
    val hours = totalSeconds / (SECOND_IN_MINUTE * MINUTE_IN_HOUR)
    val minutes = (totalSeconds % (SECOND_IN_MINUTE * MINUTE_IN_HOUR)) / SECOND_IN_MINUTE
    val seconds = totalSeconds % SECOND_IN_MINUTE

    println("%02d:%02d:%02d".format(hours,minutes,seconds))
}