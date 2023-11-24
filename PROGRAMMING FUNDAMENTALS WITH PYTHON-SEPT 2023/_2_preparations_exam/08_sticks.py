import itertools
from copy import deepcopy


def print_result(unique_permutations):
    result = []
    for perm in list(sorted(unique_permutations)):
        pair_list = []
        for pair in perm:
            pair_str = f'|{pair[0]}-{pair[1]}|'
            pair_list.append(pair_str)
        result.append(' # '.join(pair_list))

    print(len(unique_permutations))
    [print(line) for line in result]


sticks_count = int(input())
all_sizes = []

for _ in range(sticks_count):
    size = tuple(input().split())
    all_sizes.append(size)

permutations = list(itertools.permutations(all_sizes, sticks_count))


all_sizes_copy = deepcopy(all_sizes)
for index, pair in enumerate(all_sizes_copy):
    reversed_pair = all_sizes_copy[index][::-1]
    temp_sizes_list = all_sizes_copy[:index] + [reversed_pair] + all_sizes_copy[index + 1:]
    permutations.extend(list(itertools.permutations(temp_sizes_list, sticks_count)))


unique_permutations = set(permutations)
print_result(unique_permutations)