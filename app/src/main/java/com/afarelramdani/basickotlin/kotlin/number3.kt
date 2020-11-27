package com.afarelramdani.basickotlin.kotlin

fun main () {
    //Check If Ganjil -> odd, if Genap -> Even
    ganjilGenap()
}

fun ganjilGenap() {
    print("Masukkan Angka : ")

    val nilai: Int? = readLine()?.toIntOrNull()
    if(nilai !== null)
    {
        if(nilai!! % 2 == 0 ) {
            println("The Number Is Even")
        } else
            println("The Number Is ODD")
    } else {
        print("Data Tidak Valid")
    }



}