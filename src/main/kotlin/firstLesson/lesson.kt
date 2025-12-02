package org.example.firstLesson

fun main()
{
    var number: Int = 42; //edit
    val someString: String = "Some str"; //not edit

    println(number)

    println(someString)

    number +=  10
    println(number)

    println("------------")
    //types

    val intNum1: Int = -2147483648; //32 bit
    val intNum2: Int = 2147483647;
    val longNum: Long; //64 bit
    val shortNum: Short; //16 bit
    val byteNum: Byte; //8 bit
    val plusNum: UInt; //32 bit of plus nums from Int

    val doubleNum: Double = 1.3;  //64 bit
    val floatNum: Float = 1.3f; // 32 bit

    val stringValue: String = "Test";  // " " - is important
    val chrValue: Char = 'A'; // ' ' - is important

    val boolValue: Boolean = true; // false and true
}