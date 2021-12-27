# 주사위 게임
# 같은 눈 3개 :: 10,000원 + 주사위 눈 * 1,000
# 같은 눈 2개 :: 1,000원  + 주사위 눈 * 1,000
# 같은 눈 1개 ::            주사위 눈 * 100

# 첫 줄 :: 참여자,  다음 줄부터 3개씩 입력
# 입력
# 3
# 3 3 6
# 2 2 2
# 6 2 5

# 가장 많은 상금 출력
# 출력
# 12000

#####

def calcScore(member):
    totalScore = 0

    member.sort()
    bicCount = 0
    count = 0
    bicNum = 0
    preNum = 0
    for num in member:
        if preNum != num:
            preNum = num
            count = 0

        count = count + 1
        if count >= bicCount:
            bicNum = num
            bicCount = count

    if bicCount >= 3:
        totalScore = 10000 + (bicNum * 1000)
    elif bicCount == 2:
        totalScore = 1000 + (bicNum * 100)
    else:
        totalScore = bicNum * 100

    return totalScore


n = int(input())
members = []
maxScore = 0
for i in range(n):
    members.append(list(map(int, input().split())))
    score = calcScore(members[i])
    if maxScore < score:
        maxScore = score

print(maxScore)
