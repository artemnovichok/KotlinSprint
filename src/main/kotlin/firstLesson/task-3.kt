package org.example.firstLesson

fun main()
{
    val yearOfFlight: Short = 1961;
    var hourData: Byte;
    var minuteData: Byte;

    //take-off
    hourData = 9;
    minuteData = 7;

    println(yearOfFlight);
    println(formatToTwoChars(hourData));
    println(formatToTwoChars(minuteData));

    //boarding
    hourData = 10;
    minuteData = 55;

    print(formatToTwoChars(hourData));
    print(':');
    print(formatToTwoChars(minuteData));
}

fun formatToTwoChars(number: Byte) : String
{
    return "%02d".format(number);
}