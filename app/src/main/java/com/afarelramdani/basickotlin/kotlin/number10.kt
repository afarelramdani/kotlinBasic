package com.afarelramdani.basickotlin.kotlin

fun main() {
    print(" Masukkan Kata : ")
    var data = readLine().toString()
    var hasil = data!!.toLowerCase()

    if (hasil != null && hasil.isNotEmpty() ){
        words(hasil)
    } else {
        print("Data Tidak Valid")
    }

}

fun words(words: String) {
    for (value in words) {
        if (value == 'a' || value == 'i' || value == 'u' || value == 'e' || value == 'o'  ) {
            println(value)
        } else {
            continue
        }
    }
    for (value in words) {
        if (value == 'a' || value == 'i' || value == 'u' || value == 'e' || value == 'o'  ) {
            continue
        } else {
            println(value)
        }
    }

}