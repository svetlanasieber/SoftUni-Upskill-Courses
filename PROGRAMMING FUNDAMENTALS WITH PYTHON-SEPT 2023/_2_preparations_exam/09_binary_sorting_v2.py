import itertools

zeros_count = int(input())
ones_count = int(input())
n = int(input())

number = '0' * zeros_count + '1' * ones_count
permutations = list(sorted(set(itertools.permutations(number, len(number)))))
print(''.join(permutations[n-1]))