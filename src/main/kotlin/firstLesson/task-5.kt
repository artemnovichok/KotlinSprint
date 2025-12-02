package org.example.firstLesson

fun main()
{
    val totalSeconds: UInt = 6000u;

    val hours:UInt = totalSeconds / 60u / 60u;
    val minutes: UInt = (totalSeconds - hours * 60u * 60u ) / 60u
    val seconds: UInt = totalSeconds - hours * 60U * 60u - minutes * 60u

    print(hours)
    print(':')
    print(minutes)
    print(':')
    println(seconds)
}