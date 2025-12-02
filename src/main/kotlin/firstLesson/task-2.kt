package org.example.firstLesson

fun main()
{
    val numberOfOrders: UShort = 72u;
    val welcomeMessage: String = "Thanks for your order!";

    println(numberOfOrders);
    println(welcomeMessage);

    var numberOfWorkers: UShort = 2000u;
//    println(numberOfWorkers)

    numberOfWorkers = (numberOfWorkers - 1u).toUShort();
    println(numberOfWorkers);
}