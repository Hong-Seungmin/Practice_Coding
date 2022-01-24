'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<직각삼각형>>
  link  : <<https://www.acmicpc.net/problem/4153>>
'''


#####

def calc(side1, side2, side3):
    return (side1 * side1) + (side2 * side2) - (side3 * side3)


while True:
    a, b, c = map(int, input().split())

    if a + b + c == 0:
        break

    if calc(a, b, c) == 0 or calc(b, c, a) == 0 or calc(c, a, b) == 0:
        print("right")
    else:
        print("wrong")
