import re

pattern = re.compile(r"\|([A-Z]{4,})\|\:\#([A-Za-z]+\ [A-Za-z]+)\#")

n = int(input())

for _ in range(n):
    check = input()
    match = pattern.findall(check)
    if match:
        match = match[0]
        name, title = match[0], match[1]
        print(f"{name}, The {title}")
        print(f">> Strength: {len(name)}")
        print(f">> Armor: {len(title)}")
    else:
        print("Access denied!")