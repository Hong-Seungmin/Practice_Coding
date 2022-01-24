'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<title>>
  link  : <<link>>
'''


#####

def is_prime(num):
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False

    return True


M, N = map(int, input().split())

prime_nums = []
for num in range(M, N + 1):
    if num == 1:
        continue
    result = is_prime(num)
    if result:
        prime_nums.append(num)

for prime_num in prime_nums:
    print(prime_num)