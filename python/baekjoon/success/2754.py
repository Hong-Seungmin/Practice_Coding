# 학점계산

# A+: 4.3, A0: 4.0, A-: 3.7
# B+: 3.3, B0: 3.0, B-: 2.7
# C+: 2.3, C0: 2.0, C-: 1.7
# D+: 1.3, D0: 1.0, D-: 0.7
# F: 0.0

# 첫째 줄에 성적 입력
# 입력
# A0

# 평점
# 출력
# 4.0

#####

grade = input()
point = 0.0

if grade[0] == 'F':
    point = 0.0
else:
    if grade[0] == 'A':
        point = 4.0
    elif grade[0] == 'B':
        point = 3.0
    elif grade[0] == 'C':
        point = 2.0
    elif grade[0] == 'D':
        point = 1.0

    if grade[1] == '+':
        point = point + 0.3
    elif grade[1] == '-':
        point = point - 0.3

print(point)