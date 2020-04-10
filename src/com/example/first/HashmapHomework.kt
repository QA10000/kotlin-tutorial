package com.example.first

fun main() {
    val nameAgeMap: HashMap<Int, String> = HashMap<Int, String>()
    nameAgeMap.put(23, "Jon")
    nameAgeMap.put(33, "Sam")
    nameAgeMap.put(40, "Pam")
    nameAgeMap.put(22, "Jam")
    nameAgeMap.put(11, "Ram") // we printed age and name together so not just age
    for (i in nameAgeMap.keys) {
        if ("$i" > 30.toString()) { // we can not have two types of data types so we converted 30 to string
            println("User age is  $i and name is ${nameAgeMap[i]}") // so can we change this = to and ok we can continue
        }
    }
}