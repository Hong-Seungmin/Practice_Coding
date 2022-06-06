/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<Hashing>>
link  : <<https://www.acmicpc.net/problem/15829>>


##### */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String str = sc.nextLine();

        long result = hashing(str);
        System.out.println(result);
    }

    private static long hashing(String str) {
        int r = 31;
        int m = 1234567891;
        int l = str.length();

        long sum = 0;
        long pow = 1;
        for (int i = 0; i < l; i++) {
            sum += (str.charAt(i) - 'a' + 1) * pow % m;
            pow = pow * r % m;
        }

        return sum % m;
    }
}