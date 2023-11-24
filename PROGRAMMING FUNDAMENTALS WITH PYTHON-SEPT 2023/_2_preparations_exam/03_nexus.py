first_sequence = list(map(int, input().split()))
second_sequence = list(map(int, input().split()))


line = input()
while not line == 'nexus':
    first_pair, second_pair = line.split('|')
    first_list_index1, second_list_index1 = list(map(int, first_pair.split(':')))
    first_list_index2, second_list_index2 = list(map(int, second_pair.split(':')))

    if first_list_index1 < second_list_index1 \
            and first_list_index2 > second_list_index2 \
            and first_list_index1 < first_list_index2 \
            and second_list_index1 > second_list_index2:

        connected_elements_sum = first_sequence[first_list_index1] + first_sequence[first_list_index2] \
                                 + second_sequence[second_list_index1] + second_sequence[second_list_index2]

        first_sequence = first_sequence[:first_list_index1] + first_sequence[first_list_index2+1:]
        first_sequence = [el + connected_elements_sum for el in first_sequence]

        second_sequence = second_sequence[:second_list_index2] + second_sequence[second_list_index1+1:]
        second_sequence = [el + connected_elements_sum for el in second_sequence]

    elif first_list_index1 > second_list_index1 \
            and first_list_index2 < second_list_index2 \
            and first_list_index2 < first_list_index1 \
            and second_list_index1 < second_list_index2:

        connected_elements_sum = first_sequence[first_list_index1] + first_sequence[first_list_index2] \
                                 + second_sequence[second_list_index1] + second_sequence[second_list_index2]

        first_sequence = first_sequence[:first_list_index2] + first_sequence[first_list_index1 + 1:]
        first_sequence = [el + connected_elements_sum for el in first_sequence]

        second_sequence = second_sequence[:second_list_index1] + second_sequence[second_list_index2 + 1:]
        second_sequence = [el + connected_elements_sum for el in second_sequence]

    line = input()


print(', '.join(map(str, first_sequence)))
print(', '.join(map(str, second_sequence)))