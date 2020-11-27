package com.afarelramdani.basickotlin.kotlin

fun main() {
    tahunKabisat(2004)
}

fun tahunKabisat(tahun: Int) {
    if(tahun%400 == 0) {
        print("$tahun Merupakan tahun kabisat")
    } else if (tahun%100 == 0) {
        print("$tahun Bukan tahun kabisat")
    } else if (tahun%4 == 0) {
        print("$tahun Merupakan tahun kabisat")
    } else {
        print("$tahun Bukan Tahun Kabisat")
    }

}