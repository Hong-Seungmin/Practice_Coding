/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<이항 계수 1>>
link  : <<https://www.acmicpc.net/problem/11050>>


##### */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        Main main = new Main();
        System.out.println(main.getBinomial(n, k));

    }

    int getBinomial(int n, int k) {
        int result = 0;

        result = getFactorial(n) / (getFactorial(k) * (getFactorial(n - k)));

        return result;
    }

    int getFactorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}