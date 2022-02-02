/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<숫자의 개수>>
link  : <<https://www.acmicpc.net/problem/2577>>


##### */


fun main() {
    val n: Int = readLine()!!.toInt() * readLine()!!.toInt() * readLine()!!.toInt()
    val strN: List<Char> = n.toString().toList().sorted()

    var cnt: Int = 0
    for (i in 0..9) {
        var n = 0;
        try {
            while (strN[cnt].toInt() - 48 == i) {
                n += 1
                cnt += 1
            }
        }catch (e: Exception){

        }
        println(n)
    }

}