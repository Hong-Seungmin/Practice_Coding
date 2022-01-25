'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<상수>>
  link  : <<https://www.acmicpc.net/problem/2908>>
'''

#####


a, b = input().split()
a = int(a[::-1])
b = int(b[::-1])

print(a if a > b else b)
