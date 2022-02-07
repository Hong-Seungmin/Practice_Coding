/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<블랙잭>>
link  : <<https://www.acmicpc.net/problem/2798>>


##### */


fun main() {
    val input: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    val cards: List<Int> = readLine()!!.split(" ").map { it.toInt() }

    var flag:Boolean = false
    var max: Int = 0
    for (i in cards.indices){
        for( j in i+1 until cards.size) {
            for (k in j+1 until cards.size) {
                val sum: Int = cards[i] + cards[j] + cards[k]
                if (max < sum && sum <= input[1])
                    max = sum
                if (max == input[1]) {
                    flag = true
                    break
                }
            }
            if (flag)
                break
        }
        if (flag)
            break
    }

    print(max)
}