/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<별 찍기 - 2>>
link  : <<https://www.acmicpc.net/problem/2439>>


##### */


fun main() {
    val n = readLine()?.toInt() ?: 0

    for (i in 1..n) {
        for (j in n - i downTo 1) print(" ")
        for (j in 1..i) print("*")
        println()
    }
}