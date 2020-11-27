package com.afarelramdani.basickotlin.kotlin

fun main() {
    print(" Masukkan Kata : ")
    var data = readLine()
    if (data != null) {
        words(data)
    }

}

fun words(words: String) {
    for (value in words) {
        if (value == 'a' || value == 'i' || value == 'u' || value == 'e' || value == 'o'  || value == 'A' || value == 'I' || value == 'U' || value == 'E' || value == 'O') {
            println(value)
        } else {
            continue
        }
    }
    for (value in words) {
        if (value == 'a' || value == 'i' || value == 'u' || value == 'e' || value == 'o'  || value == 'A' || value == 'I' || value == 'U' || value == 'E' || value == 'O') {
            continue
        } else {
           println(value)
        }
    }

}