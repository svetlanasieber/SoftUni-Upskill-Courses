import itertools

incomplete_map = input()
stars_count = incomplete_map.count('*')
all_directions = list(itertools.product('SLR', repeat=stars_count))
paths = []


for comb in all_directions:
    temp_map = incomplete_map
    for i in range(stars_count):
        temp_map = temp_map.replace('*', comb[i], 1)

    paths.append(temp_map)


print(len(paths))
[print(path) for path in sorted(paths)]