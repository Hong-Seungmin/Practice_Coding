'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<알파벳 찾기>>
  link  : <<https://www.acmicpc.net/problem/10809>>
'''

#####


S = input()

for c in range(97, 123):
    result = S.find(chr(c))
    print(result, end=' ')