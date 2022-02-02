/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<최댓값>>
link  : <<https://www.acmicpc.net/problem/2562>>


##### */


fun main() {
    var max: Int = 0
    var cnt: Int = 0
    for (i in 1..9){
        val n:Int = readLine()!!.toInt()

        if( n > max ) {
            max = n
            cnt = i
        }
    }

    println(max)
    println(cnt)
}