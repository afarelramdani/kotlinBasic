package com.afarelramdani.basickotlin.kotlin

fun main() {
    //CARA 1
    caraPertama()

    //CARA 2
    //caraKedua()

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
