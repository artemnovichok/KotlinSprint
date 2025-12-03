package org.example.firstLesson

fun main()
{
    val numberOfOrders: Byte = 72;
    val welcomeMessage: String = "Thanks for your order!";

    println(numberOfOrders);
    println(welcomeMessage);

    var numberOfWorkers: Short = 2000;
//    println(numberOfWorkers)

    numberOfWorkers = (numberOfWorkers - 1).toShort();
    println(numberOfWorkers);
}