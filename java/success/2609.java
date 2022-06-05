/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<최대공약수와 최소공배수>>
link  : <<https://www.acmicpc.net/problem/2609>>


##### */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num2 > num1) { // a가 b보다 크도록
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        for(int i = num2; i > 0; i-- ){
            if(num2 % i == 0 && num1 % i == 0){
                System.out.println(i);
                break;
            }
        }

        for(int i = num1; i < 100000000; i++){
            if(i % num1 == 0 && i % num2 ==0){
                System.out.println(i);
                break;
            }
        }
    }
}