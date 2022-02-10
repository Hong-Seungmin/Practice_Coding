/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<체스판 다시 칠하기>>
link  : <<https://www.acmicpc.net/problem/1018>>


##### */


fun main() {
    val (y, x) = readLine()!!.split(" ").map { it.toInt() }
    val board = mutableListOf<String>()

    for (i in 0 until y) {
        val line = readLine()
        board.add(line!!)
    }


    var minCount = y * x
    var xxx = 0
    var yyy = 0
    for (yy in 0..y - 8) {
        for (xx in 0..x - 8) {
            val flag = board[yy][xx]
            var count = 0
            var reverseCount = 0
            for (i in yy until yy + 8) {
                for (j in xx until xx + 8) {
                    if (i % 2 == yy % 2) { //홀수 줄 ( 0부터 인덱스 시작 )
                        if (j % 2 == xx % 2) { //홀수 줄, 홀수 칸
                            if (flag != board[i][j]) count += 1
                        } else { //홀수 줄, 짝수 칸
                            if (flag == board[i][j]) count += 1
                        }
                    } else { //짝수 줄
                        if (j % 2 == xx % 2) { //짝수 줄, 홀수 칸
                            if (flag == board[i][j]) count += 1
                        } else { //짝수 줄, 짝수 칸
                            if (flag != board[i][j]) count += 1
                        }
                    }

                    //색 리버스 W=B , B=W
                    if (i % 2 == yy % 2) { //홀수 줄 ( 0부터 인덱스 시작 )
                        if (j % 2 == xx % 2) { //홀수 줄, 홀수 칸
                            if (flag == board[i][j]) reverseCount += 1
                        } else { //홀수 줄, 짝수 칸
                            if (flag != board[i][j]) reverseCount += 1
                        }
                    } else { //짝수 줄
                        if (j % 2 == xx % 2) { //짝수 줄, 홀수 칸
                            if (flag != board[i][j]) reverseCount += 1
                        } else { //짝수 줄, 짝수 칸
                            if (flag == board[i][j]) reverseCount += 1
                        }
                    }
                }
            }
            if (count < minCount) {
                xxx = xx
                yyy = yy
                minCount = count
            }
            if (reverseCount < minCount){
                xxx = xx
                yyy = yy
                minCount = reverseCount
            }
        }
    }

    println(minCount)
//    print("$xxx $yyy")

}