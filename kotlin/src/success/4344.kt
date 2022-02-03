import kotlin.math.roundToInt

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<평균은 넘겠지>>
link  : <<https://www.acmicpc.net/problem/4344>>


##### */


fun main() {
    val testCaseCnt = readLine()!!.toInt()

    for (i in 1..testCaseCnt) {
        val gradeN: MutableList<Int> = readLine()!!.split(" ").map { it.toInt() } as MutableList<Int>

        val cntN = gradeN[0]
        gradeN.removeAt(0)

        val avg = gradeN.average()
        var cntPass = 0
        gradeN.forEach {
            if (it > avg)
                cntPass += 1
        }
        println("%.3f".format(cntPass.toDouble() / cntN * 100) + "%")
    }
}