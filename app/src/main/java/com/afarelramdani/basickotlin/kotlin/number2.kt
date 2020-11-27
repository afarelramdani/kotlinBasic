package com.afarelramdani.basickotlin.kotlin

fun main() {
    //CARA 1
    caraPertama()

    //CARA 2
    caraKedua()

    //CARA 3
    caraKetiga()
}

fun caraPertama () {
    var x = 10
    var y = 20

    y -= x
    x += y

    println("X : $x")
    println("Y : $y")
}

fun caraKedua() {
    var x = 10
    var y = 20

    y = y - x
    x = x + y

    println("X : $x")
    println("Y : $y")
}
fun caraKetiga() {
    var x = 10
    var y = 20

    x = x xor y
    println(x)
    y = x xor y
    println(y)
    x = x xor y
    println(x)
    println("X : $x")
    println("Y : $y")
}
