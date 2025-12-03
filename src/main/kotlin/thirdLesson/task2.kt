package org.example.thirdLesson

fun main()
{
    //like struct of user data from db
    var age: Byte = 20
    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val surname: String = "Сергеевна"

    println(ToFioAgeFormat(lastName, firstName, surname, age))

    //age 22
    age = 22
    lastName = "Сидорова"

    println(ToFioAgeFormat(lastName, firstName, surname, age))

}

fun ToFioAgeFormat(lastName: String, firstName: String, surname: String, age: Byte) : String
{
    return "$lastName $firstName $surname, $age"
}