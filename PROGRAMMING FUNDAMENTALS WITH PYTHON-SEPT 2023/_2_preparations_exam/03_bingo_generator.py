initial_number = input()
first_two_digit_num = int(initial_number[0]+initial_number[2])
second_two_digit_num = int(initial_number[1]+initial_number[3])
ceiling = first_two_digit_num + second_two_digit_num
starting_element = [first_two_digit_num, second_two_digit_num]

generated_numbers = []

while starting_element[0] <= ceiling:
    while starting_element[1] <= ceiling:
        generated_numbers.append(str(starting_element[0])+str(starting_element[1]))
        starting_element[1] += 1
    starting_element[1] = second_two_digit_num
    starting_element[0] += 1


divided_by_12_nums = [num for num in generated_numbers if int(num) % 12 == 0]
divided_by_15_nums = [num for num in generated_numbers if int(num) % 15 == 0]

print(f'Dividing on 12: {" ".join(divided_by_12_nums)}')
print(f'Dividing on 15: {" ".join(divided_by_15_nums)}')

if len(divided_by_12_nums) == len(divided_by_15_nums):
    print('!!!BINGO!!!')
else:
    print('NO BINGO!')