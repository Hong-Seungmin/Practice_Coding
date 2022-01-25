'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<그룹 단어 체커>>
  link  : <<https://www.acmicpc.net/problem/1316>>
'''

#####


def is_group_word(word):


    return True



testCnt = int(input())

cnt = 0
for _ in range(testCnt):
    word = input()
    result = is_group_word(word)
    if result:
        cnt += 1

print(cnt)