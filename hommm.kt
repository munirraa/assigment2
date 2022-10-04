package com.example.kotlinbasics


fun main() {
    var temperature = 35
    while (temperature > 10){
        when (temperature){
            30 -> {
                println("Its Hot")
            }
            20 -> {
                println("Its comfy")
            }
            15 -> {
                println("Its cold")
            }
            else -> {
                println(temperature)
            }
        }
    }
    temperature--
}
