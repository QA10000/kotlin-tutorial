package com.example.first

import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main() {
    arithmaticExceptionDemo()
    arrayOutOfBoundExcptionDemo()
    numberFormatExceptionDemo()
}

fun arithmaticExceptionDemo() {
    try {
        val x = 20 / 0
        println(x)
    } catch (e: ArithmeticException) {
        println(e)
    }
    println("code after exception") // create an array with 10 values, in the for loop iterating 11 times, handle exception
}

fun arrayOutOfBoundExcptionDemo() {
    var myArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    try {
        for (i in myArray)
            println(myArray[10])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e)
    }
    println("code after exception")
}

fun numberFormatExceptionDemo() {
    val a = "10.5"
    try {
        Integer.parseInt(a)
    } catch (e: NumberFormatException) {
        println(e)
    }
    println("code after exception")
}


