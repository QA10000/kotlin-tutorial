package com.example.first

import com.sun.xml.internal.fastinfoset.util.StringArray

var myName: String = "jon"
val age: Int = 35
var x: Short = 10 //-32768 to 32767
var y: Byte = 11 //-128 t0 128
var z: Long = 34535 //64bit
var w: Float = 24.2f //32bit
var l: Double = 23.3 //64bit
var c: Char = 's'
var d: Boolean = true
var array = arrayOf(1, 2, 3, 4, 5) // we can do 10:30 my time  ok, thank you I have some question for my project will ask bye
var myArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
var myArray1 = arrayOf<String>("john", "Raam", "Mohan", "kim")
var myArray2 = arrayOf("1", "2", "3", "4", "5")

fun main() {             // so in java we use reverse iteration how I can do that in kotlin?
    for(element in myArray1) { // ok
        print(element + ", ")
    }
println(myArray2.get(3).toInt() + myArray2.get(4).toInt())
    var sum = 0
    for(element in myArray2) {
        sum += element.toInt()
        sum = sum + element.toInt() // ok
    }
    println("Summation of the elements in array is: " + sum)  // ok

   /*  myArray.set(4, 6)
    println(myArray[4])
    println(myArray[2])
    println(myArray.get(4))
    println("Hello world") // kotlin can run main method without any argument
    println(myName)
    myName = "sam"
    println(myName)
    println(age)
    println(x)
    println(y)
    println(z)
    println(w)
    println(l)
    println(c)
    println(d)
    var first = array[0]
    var last = array[array.size - 1]
    println(first)
    println(last)*/

} // that will be in line 2?