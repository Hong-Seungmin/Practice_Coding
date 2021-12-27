'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : 상근이의 친구들
  link  : https://www.acmicpc.net/problem/5717
'''

#####

while True:
    m, f = map(int, input().split())
    if m == f == 0:
        break;
    print(f + m)
