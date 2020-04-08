package com.example.first

fun checkPalindrome(myString: String) {
    var myReversString = ""
    for (i in myString.indices) {
        myReversString += myString[myString.length -1 -i]
    }
    if(myReversString.equals(myString)) {
        print ("$myString is a palindrome")
    } else {
        print ("$myString is not a palindrome")
    }
}

fun main() {
    checkPalindrome("welcome")
}