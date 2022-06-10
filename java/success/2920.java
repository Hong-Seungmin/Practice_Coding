/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<음계>>
link  : <<https://www.acmicpc.net/problem/2920>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        String result = "mixed";
        for (int i = 0; i < 7; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                result = "ascending";
            } else if (nums[i] == nums[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}