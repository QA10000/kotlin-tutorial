package com.example.first

var intArray = arrayOf(9, 2, 7, 4, 11, 12)
fun findMaxNumber() {
    var max = intArray[0]
    for (i in intArray) {
        if(max < i) {
            max = i
        }
    }
    println("Max value is $max") // ok
}

fun findOddEven(myNumber: Int) {
    if(myNumber % 2 == 0) {
        println("$myNumber is even")
    } else {
        println("$myNumber is odd")
    }
}
// ||, && , !
fun findCalculation(operator: String, number1: Int, number2: Int) {
    if(operator == "+") {
        println("$number1 + $number2 = " + (number1 + number2))
    } else if(operator == "-") {
        println("$number1 - $number2 = " + (number1 - number2))
    } else if(operator == "*") {
        println("$number1 * $number2 = " + (number1 * number2))
    } else if(operator == "/") {
        println("$number1 / $number2 = " + (number1 / number2))
    } else {
        println("$operator is invalid")
    }

}

    fun main() {
        findMaxNumber()
        findOddEven(12)
        findCalculation("*", 5, 7) //
    }
