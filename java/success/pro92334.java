/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==프로그래머스==
title : <<신고 결과 받기>>
link  : <<https://programmers.co.kr/learn/courses/30/lessons/92334?language=java#>>


##### */

import java.util.*;

public class Main {
    public static void main(String[] args){

        Main main = new Main();
        int[] solution = main.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{
                "muzi frodo",
                "apeach frodo",
                "frodo neo",
                "muzi neo",
                "apeach muzi"
        }, 2);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, User> userMap = new HashMap<>();
        Map<String, List<User>> listMap = new HashMap<>();
        for (String id : id_list) {
            userMap.put(id, new User(id));
            listMap.put(id, new ArrayList<>());
        }


        for (String s : report) {
            String[] split = s.split(" ");
            List<User> userList = listMap.get(split[0]);

            User user = userMap.get(split[1]);
            if (user.contains(split[0])) {
                continue;
            }
            user.addUser(split[0]);
            user.increase();
            userList.add(user);
        }

        int i = 0;
        for (String s : id_list) {
            List<User> users = listMap.get(s);
            int check = 0;
            for (User user : users) {
                if (user.getCnt() >= k) {
                    check += 1;
                }
            }
            answer[i] = check;
            i += 1;
        }

        return answer;
    }

    class User {
        String name;
        int cnt = 0;
        Set<String> users = new HashSet<>();

        public User(String name) {
            this.name = name;
        }

        public boolean contains(String user) {
            return users.contains(user);
        }

        public void addUser(String user) {
            users.add(user);
        }

        public void increase() {
            this.cnt += 1;
        }

        public int getCnt() {
            return cnt;
        }
    }

}