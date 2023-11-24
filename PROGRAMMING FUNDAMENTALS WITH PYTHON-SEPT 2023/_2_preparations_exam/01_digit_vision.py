import itertools

first_digit = input()
second_digit = input()
third_digit = input()

sum_of_digits = sum([int(first_digit), int(second_digit), int(third_digit)])
all_numbers_from_digits = [''.join(perm) for perm in itertools.permutations(first_digit+second_digit+third_digit)]


for num in all_numbers_from_digits:
    num = int(num)
    if sum_of_digits and num % sum_of_digits == 0:
        print('Digitivision successful!')
        break
else:
    print('No digitivision possible.')