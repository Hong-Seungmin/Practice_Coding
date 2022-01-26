'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<피보나치 수 5>>
  link  : <<https://www.acmicpc.net/problem/10870>>
'''


#####

def fibonacci(n):
    if n <= 1:
        return n

    return fibonacci(n-1)+fibonacci(n-2)


n = int(input())
print(fibonacci(n))
