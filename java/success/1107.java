/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<리모컨>>
link  : <<https://www.acmicpc.net/problem/1107>


##### */

import java.util.Scanner;

public class Main {

    static boolean[] broken = new boolean[10];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            broken[x] = true;
        }

        int ans = Math.abs(n - 100);

        for (int i = 0; i < 1000000; i++) {
            int c = i;
            int len = check(c);
            if (len > 0) {
                int press = Math.abs(c - n);
                if (ans > len + press) {
                    ans = len + press;
                }

            }

        }
        System.out.println(ans);
    }

    static int check(int c) {
        if (c == 0) { //0일때 예외처리
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (c > 0) {
            if (broken[c % 10]) {
                return 0;
            }
            len += 1;
            c /= 10;
        }
        return len;
    }
}