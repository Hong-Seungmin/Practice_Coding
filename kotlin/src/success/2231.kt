/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<분해합>>
link  : <<https://www.acmicpc.net/problem/2231>>


##### */


fun main() {
    val n: Int = readLine()!!.toInt()

    for (i in 1..n) {
        val str = i.toString()
        var sum: Int = i

        str.forEach {
            sum += (it - '0')
        }
        if (sum == n) {
            print(str)
            break
        }else if (i == n && sum != n){
            print("0")
        }
    }
}