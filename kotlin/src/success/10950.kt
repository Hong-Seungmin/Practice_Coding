import java.util.*

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<A+B - 3>>
link  : <<https://www.acmicpc.net/problem/10950>>


##### */


fun main() {
    val testCnt: Int = readLine()!!.toInt()

    val sc: Scanner = Scanner(System.`in`)
    for (i in 0 until testCnt){
        val a = sc.nextInt()
        val b = sc.nextInt()

        println(a + b)
    }
}