package com.example.first

enum class Days(val type: String) {
    MONDAY("Working day"),// so monday here is a enum what is ordinalis the integers starts from 0 and type is what we put in bracket
    TUESDAY("Working day"),
    WEDNESDAY("Working day"),
    THURSDAY("Working day"),
    FRIDAY("Working day"),
    SATURDAY("holiday"),
    SUNDAY("holiday")
}

fun main() {
    for (day in Days.values()) {
        println("${day.ordinal} = ${day.name} ${day.type}")
    }
    println(Days.MONDAY.type)
}