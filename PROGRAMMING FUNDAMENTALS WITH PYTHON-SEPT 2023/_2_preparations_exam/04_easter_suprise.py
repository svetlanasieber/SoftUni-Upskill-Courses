def is_valid(curr_row, curr_col, change_row, change_col, matrix, initial_symbol):
    return 0 <= curr_row + change_row < rows_count and \
           0 <= curr_col + change_col < cols_count and \
           matrix[curr_row+change_row][curr_col+change_col] == initial_symbol


def traverse(curr_row, curr_col, initial_pos, directions, matrix, initial_symbol, found_egg_symbol):
    for dir in directions:
        change_row, change_col = directions[dir][0], directions[dir][1]
        if is_valid(curr_row, curr_col, change_row, change_col, matrix, initial_symbol):
            matrix[curr_row+change_row][curr_col+change_col] = found_egg_symbol
            traverse(curr_row+change_row, curr_col+change_col, initial_pos, directions, matrix, initial_symbol, found_egg_symbol)


rows_count, cols_count = list(map(int, input().split()))
matrix = [input().split() for _ in range(rows_count)]
found_egg_symbol = input()
initial_pos = list(map(int, input().split()))
initial_symbol = matrix[initial_pos[0]][initial_pos[1]]

directions = {
    'up': (-1, 0),
    'down': (1, 0),
    'left': (0, -1),
    'right': (0, 1),
}


matrix[initial_pos[0]][initial_pos[1]] = found_egg_symbol
traverse(initial_pos[0], initial_pos[1], initial_pos, directions, matrix, initial_symbol, found_egg_symbol)


[print(''.join(row)) for row in matrix]