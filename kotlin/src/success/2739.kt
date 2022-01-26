import java.util.*

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<구구단>>
link  : <<https://www.acmicpc.net/problem/2739>>


##### */


fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for (i in 1..9)
        println("$n * $i = ${n * i}")
}