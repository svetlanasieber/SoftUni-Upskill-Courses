control_number = int(input())
sum_of_numbers = 0
# Докато сумата на числата е по-малка на контролното число
while sum_of_numbers < control_number:
    current_number = int(input())
    sum_of_numbers += current_number
print(sum_of_numbers)