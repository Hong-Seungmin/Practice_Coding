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
    array_char = []

    for i in range(len(word)):
        if word[i] in array_char:
            if word[i] == word[i-1]:
                continue
            else:
                return False
        array_char.append(word[i])

    return True


testCnt = int(input())

cnt = 0
for _ in range(testCnt):
    word = input()

    if is_group_word(word):
        cnt += 1

print(cnt)
