'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<Fly me to the Alpha Centauri>>
  link  : <<https://www.acmicpc.net/problem/1011>>
'''

#####

testCnt = int(input())

result = []
for _ in range(testCnt):
    x, y = map(int, input().split())

    tagetDistance = y - x

    num = 1
    incrementalCnt = 1
    flag = False
    dgit = 0

    while num <= tagetDistance:
        num += incrementalCnt
        dgit += 1
        if flag:
            incrementalCnt += 1
            flag = False
        else:
            flag = True

    result.append(dgit)

for p in result:
    print(p)