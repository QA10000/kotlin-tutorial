package com.example.first

fun main() {
    val nameMap: HashMap<Int, String> = HashMap<Int, String>()
    nameMap.put(1, "Jon")
    nameMap.put(2, "kim")
    nameMap.put(3, "ted")
    nameMap.put(4, "wel")
    nameMap.replace(3, "FRIDAY")
    nameMap.remove(3, "FRIDAY") // i have to go have standup
    println("Traversing thru hashmap")
    for(i in nameMap.keys) {
        println("Element at key $i = ${nameMap[i]}")
    }

}