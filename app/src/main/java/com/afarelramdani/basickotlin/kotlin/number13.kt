package com.afarelramdani.basickotlin.kotlin

fun main() {
    print("Masukkan Angka : ")
    var angka  = readLine()!!.toLongOrNull()
    if (angka != null) {
        deretAngka(angka)
    } else {
        print("Data Tidak Valid")


    }

}

fun deretAngka(angka: Long) {
    var divided = angka.toString().split("0")
    for(data in divided) {

        var Sort: List<Char> = data.map { it }.sorted()
        for (k in Sort)
        {
            print(k)
        }
    }
}