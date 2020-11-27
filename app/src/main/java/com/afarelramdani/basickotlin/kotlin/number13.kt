package com.afarelramdani.basickotlin.kotlin

fun main() {
    deretAngka(1213343)

}

fun deretAngka(angka: Int) {
    //Divide
    var pisahAngka = angka.toString().split("0")
    for(data in pisahAngka) {
        //SORT
        var newData: List<Char> = data.map { it }.sorted()
        for (k in newData)
        {
            print(k)
        }
    }
}