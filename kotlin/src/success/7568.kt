/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<덩치>>
link  : <<https://www.acmicpc.net/problem/7568>>


##### */


fun main() {
    val n = readLine()!!.toInt()
    var humans = mutableListOf<MutableList<Int>>()

    for (i in 0 until n) {
        var input: MutableList<Int> = readLine()!!.split(" ").map { it.toInt() } as MutableList<Int>
        input.add(1)
        humans.add(input)
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (humans[i][0] < humans[j][0] && humans[i][1] < humans[j][1]) {
                humans[i][2] += 1
            }
            else if (humans[i][0] > humans[j][0] && humans[i][1] > humans[j][1]) {
                humans[j][2] += 1
            }
        }
    }

    humans.forEach { print("${it[2]} ") }
}