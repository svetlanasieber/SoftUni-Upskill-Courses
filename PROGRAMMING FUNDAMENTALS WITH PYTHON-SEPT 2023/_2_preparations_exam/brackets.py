from collections import deque
parantheses = deque([el for el in input()])

max_streak = 0
streak = 0
for par in parantheses:
    if par == "(" and streak % 2 == 0:
        streak += 1
        continue
    if par == ")" and streak % 2 == 1:
        streak += 1
        if max_streak < streak:
            max_streak = streak
        continue

    if par == ")" and streak % 2 == 0:
        if streak > max_streak:
            max_streak = streak
            streak += 1
    if par =="(" and streak % 2 == 1:
        if streak > max_streak:
            max_streak = streak
            streak = 1

if max_streak % 2 == 1:
    print(max_streak -1)
else: print(max_streak)