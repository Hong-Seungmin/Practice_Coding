/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<DFS와 BFS>>
link  : <<https://www.acmicpc.net/problem/1260>>


##### */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    static StringBuilder sb = new StringBuilder();

    static boolean[] visited;
    static int[][] edges;

    static int node, edge, sV;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        sV = Integer.parseInt(st.nextToken());

        edges = new int[node+1][node+1];
        visited = new boolean[node+1];

        for(int i = 0; i < edge; i ++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            edges[a][b] = edges[b][a] =  1;
        }
        //sb.append("\n");
        dfs(sV);
        sb.append("\n");
        visited = new boolean[node+1];

        bfs(sV);

        System.out.println(sb);

    }
    public static void dfs(int start) {

        visited[start] = true;
        sb.append(start).append(" ");

        for(int i = 0 ; i <= node ; i++) {
            if(edges[start][i] == 1 && !visited[i])
                dfs(i);
        }

    }

    public static void bfs(int start) {
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            start = q.poll();
            sb.append(start).append(" ");

            for(int i = 1 ; i <= node ; i++) {
                if(edges[start][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}