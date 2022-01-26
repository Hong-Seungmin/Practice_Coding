/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<합>>
link  : <<https://www.acmicpc.net/problem/8393>>


##### */


fun main() {
    val n: Int = readLine()!!.toInt()

    var sum: Int = 0
    for( i: Int in 1..n  ) sum += i

    print(sum)
}