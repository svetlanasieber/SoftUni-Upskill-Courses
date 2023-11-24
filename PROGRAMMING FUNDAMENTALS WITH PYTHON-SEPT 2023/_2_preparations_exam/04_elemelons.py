def is_in_direct_sight(layer, l, row, r, col, c):
    if l == layer and r == row and c == col + 1:
        return True
    elif l == layer and r == row and c == col - 1:
        return True
    elif l == layer and r == row - 1 and c == col:
        return True
    elif l == layer and r == row + 1 and c == col:
        return True
    elif l == layer - 1 and r == row and c == col:
        return True
    elif l == layer + 1 and r == row and c == col:
        return True


def morph(matrix, l, r, c):
    order = {
        'W': 'E',
        'E': 'F',
        'F': 'A',
        'A': 'W',
    }

    for melon, change in order.items():
        if matrix[r][l][c] == melon:
            matrix[r][l][c] = change
            break


def harvest(matrix, layer, row, col):
    for l, layer_list in enumerate(matrix):
        for r, row_list in enumerate(layer_list):
            for c, col_str in enumerate(row_list):
                if not is_in_direct_sight(layer, l, row, r, col, c):
                    morph(matrix, l, r, c)


size = int(input())
matrix = [input().split(' | ') for _ in range(size)]

for index, layer in enumerate(matrix):
    for i, el in enumerate(layer):
        matrix[index][i] = el.split()


command = input()
while not command == 'Melolemonmelon':
    layer, row, col = list(map(int, command.split()))
    matrix[row][layer][col] = '0'
    harvest(matrix, layer, row, col)

    command = input()


for index, layer in enumerate(matrix):
    for i, row in enumerate(layer):
        matrix[index][i] = ' '.join(map(str, row))
    print(' | '.join(map(str, layer)))