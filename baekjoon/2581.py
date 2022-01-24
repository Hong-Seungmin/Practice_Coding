'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<소수>>
  link  : <<https://www.acmicpc.net/problem/2581>>
'''


#####

def is_prime(num):
    for i in range(2, int(num / 2) + 1):
        if num % i == 0:
            return False

    return True


M = int(input())
N = int(input())

prime_nums = []
for num in range(M, N + 1):
    if num == 1:
        continue
    result = is_prime(num)
    if result:
        prime_nums.append(num)

if len(prime_nums) == 0:
    print('-1')
else:
    print(sum(prime_nums))
    print(min(prime_nums))
