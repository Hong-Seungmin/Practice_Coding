/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<제로>>
link  : <<https://www.acmicpc.net/problem/10773>>


##### */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                list.remove(list.size() - 1);
                continue;
            }

            list.add(num);
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println(sum);
    }
}