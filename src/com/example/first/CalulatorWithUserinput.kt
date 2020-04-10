package com.example.first

import java.lang.ArithmeticException

fun takeUserInput(operator: String, firstNum: Int, secondNum: Int) {
    if (operator == "+") {
        println("$firstNum + $secondNum = " + (firstNum + secondNum))
    } else if (operator == "-") {
        println("$firstNum - $secondNum = " + (firstNum - secondNum))
    } else if (operator == "*") {
        println("$firstNum * $secondNum = " + (firstNum * secondNum))
    } else if (operator == "/") {
        try {
            println("$firstNum / $secondNum = " + (firstNum / secondNum))
        } catch (e: ArithmeticException) {
            println(e)
        }
    } else {
        println("Operator is invalid")
    }
    println("code after exception")
}

fun main() {
    println("Enter operator: ")
    val operator2 =
        readLine().toString() // since we are passing the value to a primtive data type so we have to use tostring()
    println("Enter first number: ")
    val number = Integer.valueOf(readLine())
    println("Enter second number: ")
    val numberSecond = Integer.valueOf(readLine())
    takeUserInput(operator2, number, numberSecond)
}