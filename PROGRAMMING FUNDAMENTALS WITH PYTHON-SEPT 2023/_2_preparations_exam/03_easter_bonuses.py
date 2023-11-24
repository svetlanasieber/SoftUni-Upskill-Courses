all_workers_bonuses_sum = 0

line = input()
while not line == 'stop':
    name = line
    tasks = list(map(int, input().split(', ')))
    bonuses = []

    for i in range(len(tasks)):
        bonus = 1
        for task in tasks[:i]:
            bonus *= task
        for task in tasks[i+1:]:
            bonus *= task

        bonuses.append(bonus)

    bonuses_sum = sum(bonuses)
    all_workers_bonuses_sum += bonuses_sum
    print(f'{name} has a bonus of {bonuses_sum} lv.')
    line = input()

print(f'The amount of all bonuses is {all_workers_bonuses_sum} lv.')