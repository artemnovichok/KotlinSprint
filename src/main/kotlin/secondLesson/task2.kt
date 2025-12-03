package org.example.secondLesson

fun main()
{
    val workers: Short = 50
    val workerSalary: Short = 30_000
    val interns: Short = 30
    val internSalary: Short = 20_000

    val workersTotalExpenses: Int = workers * workerSalary
    val totalExpenses: Int = workersTotalExpenses + interns * internSalary
    val averageSalary: Float = totalExpenses.toFloat() / (workers + interns)
    println(workersTotalExpenses)
    println(totalExpenses)
    println(averageSalary)
}