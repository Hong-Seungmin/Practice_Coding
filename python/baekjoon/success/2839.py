'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<설탕 배달>>
  link  : <<https://www.acmicpc.net/problem/2839>>
'''

#####

n = int(input())
fiveKg = 0
threeKg = 0

while n >= 5 and n not in (6, 9, 12):
    fiveKg += 1
    n -= 5

while n >= 3:
    threeKg += 1
    n -= 3

if n != 0:
    fiveKg = -1
    threeKg = 0

print(fiveKg + threeKg)
