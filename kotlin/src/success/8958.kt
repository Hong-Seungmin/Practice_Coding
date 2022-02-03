/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<OX퀴즈>>
link  : <<https://www.acmicpc.net/problem/8958>>


##### */


fun main() {
    val testCaseCnt = readLine()!!.toInt()

    for (i in 1..testCaseCnt) {
        var point = 0
        var increaseN = 0

        val str = readLine()
        str!!.forEach {
            if (it == 'O') {
                increaseN += 1
            } else {
                increaseN = 0
            }
            point += increaseN
        }
        println(point)
    }
}