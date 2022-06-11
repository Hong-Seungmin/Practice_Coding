/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<Z>>
link  : <<https://www.acmicpc.net/problem/1074>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int r;
    private static int c;
    private static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        recurve(0, 0, (int) Math.pow(2, n));
        System.out.println(result);
    }

    private static void recurve(int curR, int curC, int size) {

        if (size == 1) {
            return;
        }
        int newSize = size / 2;
        if (r < curR + newSize && c < curC + newSize) {
            recurve(curR, curC, newSize);
        } else if (r < curR + newSize && c >= curC + newSize) {
            result += size * size / 4;
            recurve(curR, curC + newSize, newSize);
        } else if (r >= curR + newSize && c < curC + newSize) {
            result += size * size / 4 * 2;
            recurve(curR + newSize, curC, newSize);
        } else if (r >= curR + newSize && c >= curC + newSize) {
            result += size * size / 4 * 3;
            recurve(curR + newSize, curC + newSize, newSize);
        }
    }
}