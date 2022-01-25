'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<부녀회장이 될테야>>
  link  : <<https://www.acmicpc.net/problem/2775>>
'''

#####

testCnt = int(input())
result = []
for _ in range(testCnt):
    k = int(input())
    n = int(input())

    sum = [i for i in range(1, n + 1)]
    for _ in range(k):
        for i in range(1, n):
            sum[i] += sum[i - 1]
    result.append(sum[-1])

for c in result:
    print(c)