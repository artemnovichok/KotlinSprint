package org.example.firstLesson

const val SECOND_IN_MINUTE: Byte = 60;
const val MINUTE_IN_HOUR: Byte = 60;

fun main()
{
    val totalSeconds: Int = 6000;
    val hours:Int = totalSeconds / SECOND_IN_MINUTE / MINUTE_IN_HOUR;
    val minutes: Int = (totalSeconds - hours * MINUTE_IN_HOUR * SECOND_IN_MINUTE ) / SECOND_IN_MINUTE
    val seconds: Int = totalSeconds - hours * MINUTE_IN_HOUR * SECOND_IN_MINUTE - minutes * SECOND_IN_MINUTE

    print("${formatToTwoChars(hours)}:${formatToTwoChars(minutes)}:${formatToTwoChars(seconds)}")
}

fun formatToTwoChars(number: Int) : String
{
    return "%02d".format(number);
}