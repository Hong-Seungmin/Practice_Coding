'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<손익분기점>>
  link  : <<https://www.acmicpc.net/problem/1712>>
'''

#####

a, b, c = map(int, input().split())

if c - b == 0:
    print(-1)
else:
    result = int(a / (c - b)) + 1
    print(result if result > 0 else -1)
