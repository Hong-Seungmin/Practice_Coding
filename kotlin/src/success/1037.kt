/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<약수>>
link  : <<https://www.acmicpc.net/problem/1037>>


##### */


fun main() {
    val numCnt: Int = readLine()!!.toInt()
    val nums: List<Int> = readLine()!!.split(" ").map { it.toInt() }.sorted()

    print(nums.first() * nums.last())
}