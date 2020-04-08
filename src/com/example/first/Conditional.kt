package com.example.first

fun main() {
    val num1 = 30
    val num2 = 20
    val result = if(num1 > num2) {
        "$num1 is greater than $num2"
    } else if(num1 == num2) {
        "$num1 is equal to $num2"
    } else {
        "$num1 is less than $num2"
    }
    println(result)
}

