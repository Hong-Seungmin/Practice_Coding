/*
author : Hong Seungmin
github : https://github.com/Hong-SeungMin
email  : globalsh1@gmail.com

link  : <<https://www.acmicpc.net/problem/1013>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String pattern = "(100+1+|01)+";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            if (input.matches(pattern)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}
