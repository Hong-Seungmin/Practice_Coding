/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<두 수 비교하기>>
link  : <<https://www.acmicpc.net/problem/1330>>


##### */


fun main() {
    val num_array = readLine()!!.split(" ")

    if (num_array[0].toInt() < num_array[1].toInt()) {
        print("<")
    } else if (num_array[0].toInt() > num_array[1].toInt()) {
        print(">")
    } else {
        print("==")
    }
}