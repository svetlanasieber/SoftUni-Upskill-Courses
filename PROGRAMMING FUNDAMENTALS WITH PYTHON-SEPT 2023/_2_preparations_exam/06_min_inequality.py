import itertools

combinations_list_len = int(input())
first_list_len = int(input())
first_list = [int(input()) for _ in range(first_list_len)]
combinations = [comb for comb in itertools.combinations(first_list, combinations_list_len)]

differences = [max(comb) - min(comb) for comb in combinations]
print(min(differences))