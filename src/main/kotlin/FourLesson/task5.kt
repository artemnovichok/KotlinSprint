package org.example.FourLesson

const val MESSAGE_PAT:String = "Корабль может отплыть: %b"
const val ERROR_MESSAGE_PAT = "Ошибка. Введите корректное значение"
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main()
{
    var hasDamage: Boolean? = null

    while (hasDamage == null)
    {
        println("Корабль имеет повреждения? (true или false)")
        hasDamage = readln().toBooleanStrictOrNull()
        if(hasDamage == null)
        {
            println(ERROR_MESSAGE_PAT)
        }
    }

    var crewCount: Int? = null

    while (crewCount == null)
    {
        println("Какое количество экипажа? (любое число от $CREW_MIN до $CREW_MAX)")
        crewCount = readln().toIntOrNull()
        if (crewCount == null || crewCount !in CREW_MIN..CREW_MAX)
        {
            crewCount = null
            println(ERROR_MESSAGE_PAT)
        }
    }

    var provisionCount: Int? = null

    while (provisionCount == null)
    {
        println("Какое количество провизии? (любое неотрицательное число)")
        provisionCount = readln().toIntOrNull()
        if(provisionCount == null || provisionCount < 0)
        {
            provisionCount = null
            println(ERROR_MESSAGE_PAT)
        }
    }

    var isGoodWeather: Boolean? = if (hasDamage) null else true;

    while (isGoodWeather == null)
    {
        println("Погода хорошая? (true или false)")
        isGoodWeather = readln().toBooleanStrictOrNull()
        if(isGoodWeather == null)
        {
            println(ERROR_MESSAGE_PAT)
        }
    }

    println(MESSAGE_PAT.format(canSail(hasDamage, crewCount, provisionCount, isGoodWeather)))
}

fun canSail(hasDamage:Boolean, crewCount: Int, provisionCount: Int, isGoodWeather: Boolean):Boolean
{
    return (!hasDamage && crewCount >= CREW_MIN && crewCount <= CREW_MAX && provisionCount > PROVISION_MIN) ||
            (hasDamage && crewCount == CREW_MAX && isGoodWeather && provisionCount >= PROVISION_MIN)
}