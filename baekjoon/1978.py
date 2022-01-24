'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<소수 찾기>>
  link  : <<https://www.acmicpc.net/problem/1978>>
'''


#####

def is_prime(num):
    for i in range(2, int(num / 2) + 1):
        if num % i == 0:
            return False

    return True


n = int(input())

nums = map(int, input().split())
count = 0
for num in nums:
    if num == 1:
        continue
    result = is_prime(num)
    if result:
        count += 1

print(count)
