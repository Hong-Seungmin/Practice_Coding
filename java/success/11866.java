/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<요세푸스 문제 0>>
link  : <<https://www.acmicpc.net/problem/11866>>


##### */

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> collect = Arrays.stream(sc.nextLine().split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());
        Integer n = collect.get(0);
        Integer k = collect.get(1);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if (n != i + 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}