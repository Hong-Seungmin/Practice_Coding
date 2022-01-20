'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<벌집>>
  link  : <<https://www.acmicpc.net/problem/2292>>
'''

#####

n = int(input())

count = 1
currentNum = 1
while currentNum < n:
    currentNum += count * 6
    count += 1

print(count)