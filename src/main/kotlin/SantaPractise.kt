package org.example

fun main() {

    givesSolution()
}

fun givesSolution() {
    val array = ("((((((((((((((())))))))))(((((((((((((()))))))))))))()()))()()" +
            "()())))))))))))))))))))))))))))(((((((((((()()()))))))")
        .split("")
        .filter { it.isNotEmpty() }
        .toTypedArray()

    val map = mutableMapOf<String, Int>()

    for(element in array) {
        val currentValue = map[element] ?: 0
        if(element == "("){
            map[element] = currentValue + 1
        } else {
            map[element] = currentValue - 1
        }
    }
    println(map)
    println(map["("]!! + map[")"]!!)
}