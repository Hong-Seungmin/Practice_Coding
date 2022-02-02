/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<평균>>
link  : <<https://www.acmicpc.net/problem/1546>>


##### */


fun main() {
    val n: Int = readLine()!!.toInt()
    val points = readLine()!!.split(" ").map { it.toInt() }

    val maxN: Int? = points.maxOrNull()
    val newAvg = (points.sum() / maxN!!.toDouble()) * 100.0 / points.size

    println(newAvg)
}