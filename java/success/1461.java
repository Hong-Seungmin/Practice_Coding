/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

link  : <<https://www.acmicpc.net/problem/1461>>


##### */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];


        int cnt = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < 0) {
                cnt += 1;
            }
        }

        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < cnt; i += m) {
            result += Math.abs(nums[i] * 2);
        }
        for (int i = n - 1; i >= cnt; i -= m) {
            result += Math.abs(nums[i] * 2);
        }

        result -= Math.max(Math.abs(nums[0]), Math.abs(nums[n - 1]));

        System.out.println(result);
    }
}
