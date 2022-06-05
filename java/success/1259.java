/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

link  : <<https://www.acmicpc.net/problem/1259>>


##### */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.nextLine();

            if (num.equals("0")) {
                break;
            }

            boolean flag = true;
            int right = num.length() - 1;
            for (int left = 0; left < right; left++) {
                if (num.charAt(left) != num.charAt(right)) {
                    flag = false;
                    break;
                }
                right -= 1;
            }

            System.out.println(flag ? "yes" : "no");
        }
    }
}
