rows = int(input())

for row in range(rows, 0, -1):
    for col in range(1, row + 1):
        print(col, end='')
    for col in range(row - 1, 0, -1):
        print(col, end='')

    print()
    print(' ' * (rows - row + 1), end='')