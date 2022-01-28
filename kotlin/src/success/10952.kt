/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<A+B - 5>>
link  : <<https://www.acmicpc.net/problem/10952>>


##### */


fun main() {

    while (true) {
        var nums = readLine()!!.split(" ")!!.map { it.toInt() }
        var a = nums[0]
        var b = nums[1]

        if (a + b == 0)
            break

        println(a + b)

    }
}