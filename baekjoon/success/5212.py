'''
author : Hong Seungmin
github : https://github.com/HongSeumgMin
email  : globalsh1@gmail.com

==Baekjoon Online Judge==
  title : 지구 온난화
  link  : https://www.acmicpc.net/problem/5212
'''

#####

import copy

board = []
yNum, xNum = 0, 0


def near(y, x):
    result = board[y][x]
    count = 0

    if y != 0:
        if board[y - 1][x] == '.':
            count += 1

    if y != yNum - 1:
        if board[y + 1][x] == '.':
            count += 1
    if x != 0:
        if board[y][x - 1] == '.':
            count += 1
    if x != xNum - 1:
        if board[y][x + 1] == '.':
            count += 1

    if y == 0 or y == yNum - 1:
        count += 1
    if x == 0 or x == xNum - 1:
        count += 1

    if count >= 3:
        result = '.'

    return result


def clear_board(board):
    newBoard = []
    result = []
    rowCount = 0

    for row in board:
        if 'X' in row:
            newBoard.append(row)
            rowCount += 1

    minRow = xNum - 1
    maxRow = 0
    for y in range(rowCount):
        for x in range(xNum):
            if newBoard[y][x] in 'X':
                if minRow > x:
                    minRow = x
                    break

    for y in range(rowCount):
        for x in range(xNum - 1, -1, -1):
            if newBoard[y][x] in 'X':
                if maxRow < x:
                    maxRow = x
                    break

    for y in range(rowCount):
        col = []
        for x in range(minRow, maxRow + 1, 1):
            col.append(newBoard[y][x])
        result.append(col)

    return result


def main():
    global board, yNum, xNum

    yNum, xNum = map(int, input().split())

    board = [input() for _ in range(yNum)]
    newBoard = [['.' for _ in range(xNum)] for _ in range(yNum)]

    for y in range(yNum):
        for x in range(xNum):
            newBoard[y][x] = near(y, x)

    newBoard = clear_board(newBoard)

    for row in newBoard:
        for cell in row:
            print(cell, end='')
        print('')


main()
