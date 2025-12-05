package org.example.FourLesson

const val TRAINING_TABLE:String = """
        Упражнения для рук: VALUE1
        Упражнения для ног: VALUE2
        Упражнения для спины: VALUE2
        Упражнения для пресса: VALUE1
    """

fun main()
{
    var currentDay: Int = 0

    //day1
    currentDay++

    //...

    //day5
    currentDay = 5 //only for test
    println(TRAINING_TABLE.replace("VALUE1", (currentDay % 2 != 0).toString())
        .replace("VALUE2", (currentDay % 2 == 0).toString()))
}