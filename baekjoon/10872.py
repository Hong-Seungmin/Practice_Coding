'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<팩토리얼>>
  link  : <<https://www.acmicpc.net/problem/10872>>
'''


#####
def factorial(n):
    if n <= 1:
        return 1
    else:
        return factorial(n - 1) * n


N = int(input())
print(factorial(N))
