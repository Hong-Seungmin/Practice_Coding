/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<케빈 베이컨의 6단계 법칙>>
link  : <<https://www.acmicpc.net/problem/1389>>


##### */

import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static int[][] distance;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        distance = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) distance[i][j] = 0;
                else distance[i][j] = 9999;
            }
        }

        for (int i = 0; i < m; i++) {
            int sV = sc.nextInt();
            int eV = sc.nextInt();
            distance[sV][eV] = 1;
            distance[eV][sV] = 1;
        }

        floyd();

        int[] result = new int[n + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += distance[i][j];
            }
            result[i] = sum;
            if (sum < min) {
                min = sum;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (result[i] == min) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void floyd() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    distance[j][k] = Math.min(distance[j][i] + distance[i][k], distance[j][k]); //최단경로 초기화
                }
            }
        }
    }
}