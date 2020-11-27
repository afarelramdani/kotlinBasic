package com.afarelramdani.basickotlin.kotlin

fun main() {
    print("Masukkan Kata : ")
    var kata = readLine()
    var arrayKata = kata!!.toCharArray()
    var jumlahKata = kata!!.count()

    if(jumlahKata >= 0) {
        var newKata = arrayKata[jumlahKata].toString()
        jumlahKata--
        print(newKata)
    }
}



