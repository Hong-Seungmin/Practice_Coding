import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<빠른 A+B>>
link  : <<https://www.acmicpc.net/problem/15552>>


##### */


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCnt = readLine()!!.toInt()
    for(i in 0 until testCnt){
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        bw.write((a+b).toString() + "\n")
    }
    bw.flush()

    bw.close()
    br.close()
}