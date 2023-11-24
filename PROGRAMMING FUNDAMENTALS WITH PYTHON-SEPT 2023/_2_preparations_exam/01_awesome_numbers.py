number_to_classify = int(input())
fav_number = int(input())

conditions = [
    number_to_classify % 2 == 1,
    number_to_classify < 0,
    number_to_classify % fav_number == 0,
]

satisfied_conditions_count = [cond for cond in conditions if cond]


if not any(conditions):
    print('boring')
elif len(satisfied_conditions_count) == 1:
    print('awesome')
elif len(satisfied_conditions_count) == 2:
    print('super awesome')
else:
    print('super special awesome')