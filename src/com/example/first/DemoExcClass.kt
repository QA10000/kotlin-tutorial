package com.example.first

class DemoExcClass {

    var age = 23

    fun getAge() {
        println("Age is $age")
    }
}

fun main() {
    val obj = DemoExcClass()
    obj.getAge()
    val obj1 = ExcerciseDemo()
    obj1.printMe()
}