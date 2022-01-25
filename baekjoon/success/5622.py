'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<다이얼>>
  link  : <<https://www.acmicpc.net/problem/5622>>
'''

#####


dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

str = input().upper()

delay = 0
for j in range(len(str)):
    for i in dial:
        if str[j] in i:
            delay += dial.index(i) + 3

print(delay)
