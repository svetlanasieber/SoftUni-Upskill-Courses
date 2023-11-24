def get_minimum_operations(first, second):
    count = 0
    i = len(first) - 1
    j = i

    while i >= 0:
        while i >= 0 and not first[i] == second[j]:
            i -= 1
            count += 1

        i -= 1
        j -= 1

    return count


shuffled_name = input()
name = input()


if not len(shuffled_name) == len(name):
    print('The name cannot be transformed!')
else:
    min_operations = get_minimum_operations(shuffled_name, name)
    print(f'The minimum operations required to convert "{shuffled_name}" '
          f'to "{name}" are {min_operations}')