package com.afarelramdani.basickotlin.kotlin

fun main() {

    print("Masukkan Jumlah Baris Segitiga : ")
    var x = readLine()!!.toIntOrNull()

    if (x != null) {
        for(x in x downTo 1 ) {
            println("")

            for(y in 1..x)
                print(y)
        }
    }
    else {
        print("Data Tidak Valid")
    }
}