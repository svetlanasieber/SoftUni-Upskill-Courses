cols_count = int(input())
rows_count = cols_count + cols_count // 2

classroom_list = ['.' for _ in range(cols_count) for _ in range(rows_count)]

for i in range(0, len(classroom_list), 4):
    classroom_list[i] = '#'


classroom_matrix = []
for i in range(rows_count):
    classroom_matrix += [classroom_list[i:i + cols_count]]


[print(''.join(row)) for row in classroom_matrix]