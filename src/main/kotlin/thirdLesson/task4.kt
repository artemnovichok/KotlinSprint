package org.example.thirdLesson

fun main()
{
    //start new session of game
    var step: Int = 1
    var previousFigurePos: String = "E2"
    var newFigurePos: String = "E4"

    //step2
    step++
    //todo: logic of black chess

    //step3
    step++
    previousFigurePos = fieldDataGenerator('D', 2) //get from figure data
    newFigurePos = fieldDataGenerator('D', 3) //get new pos from player input
    println(blackOrWhiteStepMessage(step) + "из $previousFigurePos в $newFigurePos")
}

fun blackOrWhiteStepMessage(step: Int): String
{
    return if (step % 2 != 0) "Ход белых($step): " else "Ход черных($step): "
}

fun fieldDataGenerator(char: Char, number: Byte): String
{
    return "$char$number".uppercase()
}