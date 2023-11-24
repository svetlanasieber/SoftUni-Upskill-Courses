def rotate_matrix(matrix):
    new_matrix = []
    for row in zip(*matrix):
        new_matrix.append(list(row))
    rotated_matrix = []
    for row in new_matrix:
        rotated_matrix.append(row[::-1])
    return rotated_matrix


rows = int(input())
matrix = []

for row in range(rows):
    matrix.append(input().split(' '))

result = rotate_matrix(matrix)
for row in result:
    print(*row)