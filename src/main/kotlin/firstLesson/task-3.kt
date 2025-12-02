package org.example.firstLesson

fun main()
{
    val yearOfFlight: UShort = 1961u;
    var hourData: UByte;
    var minuteData: UByte;

    //take-off
    hourData = 9u;
    minuteData = 7u;

    println(yearOfFlight);
    println(hourData);
    println(minuteData);

    //boarding
    hourData = 10u;
    minuteData = 55u;

    print(hourData);
    print(':');
    print(minuteData);
}