'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<숫자의 합>>
  link  : <<https://www.acmicpc.net/problem/11720>>
'''

#####


n = int(input())
numbers = input()

sum = 0
for i in range(n):
    sum += int(numbers[i])

print(sum)