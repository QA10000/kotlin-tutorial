package com.example.first

fun main() {
    println("Enter your name: ")
    val name = readLine() // used for only strings
    println("Enter your age: ")
    val age = Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")
}