package com.afarelramdani.basickotlin.kotlin
import java.util.Scanner

fun main () {
    val input = Scanner(System.`in`)
    print(" MATEMATIKA : ")

    var mtk = input.nextInt()
    print(" INDONESIA : ")
    var indo = input.nextInt()
    print(" INGGRIS : ")
    var inggris = input.nextInt()
    print(" IPA : ")
    var ipa = input.nextInt()


    grade(mtk, indo, inggris, ipa)
}

fun grade(mtk: Int?, indo: Int?, inggris: Int?, ipa: Int?){
    var grade = (mtk!! + indo!! + inggris!! + ipa!!)/4
    if(grade >= 90 ) println("A")
    else if(grade >= 80 ) println("B")
    else if(grade >= 70 ) println("C")
    else if(grade >= 60 ) println("D")
    else  println("E")
}
