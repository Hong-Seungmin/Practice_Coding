'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<별 찍기 - 10>>
  link  : <<https://www.acmicpc.net/problem/2447>>
'''


def recursove_star(n):
    if n == 1:
        return ['*']

    stars = recursove_star(n // 3)
    array = []

    for star in stars:
        array.append(star * 3)
    for star in stars:
        array.append(star + ' ' * (n // 3) + star)
    for star in stars:
        array.append(star * 3)

    return array


n = int(input())
print('\n'.join(recursove_star(n)))

# 참고 사이트 https://cotak.tistory.com/38