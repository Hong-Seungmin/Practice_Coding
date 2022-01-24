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


def get_prime_nums(M, N):
    prime_nums = []
    for num in range(M, N + 1):
        if num == 1:
            continue
        result = is_prime(num)
        if result:
            prime_nums.append(num)

    return prime_nums


prime_nums = get_prime_nums(2, 246912)

while True:
    n = int(input())
    if n == 0:
        break
    cnt = 0
    for i in prime_nums:
        if n < i <= n * 2:
            cnt += 1
    print(cnt)
