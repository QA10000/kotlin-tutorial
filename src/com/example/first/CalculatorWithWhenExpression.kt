package com.example.first

fun doCalulationUsingWhen(operator: String, numberFirst: Int, numberSecond: Int) {
    when (operator) {
        "+" -> println("$numberFirst + $numberSecond = " + (numberFirst + numberSecond))
        "-" -> println("$numberFirst - $numberSecond = " + (numberFirst - numberSecond))
        "*" -> println("$numberFirst * $numberSecond = " + (numberFirst * numberSecond))
        "/" -> println("$numberFirst / $numberSecond = " + (numberFirst / numberSecond))
        else -> println("Operator is invalid")
    }

}

fun main() {
    doCalulationUsingWhen("c", 15, 10)
}







