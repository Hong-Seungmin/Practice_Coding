/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<나머지>>
link  : <<https://www.acmicpc.net/problem/3052>>


##### */


fun main() {
    var setN = mutableSetOf<Int>()

    for ( i in 0..9){
        val n = readLine()!!.toInt() % 42
        setN.add(n)
    }

    print(setN.size)
}