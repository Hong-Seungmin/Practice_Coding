'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<하노이 탑 이동 순서>>
  link  : <<https://www.acmicpc.net/problem/11729>>
'''


#####

def hanoi(n, start, sub, end):
    global stringArray

    if n == 1:
        stringArray.append(str(start) + ' ' + str(end))

    else:
        hanoi(n-1, start, end, sub)
        stringArray.append(str(start) + ' ' + str(end))
        hanoi(n-1, sub, start, end)


stringArray = []
n = int(input())

hanoi(n, 1, 2, 3)

print(len(stringArray))
for string in stringArray:
    print(string)
