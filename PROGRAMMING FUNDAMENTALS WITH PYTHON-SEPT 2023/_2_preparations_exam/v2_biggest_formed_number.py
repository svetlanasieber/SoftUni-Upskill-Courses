from itertools import permutations


def biggest_number(numbers):
    result = []
    for i in permutations(numbers, len(numbers)):
        result.append(''.join(map(str, i)))
    return max(result)


numbers = [int(x) for x in input().split(' ')]
print(biggest_number(numbers))