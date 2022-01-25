'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<크로아티아 알파벳>>
  link  : <<https://www.acmicpc.net/problem/2941>>
'''

#####

croatia_str = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

str = input()

for c in croatia_str:
    str = str.replace(c, '_')

print(len(str))
