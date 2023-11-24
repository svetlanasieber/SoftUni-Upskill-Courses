from collections import deque


def can_jump(new_row, new_col, rows_count, field):
    return 0 <= new_row < rows_count and field[new_row][new_col] == '-'


def search_matrix(rows_count, cols_count, field):
    for row in range(rows_count):
        for col in range(cols_count):
            if field[row][col] == 'S':
                return [row, col]


rows_count, cols_count = list(map(int, input().split()))
field = [list(input()) for _ in range(rows_count)]
commands_count = int(input())
player_position = search_matrix(rows_count, cols_count, field)
total_jumps = 0


for _ in range(commands_count):
    row_i, steps = list(map(int, input().split()))
    row = deque(field[row_i])
    if '-' in row:
        row.rotate(steps)
        field[row_i] = list(row)
        new_row = player_position[0] - 1
        new_col = player_position[1]

        if can_jump(new_row, new_col, rows_count, field):
            player_position = [new_row, new_col]
            total_jumps += 1


initial_pos = search_matrix(rows_count, cols_count, field)
field[initial_pos[0]][initial_pos[1]] = '0'
field[player_position[0]][player_position[1]] = 'S'

if 'S' in field[0]:
    print('Win')
else:
    print('Lose')

print(f'Total Jumps: {total_jumps}')
[print(''.join(row)) for row in field]