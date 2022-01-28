/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<더하기 사이클>>
link  : <<https://www.acmicpc.net/problem/1110>>


##### */


fun main() {
    val n: Int = readLine()?.toInt() ?: 0
    val strN: String = if (n < 10) "0$n" else n.toString()  //26

    var firstN = strN[0].toString().toInt()
    var secondN = strN[1].toString().toInt()

    var sumN: String
    var afterSumN: String
    var cnt: Int = 0
    do {
        sumN = if (firstN + secondN < 10) "0${firstN + secondN}" else (firstN + secondN).toString() //8
        afterSumN = "${secondN}${sumN[1]}" //68

        firstN = afterSumN[0].toString().toInt()
        secondN = afterSumN[1].toString().toInt()
        cnt += 1

    } while (strN != afterSumN)

    print(cnt)
}