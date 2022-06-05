/*
author : Hong Seungmin
github : https://github.com/Hong-Seungmin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
title : <<통계학>>
link  : <<https://www.acmicpc.net/problem/2108>>


##### */

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int[] nums;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        System.out.println(avg());
        System.out.println(mid());
        System.out.println(mode());
        System.out.println(range());
    }

    private static long avg() {
        return Math.round(Arrays.stream(nums).average().getAsDouble());
    }

    private static long mid() {
        return nums[nums.length / 2];
    }

    private static long mode() {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int maxCount = map.values().stream().max(Integer::compareTo).get();

        List<Integer> collect = map.entrySet()
                                   .stream().filter(t->t.getValue().equals(maxCount))
                                   .sorted((o1, o2) -> o2.getKey() - o1.getKey())
                                   .map(Map.Entry::getKey).collect(Collectors.toList());

        if (collect.size() == 1) {
            return collect.get(0);
        }
        return collect.get(collect.size() - 2);
    }

    private static long range() {
        if (nums.length == 1)
            return 0;

        return nums[nums.length - 1] - nums[0];
    }
}