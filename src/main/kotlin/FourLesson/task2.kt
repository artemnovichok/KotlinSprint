package org.example.FourLesson

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 120
const val ANSWER_PAT: String = "Груз с весом %s кг и объемом %s л соответствует категории 'Average': %b"

fun main()
{
    //cargo1
    validateAndPrintln(20,80)

    //cargo2
    validateAndPrintln(50,100)
}

fun validateAndPrintln(cargoWeight: Int, cargoVolume:Int)
{
    println(ANSWER_PAT.format(cargoWeight, cargoVolume, MIN_WEIGHT < cargoWeight && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME))
}