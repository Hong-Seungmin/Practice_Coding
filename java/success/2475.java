/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<검증수>>
link  : <<https://www.acmicpc.net/problem/2475>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n1 = Integer.parseInt(st.nextToken());
        long n2 = Integer.parseInt(st.nextToken());
        long n3 = Integer.parseInt(st.nextToken());
        long n4 = Integer.parseInt(st.nextToken());
        long n5 = Integer.parseInt(st.nextToken());

        long sum = n1 * n1 + n2 * n2 + n3 * n3 + n4 * n4 + n5 * n5;

        long n6 = sum % 10;

        System.out.println(n6);
    }
}