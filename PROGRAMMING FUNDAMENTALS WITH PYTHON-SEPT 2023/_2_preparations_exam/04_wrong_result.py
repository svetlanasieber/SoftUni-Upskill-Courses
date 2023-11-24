def calculate_value(cube, curr_layer, curr_row, curr_col, incorrect_values_indexes):
    value = 0

    for i in range(-1, 2):
        if 0 <= curr_layer + i < len(cube) and [curr_layer + i, curr_row, curr_col] not in incorrect_values_indexes:
            value += cube[curr_layer + i][curr_row][curr_col]
        if 0 <= curr_row + i < len(cube) and [curr_layer, curr_row + i, curr_col] not in incorrect_values_indexes:
            value += cube[curr_layer][curr_row + i][curr_col]
        if 0 <= curr_col + i < len(cube) and [curr_layer, curr_row, curr_col + i] not in incorrect_values_indexes:
            value += cube[curr_layer][curr_row][curr_col + i]

    return value


size = int(input())
cube = [input().split(' | ') for _ in range(size)]

for i in range(size):
    for j in range(size):
        cube[i][j] = list(map(int, cube[i][j].split()))


incorrect_row, incorrect_layer, incorrect_col = list(map(int, input().split()))
incorrect_value = cube[incorrect_layer][incorrect_row][incorrect_col]
incorrect_values_indexes = []


for i in range(size):
    for j in range(size):
        for k in range(size):
            if cube[i][j][k] == incorrect_value:
                incorrect_values_indexes.append([i, j, k])


for incorrect_el in incorrect_values_indexes:
    new_value = calculate_value(cube, incorrect_el[0], incorrect_el[1], incorrect_el[2], incorrect_values_indexes)
    cube[incorrect_el[0]][incorrect_el[1]][incorrect_el[2]] = new_value


print(f'Wrong values found and replaced: {len(incorrect_values_indexes)}')

for i in range(size):
    for layer in cube:
        print(' '.join(map(str, layer[i])))