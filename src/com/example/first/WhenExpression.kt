package com.example.first

fun main() {
    var num = 5
    when (num) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Number is not within the range of 1 to 5")
    }
}