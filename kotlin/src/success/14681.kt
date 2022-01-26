/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<사분면 고르기>>
link  : <<https://www.acmicpc.net/problem/14681>>


##### */


fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    if (x > 0 && y > 0) {
        print("1")
    } else if (x < 0 && y > 0) {
        print("2")
    } else if (x < 0 && y < 0) {
        print("3")
    } else if (x > 0 && y < 0) {
        print("4")
    }
}