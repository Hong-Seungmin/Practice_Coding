'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<달팽이는 올라가고 싶다>>
  link  : <<https://www.acmicpc.net/problem/2869>>
'''

#####

import math

a, b, v = map(int, input().split())
print(math.ceil((v - a) / (a - b))+1)
