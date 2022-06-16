/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<1로 만들기>>
link  : <<https://www.acmicpc.net/problem/1463>>


##### */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(recur(n, 0));
    }

    static int recur(int num, int count) {

        if (num < 2) {
            return count;
        }
        return Math.min(recur(num / 2, count + 1 + (num % 2)),
                        recur(num / 3, count + 1 + (num % 3)));

    }
}