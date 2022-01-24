'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : <<골드바흐의 추측>>
  link  : <<https://www.acmicpc.net/problem/9020>>
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


prime_nums = get_prime_nums(2, 10000)

testCnt = int(input())
for i in range(testCnt):
    n = int(input())
    half_n = int(n / 2)
    if half_n in prime_nums:
        print(f"{half_n} {half_n}")
    else:
        for i in range(half_n, 1, -1):
            if i in prime_nums:
                if (n - i) in prime_nums:
                    print(f"{i} {n - i}")
                    break
