'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<단어 공부>>
  link  : <<https://www.acmicpc.net/problem/1157>>
'''

#####


str = input().upper()
unique_str = list(set(str))

cnt_chr = []
max = 0
for c in unique_str:
    cnt = str.count(c)
    cnt_chr.append(cnt)
    if max < cnt:
        max = cnt

if cnt_chr.count(max) > 1:
    print("?")
else:
    print(unique_str[cnt_chr.index(max)])
