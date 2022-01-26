/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<별 찍기 - 1>>
link  : <<https://www.acmicpc.net/problem/2438>>


##### */


fun main() {
    val n: Int = readLine()?.toInt() ?: 0

    for (i : Int in 1..n){
        for (j: Int in 1..i) print("*")
        println()
    }
}