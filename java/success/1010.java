/*
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

link  : <<https://www.acmicpc.net/problem/1010>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {

        /*
        nCr = (n-1Cr-1) + (n-1Cr)
        nC0 = 1
        nCn = 1
         */
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
기
            sb.append(dp[m][n]).append('\n');
        }
        System.out.println(sb);
    }

    /*
    시간초과 뜬다.
     */
    public static int combination(int m, int n) {
        if (dp[m][n] > 0) {
            return dp[m][n];
        }
        if (n == 0 || m == n) {
            dp[m][n] = 1;
            return dp[m][n];
        }

        return combination(m - 1, n - 1) + combination(m - 1, n);
    }
}
