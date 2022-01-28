/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<X보다 작은 수>>
link  : <<https://www.acmicpc.net/problem/10871>>


##### */


fun main() {
    var input: List<String> = readLine()!!.split(" ")

    val n: Int = input[0].toInt()
    val x: Int = input[1].toInt()

    input = readLine()!!.split(" ")
    for (i in 0 until n){
        if( input[i].toInt() < x )
            print(input[i] + " ")
    }
}