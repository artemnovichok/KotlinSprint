package org.example.FourLesson

const val NEED_GOOD_WEATHER:Boolean = true
const val NEED_OPENED_TENT:Boolean = true
const val WET_PERCENT: Int = 20
const val BAD_SEASON: String = "WINTER"
const val MESSAGE_PAT: String = "Благоприятные ли условия сейчас для роста бобовых? %b"

fun main()
{
    val isGoodWeather = true
    val isTentOpened = true
    val currentWetPercent = 20
    val currentSeasonName = "Winter"

    println(MESSAGE_PAT.format(isGoodWeather == NEED_GOOD_WEATHER &&
            isTentOpened == NEED_OPENED_TENT &&
            currentWetPercent == WET_PERCENT &&
            currentSeasonName.uppercase() != BAD_SEASON
    ))
}