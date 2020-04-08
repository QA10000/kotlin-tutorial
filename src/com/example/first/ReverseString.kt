package com.example.first

fun reverse(myString: String) {
    var reversedString = ""
    for (i in myString.indices) {
        reversedString += myString[myString.length - 1 - i]
    }
    println("Reversed String is: $reversedString")
}

fun main() {
    reverse("Welcome")  // we did not
}