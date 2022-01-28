import java.util.*

/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<검문>>
link  : <<https://www.acmicpc.net/problem/2981>>


##### */
fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

fun main() {
    val n: Int = readLine()!!.toInt()
    val nums: Array<Int> = Array(n) { readLine()!!.toInt() }

    nums.sort()

    var tempGCD = nums[1] - nums[0]
    for (i in 2 until nums.size) tempGCD = gcd(tempGCD, nums[i] - nums[i - 1])

    for (i in 2..tempGCD) {
        if (tempGCD % i == 0) print("$i ")
    }

}


//실패 코드
//fun main() {
//    val n: Int = readLine()!!.toInt()
//    val nums: Array<Int> = Array(n) { readLine()!!.toInt() }
//
//    nums.sort()
//
//    for (i in 2..nums[0]) {
//        var flag: Boolean = true
//        for (j in 0 until nums.size - 1) { // j in 0..n-1
//            if (nums[j] % i != nums[j + 1] % i) {
//                flag = false
//                break
//            }
//        }
//
//        if (flag) print(i)
//    }
//}