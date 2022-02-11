package success;/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<영화감독 숌>>
link  : <<https://www.acmicpc.net/problem/1436>>


##### */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;
        int num = 666;

        while (cnt != n) {
            num = num + 1;
            if (Integer.toString(num).contains("666"))
                cnt = cnt + 1;
        }

        System.out.println(num);
    }
}