package com.afarelramdani.basickotlin.kotlin

fun main () {
    print("Matematika : ")
    var mtk= readLine()
    var matematika = mtk!!.toIntOrNull()
    print("Bahasa Indonesia : ")
    var indo = readLine()
    var bindonesia = indo!!.toIntOrNull()
    print("Bahasa Inggris : ")
    var inggris = readLine()
    var binggris = inggris!!.toIntOrNull()
    print("IPA : ")
    var ipa = readLine()
    var pelajaranIPA = ipa!!.toIntOrNull()

    hasil(matematika, bindonesia, binggris, pelajaranIPA)

}

fun hasil(mtk: Int?, indo: Int?, inggris: Int?, ipa: Int?){
    if(mtk == null || indo == null || inggris == null || ipa == null) {
        print("Data Tidak Valid")
    } else {
        var grade = (mtk!! + indo!! + inggris!! + ipa!!)/4
        
//        if(grade > 90-100 ) println("A")
//        else if(grade > 80 ) println("B")
//        else if(grade > 70 ) println("C")
//        else if(grade > 60 ) println("D")
//        else  println("E")

        when (grade) {
            in 90..100 -> print("A")
            in 80..89 -> print("B")
            in 70..79 -> print("C")
            in 60..69 -> print("D")
            in 0..59 -> print("E")
            else -> print("Data Tidak Valid")

        }


    }


}
