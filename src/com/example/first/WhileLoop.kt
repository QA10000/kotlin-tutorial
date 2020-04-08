package com.example.first

fun findOddEven() {
    var i = 1
    while(i <= 10) {
        if(i % 2 == 1) {
            println(i)
        }
        i++
    }
}

fun main() {
    /*var i = 1     // lambda functions, enum and map of  what about classes and objects. Thanks
    while(i <= 5) {
        println(i)
        i++
    }*/
    findOddEven()
}