'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : 배수와 약수
  link  : https://www.acmicpc.net/problem/5086
'''

#####

while True:
    num1, num2 = map(int, input().split())

    if num1 == num2 == 0:
        break
    elif (num1 % num2) == 0:
        print("multiple")
    elif (num2 % num1) == 0:
        print("factor")
    else:
        print("neither")