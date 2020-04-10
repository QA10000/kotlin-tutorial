package com.example.first

fun main() {
    var total = 0
    var number: Int
    while(true) {
        print("Enter a number: ")
        number = Integer.valueOf(readLine())
        if(number == 0)
            break
        total += number
    }
    println("Sum of above numbers is $total")
} // yes

// ok I will do research and do it by evening sorry have to start work thank