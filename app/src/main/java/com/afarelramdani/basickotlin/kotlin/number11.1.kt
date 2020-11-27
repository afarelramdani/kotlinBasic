package com.afarelramdani.basickotlin.kotlin

fun main() {
    print("Masukkan Kata : ")
    var kata = readLine()
    if (kata!!.length >= 3) {
        var newKata = kata!!.reversed()
        if(newKata == kata ) {
            print("Palindrom")
        } else {
            print("Bukan Palindrom")
        }
    } else {
        print("Data Tidak Valid")
    }

}