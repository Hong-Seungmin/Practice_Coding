'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : 팰린드롬인지 확인하기
  link  : https://www.acmicpc.net/problem/10988
'''

word = input()

if word == ''.join(reversed(word)):
    print('1')
else:
    print('0')
