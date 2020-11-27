package com.afarelramdani.basickotlin.kotlin

fun main() {
    print("Masukkan Kata : ")
    var kata = readLine()

    var newKata = kata!!.split(" ")
    var kataku = newKata.asReversed()

    for(kata in kataku)
    {
        print("$kata ")
    }
}
