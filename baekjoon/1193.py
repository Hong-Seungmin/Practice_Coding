'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<분수찾기>>
  link  : <<https://www.acmicpc.net/problem/1193>>
'''

#####

n = int(input())
lineNum = 0
lineMaxNum = 0

while n > lineMaxNum:
    lineNum += 1
    lineMaxNum += lineNum

jumpCnt = lineMaxNum - n

# print(f"n {n} lineNum {lineNum} lineMaxNum {lineMaxNum} jumpCnt {jumpCnt}")
if lineNum % 2 == 0:
    print(f"{lineNum-jumpCnt}/{1+jumpCnt}")
else:
    print(f"{1 + jumpCnt}/{lineNum - jumpCnt}")



# n = int(input())
# a = 1
# b = 1
# flag = True  # True면 내려가기, False면 올라가기
# for i in range(n - 1):
#     if a == 1 and flag:
#         b += 1
#         flag = False
#         continue
#     elif b == 1 and not flag:
#         a += 1
#         flag = True
#         continue
#     if flag:
#         a -= 1
#         b += 1
#     else:
#         a += 1
#         b -= 1
#
# print(f"{a}/{b}")
