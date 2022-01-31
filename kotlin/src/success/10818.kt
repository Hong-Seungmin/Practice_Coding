/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<최소, 최대>>
link  : <<https://www.acmicpc.net/problem/10818>>


##### */


fun main() {
    val cnt = readLine()!!.toInt()
    var input: List<Int> = readLine()!!.split(" ").map { it.toInt() }

    print("${input.minOrNull()} ${input.maxOrNull()}")
}