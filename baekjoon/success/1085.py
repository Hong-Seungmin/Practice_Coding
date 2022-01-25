'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<직사각형에서 탈출>>
  link  : <<https://www.acmicpc.net/problem/1085>>
'''

#####

list = list(map(int, input().split()))

list.append(list[2] - list[0])
list.append(list[3] - list[1])

print(min(list))