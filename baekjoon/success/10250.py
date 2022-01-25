'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<ACM 호텔>>
  link  : <<https://www.acmicpc.net/problem/10250>>
'''

#####

testCnt = int(input())

result = []
for _ in range(testCnt):
    h, w, n = map(int, input().split())
    if n % h == 0:
        y = h
        x = (n // h)
    else:
        y = n % h
        x = (n // h) + 1

    result.append("%d%02d" % (y, x))

for p in result:
    print(p)
