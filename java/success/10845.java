/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<큐>>
link  : <<https://www.acmicpc.net/problem/10845>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> list = new ArrayList<>();
    private static int lastIndex = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            process(s);
        }
    }

    private static void process(String[] s) {
        switch (s[0]) {
            case "push":
                push(Integer.parseInt(s[1]));
                break;
            case "pop":
                System.out.println(pop());
                break;
            case "size":
                System.out.println(size());
                break;
            case "empty":
                System.out.println(empty());
                break;
            case "front":
                System.out.println(front());
                break;
            case "back":
                System.out.println(back());
                break;
        }
    }

    private static void push(int n) {

        list.add(n);
        lastIndex += 1;
    }

    private static int pop() {

        if (empty() == 1) {
            return -1;
        }

        int res = list.remove(0);
        lastIndex -= 1;
        return res;
    }

    private static int size() {

        return lastIndex + 1;
    }

    private static int empty() {

        if (size() == 0) {
            return 1;
        }

        return 0;
    }

    private static int front() {

        if (empty() == 1) {
            return -1;
        }

        return list.get(0);
    }

    private static int back() {

        if (empty() == 1) {
            return -1;
        }

        return list.get(list.size() - 1);
    }
}