/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<수 정렬하기>>
link  : <<https://www.acmicpc.net/problem/2750>>


##### */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for (int i : array){
            System.out.println(i);
        }
    }
}