'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<터렛>>
  link  : <<https://www.acmicpc.net/problem/1002>>
'''

#####

testCnt = int(input())

for _ in range(testCnt):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())

    distance = ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5
    sum_r = r1 + r2
    minus_r = abs(r1 - r2)
    if distance == 0:
        if r1 == r2:
            print(-1)
        else:
            print(0)
    else:
        if distance == sum_r or distance == minus_r:
            print(1)
        elif sum_r > distance > minus_r:
            print(2)
        else:
            print(0)
