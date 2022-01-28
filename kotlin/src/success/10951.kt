import java.lang.Exception

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<A+B - 4>>
link  : <<https://www.acmicpc.net/problem/10951>>


##### */


fun main() {
    while (true) {
        try {
            val input: List<Int> = readLine()!!.split(" ")!!.map { it.toInt() }

            val a: Int = input[0]
            val b: Int = input[1]

            println(a + b)
        }catch (e: Exception){
            break
        }
    }
}