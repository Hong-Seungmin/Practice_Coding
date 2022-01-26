/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<1998년생인 내가 태국에서는 2541년생?!>>
link  : <<https://www.acmicpc.net/problem/18108>>


##### */


fun main() {
    val year = readLine()
    print("${(year?.toInt() ?: 0) - (2541 - 1998)}")
}